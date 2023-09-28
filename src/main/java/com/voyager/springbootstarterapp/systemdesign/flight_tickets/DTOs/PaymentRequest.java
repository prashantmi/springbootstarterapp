package com.voyager.springbootstarterapp.systemdesign.flight_tickets.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequest {
    private Long ticketId;
    private Double amount;
    private String paymentMethod;
    // Other relevant fields
}
