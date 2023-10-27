package com.DreamFly.DreamFly.repositories;
import com.DreamFly.DreamFly.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    // You can add custom query methods here if needed
}

