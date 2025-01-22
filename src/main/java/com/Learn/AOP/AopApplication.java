package com.Learn.AOP;

import com.Learn.AOP.config.BeanConfig;
import com.Learn.AOP.service.impl.PaymentServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		PaymentServiceImpl paymentService = context.getBean(PaymentServiceImpl.class);
		paymentService.makePayment();
	}

}
