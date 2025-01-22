package com.Learn.AOP.service.impl;

import com.Learn.AOP.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void makePayment() {
        //
        //
        //
        System.out.println("amount debited");
        //
        //
        //
        System.out.println("amount credited");
        //
        //
        //
    }
}
