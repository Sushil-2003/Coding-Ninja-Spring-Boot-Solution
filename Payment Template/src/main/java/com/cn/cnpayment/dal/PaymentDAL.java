package com.cn.cnpayment.dal;

import com.cn.cnpayment.entity.Payment;

import java.util.List;

public interface PaymentDAL {

	// This method fetches the payment entity from the database for a specific id.
	Payment getById(int id);


	// This method fetches the list of payments from the database.
	List<Payment> getAllPayments();


	// This method fetches the list of payments from the database based on the paymentType received.
	List<Payment> getByPaymentType(String paymentType);


	// This method fetches the list of payments from the database based on the keyword received.
	List<Payment> getByPaymentDescription(String keyword);


	// This method saves a payment entity into the database.
	void addPayment(Payment payment);

}
