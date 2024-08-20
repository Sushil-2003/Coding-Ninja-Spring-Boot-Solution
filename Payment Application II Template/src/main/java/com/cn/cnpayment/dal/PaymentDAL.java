package com.cn.cnpayment.dal;

import com.cn.cnpayment.entity.Payment;

import java.util.List;

public interface PaymentDAL {

	Payment getById(int id);

	List<Payment> getAllPayments();

	List<Payment> getByPaymentType(String paymentType);

	List<Payment> getByPaymentDescription(String keyword);

    void addPayment(Payment payment);

	// It deletes a payment record from the database.
	void delete(int paymentId);

	//  It updates a payment record in the database.
	void update(Payment updatePayment);

	//  It updates the payment description for a specific ID.
	void updateDescription(int paymentId, String description);

}
