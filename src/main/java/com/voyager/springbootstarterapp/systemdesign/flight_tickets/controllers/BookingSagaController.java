package com.voyager.springbootstarterapp.systemdesign.flight_tickets.controllers;

import com.voyager.springbootstarterapp.systemdesign.flight_tickets.DTOs.*;
import com.voyager.springbootstarterapp.systemdesign.flight_tickets.entities.*;
import com.voyager.springbootstarterapp.systemdesign.flight_tickets.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sagas")
public class BookingSagaController {
    @Autowired
    private BookingSagaService sagaService;

    @PostMapping
    public BookingSagaState initiateSaga(@RequestBody SagaRequest request) {
        return sagaService.initiateSaga(request);
    }

    // Other endpoints for CRUD operations
}