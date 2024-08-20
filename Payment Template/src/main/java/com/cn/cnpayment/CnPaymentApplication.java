package com.cn.cnpayment;

import com.cn.cnpayment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CnPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CnPaymentApplication.class, args);

	}
}
