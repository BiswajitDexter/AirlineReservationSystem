package com.ARS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ARS.Entity.Payment;
import com.ARS.Service.PaymentService;


@RestController
@RequestMapping("/api/v1/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    // Get all payments
    @GetMapping("/payments")
    public String getPayments(Model model) {
        model.addAttribute("payments", paymentService.getAllPayments());
        return "payments";
    }

    // Process a new payment
    @PostMapping
    public ResponseEntity<Payment> processPayment(@RequestBody Payment paymentRequest) {
        Payment processedPayment = paymentService.processPayment(paymentRequest);
        return ResponseEntity.ok(processedPayment);
    }

    // Refund a payment
    @DeleteMapping("/{id}/refund")
    public ResponseEntity<String> refundPayment(@PathVariable Long id) {
        paymentService.refundPayment(id);
        return ResponseEntity.ok("Payment refunded successfully.");
    }
}
