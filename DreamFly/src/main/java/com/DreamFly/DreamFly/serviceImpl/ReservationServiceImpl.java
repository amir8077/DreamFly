package com.DreamFly.DreamFly.serviceImpl;
import com.DreamFly.DreamFly.entities.Reservation;
import com.DreamFly.DreamFly.repositories.ReservationRepository;
import com.DreamFly.DreamFly.serviecs_interface.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation createReservation(Reservation reservation) {
        return null;
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return null;
    }

    @Override
    public Reservation getReservationById(Long reservationId) {
        return null;
    }

    @Override
    public void deleteReservation(Long reservationId) {

    }

    @Override
    public List<Reservation> getAllReservations() {
        return null;
    }
}