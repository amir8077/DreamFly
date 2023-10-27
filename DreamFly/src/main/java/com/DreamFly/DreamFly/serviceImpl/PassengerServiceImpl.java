package com.DreamFly.DreamFly.serviceImpl;
import com.DreamFly.DreamFly.entities.Passenger;
import com.DreamFly.DreamFly.repositories.PassengerRepository;
import com.DreamFly.DreamFly.serviecs_interface.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    @Override
    public Passenger createPassenger(Passenger passenger) {
        return null;
    }

    @Override
    public Passenger updatePassenger(Passenger passenger) {
        return null;
    }

    @Override
    public Passenger getPassengerById(Long passengerId) {
        return null;
    }

    @Override
    public void deletePassenger(Long passengerId) {

    }

    @Override
    public List<Passenger> getAllPassengers() {
        return null;
    }
}