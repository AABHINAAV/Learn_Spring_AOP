package com.Learn.AOP.aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    //    @Before("execution(* com.Learn.AOP.service.impl.PaymentServiceImpl.*)") // will work for all methods
    @Before("execution(* com.Learn.AOP.service.impl.PaymentServiceImpl.before_makePayment_after(..))")
    public void printBefore() {
        System.out.println("payment started ...");
    }

//    @After("execution(* com.Learn.AOP.service.impl.PaymentServiceImpl.*)") // will work for all methods
    @After("execution(* com.Learn.AOP.service.impl.PaymentServiceImpl.before_makePayment_after(..))")
    public void printAfter() {
        System.out.println("payment finished ...");
    }
}
