package com.aop.spring_aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.spring_aop.service.PaymentService;
import com.aop.spring_aop.service.PaymentServiceImp;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
        PaymentServiceImp paymentService = (PaymentServiceImp) applicationContext.getBean("payment");
        paymentService.makePayment(53);
    }
}
