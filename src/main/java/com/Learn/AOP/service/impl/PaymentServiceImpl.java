package com.Learn.AOP.service.impl;

import com.Learn.AOP.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void before_makePayment_after(int amount) {
        System.out.println("amount debited : " + amount);
        //
        //
        //
        System.out.println("amount credited: " + amount);
    }

    @Override
    public void makePayment_around(int amount) {
        System.out.println("amount debited : " + amount);
        //
        //
        //
        System.out.println("amount credited: " + amount);
    }
}
