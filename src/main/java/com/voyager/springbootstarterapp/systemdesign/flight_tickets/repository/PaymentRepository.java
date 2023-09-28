package com.voyager.springbootstarterapp.systemdesign.flight_tickets.repository;

import com.voyager.springbootstarterapp.systemdesign.flight_tickets.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    // Custom query methods if needed
}