package com.cn.cnpayment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cn.cnpayment.entity.Payment;
import com.cn.cnpayment.service.PaymentService;
import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	PaymentService paymentService;

	@GetMapping("/id/{id}")
	public Payment getPaymentById(@PathVariable int id)
	{
		return paymentService.getPaymentById(id);
	}

	@GetMapping("/allPayments")
	public List<Payment> getAllPayments()
	{
		return paymentService.getAllPayments();
	}

	@GetMapping("/paymentType/{paymentType}")
	public List<Payment> getPaymentByPaymentType(@PathVariable String paymentType)
	{
		return paymentService.getPaymentByPaymentType(paymentType);
	}

	@GetMapping("/description/{keyword}")
	public List<Payment> getPaymentByDescriptionKeyword(@PathVariable String keyword)
	{
		return paymentService.getPaymentByDescriptionKeyword(keyword);
	}

	@PostMapping("/save")
	public void addPayment(@RequestBody Payment payment){
		 paymentService.addPayment(payment);
	}


	// a. DELETE "/payment/delete/id/{id}": It deletes a payment record from the database.
	@DeleteMapping("/delete/id/{id}")
	public void deletePayment(@PathVariable int id)
	{
		// 1. Call the required service method.
		// 2. Add proper annotation for DELETE mapping and attach the path variable to the method parameter.
		paymentService.delete(id);
	}

	// b. PUT "/payment/update": It updates a payment record in the database.
	@PutMapping("/update")
	public void updatePayment(@RequestBody Payment payment)
	{
		// 1. Call the required service method
		// 2. Add proper annotation for PUT Mapping and attach the required request body.
		paymentService.update(payment);
	}


	// c. PUT "/payment/update/{id}/description/{description}": It updates the payment description for a specific ID.
	@PutMapping("/update/{id}/description/{description}")
	public void updateDescription(@PathVariable("id") int id, @PathVariable("description") String description)
	{
		// 1. Call the required service method
		// 2. Add proper annotation for PUT Mapping and attach the required path variables to the method parameter.
		paymentService.updateDescription(id, description);
	}


}
