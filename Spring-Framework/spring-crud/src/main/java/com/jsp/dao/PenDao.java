package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dto.Pen;

@Component
public class PenDao {
	
	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	public Pen savePen(Pen pen) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(pen);
		entityTransaction.commit();
		return pen;
	}
	
	public List<Pen> getAllPen(){
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql="select s from Pen s";
		Query query = entityManager.createQuery(sql);
		List<Pen> pens = query.getResultList();
		return pens;
	}
	
	public boolean deletePen(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Pen pen = entityManager.find(Pen.class, id);
		if(pen!=null) {
			entityManager.remove(pen);
			return true;
		}else {
			return false;
		}
	}
	
	public Pen updatePen(Pen pen) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.merge(pen);
		entityTransaction.commit();
		
		return pen;
	}
	
	public Pen getPenById(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Pen.class, id);
	   
	}

}
