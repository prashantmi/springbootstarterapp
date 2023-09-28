package com.voyager.springbootstarterapp.systemdesign.flight_tickets.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificationId;
    private String type;
    private String status;

    @OneToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;
}
