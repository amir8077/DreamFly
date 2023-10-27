package com.DreamFly.DreamFly.repositories;
import com.DreamFly.DreamFly.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    // You can add custom query methods here if needed
}
