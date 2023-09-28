package com.voyager.springbootstarterapp.systemdesign.flight_tickets.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SagaRequest {
    private Long ticketId;
    private Long paymentId;
    // Other relevant fields
}