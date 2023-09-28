package com.voyager.springbootstarterapp.systemdesign.flight_tickets.controllers;

import com.voyager.springbootstarterapp.systemdesign.flight_tickets.DTOs.*;
import com.voyager.springbootstarterapp.systemdesign.flight_tickets.entities.*;
import com.voyager.springbootstarterapp.systemdesign.flight_tickets.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public Payment initiatePayment(@RequestBody PaymentRequest request) {
        return paymentService.initiatePayment(request);
    }

    // Other endpoints for CRUD operations
}