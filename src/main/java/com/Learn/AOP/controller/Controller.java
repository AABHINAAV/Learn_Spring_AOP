package com.Learn.AOP.controller;

import com.Learn.AOP.service.impl.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private PaymentServiceImpl paymentService;

    @GetMapping("/before_after")
    public void aspect_before_after() {
        this.paymentService.before_makePayment_after(123);
    }

    @GetMapping("/around")
    public void aspect_around() {
        this.paymentService.makePayment_around(123);
    }
}
