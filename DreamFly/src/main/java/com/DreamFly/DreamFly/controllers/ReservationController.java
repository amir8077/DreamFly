package com.DreamFly.DreamFly.controllers;
import com.DreamFly.DreamFly.entities.Reservation;
import com.DreamFly.DreamFly.serviecs_interface.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationService.createReservation(reservation);
    }

    @PutMapping("/{reservationId}")
    public Reservation updateReservation(@PathVariable Long reservationId, @RequestBody Reservation reservation) {
        reservation.setId(reservationId);
        return reservationService.updateReservation(reservation);
    }

    @GetMapping("/{reservationId}")
    public Reservation getReservationById(@PathVariable Long reservationId) {
        return reservationService.getReservationById(reservationId);
    }

    @DeleteMapping("/{reservationId}")
    public void deleteReservation(@PathVariable Long reservationId){

    }

}