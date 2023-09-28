package com.voyager.springbootstarterapp.systemdesign.flight_tickets.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;
    private String passengerName;
    private String seatNumber;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    @ManyToOne
    @JoinColumn(name = "leg_id")
    private Leg leg;

    // Other relations like Payments, Notifications, etc.
}
