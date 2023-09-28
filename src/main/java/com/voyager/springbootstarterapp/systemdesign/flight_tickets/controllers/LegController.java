package com.voyager.springbootstarterapp.systemdesign.flight_tickets.controllers;

import com.voyager.springbootstarterapp.systemdesign.flight_tickets.DTOs.*;
import com.voyager.springbootstarterapp.systemdesign.flight_tickets.entities.*;
import com.voyager.springbootstarterapp.systemdesign.flight_tickets.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/legs")
public class LegController {
    @Autowired
    private LegService legService;

    @GetMapping("/{id}")
    public Leg getLegById(@PathVariable Long id) {
        return legService.findById(id);
    }

    // Other endpoints for CRUD operations
}