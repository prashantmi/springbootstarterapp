package com.voyager.springbootstarterapp.systemdesign.flight_tickets.controllers;

import com.voyager.springbootstarterapp.systemdesign.flight_tickets.DTOs.*;
import com.voyager.springbootstarterapp.systemdesign.flight_tickets.entities.*;
import com.voyager.springbootstarterapp.systemdesign.flight_tickets.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @GetMapping("/{id}")
    public Notification getNotification(@PathVariable Long id) {
        return notificationService.findById(id);
    }

    // Other endpoints for CRUD operations
}