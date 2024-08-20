package com.cn.cnpayment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cn.cnpayment.entity.Payment;
import com.cn.cnpayment.service.PaymentService;
import java.util.List;

 /**
  # Complete the PaymentController class, methods to handle HTTP requests with
  required annotations for the following APIs: **/
@RestController
@RequestMapping("/payment")
public class PaymentController {

	// Add proper annotation for auto-wiring PaymentService object.
	@Autowired
	PaymentService paymentService;


	// a. GET "/payment/id/{id}" : It retrieves a specific payment by id.
	@GetMapping("/id/{id}")
	public Payment getPaymentById(@PathVariable int id)
	{
	// 1. Call the required service method
	// 2. Add proper annotation for Get Mapping and attach the path variable to the method parameter.
		return paymentService.getPaymentById(id);
	}


	// b. GET "/payment/allPayments" : It retrieves a list of all payments.
	@GetMapping("/allPayments")
	public List<Payment> getAllPayments()
	{
	// 1. Call the required service method.
	// 2. Add proper annotation for Get Mapping.
		return paymentService.getAllPayments();
	}


	// c. GET "/payment/paymentType/{paymentType}" : It retrieves a payment by type.
	@GetMapping("/paymentType/{paymentType}")
	public List<Payment> getPaymentByPaymentType(@PathVariable String paymentType)
	{
	// 1. Call the required service method.
	// 2. Add proper annotation for Get Mapping, attach path variable to the method parameter.
		return paymentService.getPaymentByPaymentType(paymentType);
	}


	// d. GET "/payment/description/{keyword}" : It retrieves a payment by description keyword.
	@GetMapping("/description/{keyword}")
	public List<Payment> getPaymentByDescriptionKeyword(@PathVariable String keyword)
	{
	// 1. Call the required service method.
	// 2. Add proper annotation for Get Mapping, attach path variable to the method parameter.
		return paymentService.getPaymentByDescriptionKeyword(keyword);
	}


	// e. POST "/payment/save" (Body: Payment Object) : It saves a new payment.
	@PostMapping("/save")
	public void addPayment(@RequestBody Payment payment){
	// 1. Call the required service method.
	// 2. Add proper annotation for Post Mapping and request body.
		paymentService.addPayment(payment);
	}



}
