package com.DreamFly.DreamFly.repositories;
import com.DreamFly.DreamFly.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
    // You can add custom query methods here if needed
}

