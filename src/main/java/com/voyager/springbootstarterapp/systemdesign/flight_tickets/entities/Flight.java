package com.voyager.springbootstarterapp.systemdesign.flight_tickets.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long flightId;
    private String origin;
    private String destination;
    private int totalSeats;

    @OneToMany(mappedBy = "flight")
    private List<Leg> legs;
}



