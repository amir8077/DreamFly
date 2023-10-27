package com.DreamFly.DreamFly.serviecs_interface;

import com.DreamFly.DreamFly.entities.Reservation;

import java.util.List;

public interface ReservationService {

    Reservation createReservation(Reservation reservation);

    Reservation updateReservation(Reservation reservation);

    Reservation getReservationById(Long reservationId);

    void deleteReservation(Long reservationId);

    List<Reservation> getAllReservations();

    // Add other reservation-related service methods as needed
}

