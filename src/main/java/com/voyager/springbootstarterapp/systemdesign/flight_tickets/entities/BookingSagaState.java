package com.voyager.springbootstarterapp.systemdesign.flight_tickets.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "booking_saga_state")
public class BookingSagaState {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sagaId;
    private String status;

    @OneToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;
}
