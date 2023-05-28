package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.PenDao;
import com.jsp.dto.Pen;

@Component
public class PenService {
	
	@Autowired
	PenDao penDao;
	
	public Pen savePen(Pen pen) {
		return penDao.savePen(pen);
	}
	
	public List<Pen> getAllPen(){
		return penDao.getAllPen();
	} 
	
	public boolean deletePen(int id) {
		return penDao.deletePen(id);	
	}
	
	public Pen updatePenName(int id,String name) {
		Pen pen = penDao.getPenById(id);
		pen.setName(name);
		Pen pen2 = penDao.updatePen(pen);
		if(pen2!=null) {
			return pen2;
		}else {
			return null;
		}
	}
	
	public Pen updatePenBrand(int id,String Brand) {
		Pen pen = penDao.getPenById(id);
		pen.setBrand(Brand);
		Pen pen2 = penDao.updatePen(pen);
		if(pen2!=null) {
			return pen2;
		}else {
			return null;
		}
	}
    
}
