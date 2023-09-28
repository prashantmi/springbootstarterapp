package com.voyager.springbootstarterapp.systemdesign.flight_tickets.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;
    private String status;
    private Double amount;

    @OneToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;
}
