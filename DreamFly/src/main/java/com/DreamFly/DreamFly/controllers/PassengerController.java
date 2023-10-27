package com.DreamFly.DreamFly.controllers;
import com.DreamFly.DreamFly.entities.Passenger;
import com.DreamFly.DreamFly.serviecs_interface.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @PostMapping
    public Passenger createPassenger(@RequestBody Passenger passenger) {
        return passengerService.createPassenger(passenger);
    }

    @PutMapping("/{passengerId}")
    public Passenger updatePassenger(@PathVariable Long passengerId, @RequestBody Passenger passenger) {
        passenger.setId(passengerId);
        return passengerService.updatePassenger(passenger);
    }

    @GetMapping("/{passengerId}")
    public Passenger getPassengerById(@PathVariable Long passengerId) {
        return passengerService.getPassengerById(passengerId);
    }

    @DeleteMapping("/{passengerId}")
    public void deletePassenger(@PathVariable Long passengerId) {
        passengerService.deletePassenger(passengerId);
    }

    @GetMapping
    public List<Passenger> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

    // Add other passenger-related request mappings and methods as needed
}

