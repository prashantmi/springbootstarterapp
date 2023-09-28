package com.voyager.springbootstarterapp.systemdesign.flight_tickets.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TicketRequest {
    private Long flightId;
    private Long legId;
    private String passengerName;
    private String seatClass;
    // Other relevant fields
}