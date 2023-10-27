package com.DreamFly.DreamFly.serviecs_interface;

import com.DreamFly.DreamFly.entities.Passenger;

import java.util.List;

public interface PassengerService {

    Passenger createPassenger(Passenger passenger);

    Passenger updatePassenger(Passenger passenger);

    Passenger getPassengerById(Long passengerId);

    void deletePassenger(Long passengerId);

    List<Passenger> getAllPassengers();

    // Add other passenger-related service methods as needed
}
