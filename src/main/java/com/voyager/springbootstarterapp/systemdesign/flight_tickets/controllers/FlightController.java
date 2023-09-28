package com.voyager.springbootstarterapp.systemdesign.flight_tickets.controllers;

import com.voyager.springbootstarterapp.systemdesign.flight_tickets.DTOs.*;
import com.voyager.springbootstarterapp.systemdesign.flight_tickets.entities.*;
import com.voyager.springbootstarterapp.systemdesign.flight_tickets.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable Long id) {
        return flightService.findById(id);
    }

    // Other endpoints for CRUD operations
}