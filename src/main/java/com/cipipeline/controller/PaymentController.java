package com.cipipeline.controller;


import com.cipipeline.payment.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @GetMapping("/{paymentId}")
    public Payment getPayment(@PathVariable int paymentId) {

        return new Payment(
                paymentId,
                "SUCCESS",
                500
        );
    }
}