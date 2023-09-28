package com.voyager.springbootstarterapp.systemdesign.flight_tickets.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "seat_availability")
public class SeatAvailability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seatId;
    private String seatNumber;
    private String status;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    @ManyToOne
    @JoinColumn(name = "leg_id")
    private Leg leg;
}
