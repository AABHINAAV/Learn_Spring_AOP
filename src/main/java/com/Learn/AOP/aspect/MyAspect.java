package com.Learn.AOP.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    //    @Before("execution(* com.Learn.AOP.service.impl.PaymentServiceImpl.*)") // will work for all methods
    @Before("execution(* com.Learn.AOP.service.impl.PaymentServiceImpl.before_makePayment_after(..))")
    public void printBefore() {
        System.out.println("BEFORE : payment started ...");
    }

//    @After("execution(* com.Learn.AOP.service.impl.PaymentServiceImpl.*)") // will work for all methods
    @After("execution(* com.Learn.AOP.service.impl.PaymentServiceImpl.before_makePayment_after(..))")
    public void printAfter() {
        System.out.println("AFTER : payment finished ...");
    }

    @Around("execution(* com.Learn.AOP.service.impl.PaymentServiceImpl.makePayment_around(..))")
    public Object printAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("AROUND : payment started ...");
        //
        // calling logic method
        Object result = joinPoint.proceed();
        //
        //
        System.out.println("AROUND : payment finished ...");

        return result;
    }

    //
    //
    //
    @Pointcut("execution(* com.Learn.AOP.service.impl.PaymentServiceImpl.makePayment_named_pointcut(..))") // the pointcut expression
    private void customNamedPointCutExpression() {}

    @Around("customNamedPointCutExpression()")
    public Object printAround2(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("AROUND : NAMED POINT CUT : payment started ...");
        //
        // calling logic method
        Object result = joinPoint.proceed();
        //
        //
        System.out.println("AROUND : NAMED POINT CUT : payment finished ...");

        return result;
    }
}
