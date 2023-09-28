package com.voyager.springbootstarterapp.systemdesign.flight_tickets.services;

import com.voyager.springbootstarterapp.systemdesign.flight_tickets.DTOs.*;
import com.voyager.springbootstarterapp.systemdesign.flight_tickets.entities.*;
import com.voyager.springbootstarterapp.systemdesign.flight_tickets.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LegService {
    @Autowired
    private LegRepository legRepository;

    public Leg findById(Long id) {
        return legRepository.findById(id).orElse(null);
    }

    // Other CRUD operations
}