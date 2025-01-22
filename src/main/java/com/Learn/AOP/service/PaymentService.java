package com.Learn.AOP.service;

public interface PaymentService {
    public void before_makePayment_after(int amount);
    public void makePayment_around(int amount);
    public void makePayment_named_pointcut(int amount);
}
