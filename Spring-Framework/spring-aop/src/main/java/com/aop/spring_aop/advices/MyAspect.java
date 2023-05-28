package com.aop.spring_aop.advices;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(* com.aop.spring_aop.service.PaymentServiceImp.makePayment(..))")
	//* indicate it works for all access modifier except private
	// if we put * after package name then it works for all the methods present in that class
	//(..) is used when any method have parameters
	public void authoriseUser() {
		System.out.println("Authorisation implement..");
	}
	
	@After("execution(* com.aop.spring_aop.service.PaymentServiceImp.makePayment(..))")
	public void taskCompleted() {
		System.out.println("Transaction completed..");
	}
	
	

}
