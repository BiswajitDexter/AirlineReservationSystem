package com.ARS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ARS.Entity.Payment;
import com.ARS.Entity.Reservation;
import com.ARS.Repository.PaymentRepository;
import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id).orElse(null);
    }

    public void processPayment(Reservation reservationId, Double amount, String paymentMethod) {
        // Here you can add logic to process the payment
        // For now, we will just create a new payment record
        Payment payment = new Payment();
        payment.setReservation(reservationId);
        payment.setAmount(amount);
        payment.setPaymentMethod(paymentMethod);
        payment.setStatus("COMPLETED"); // Assuming payment is successful
        
        savePayment(payment);
    }

	public void refundPayment(Long id) {
	}

	public Payment processPayment(Payment paymentRequest) {
		return paymentRequest;
	}
}