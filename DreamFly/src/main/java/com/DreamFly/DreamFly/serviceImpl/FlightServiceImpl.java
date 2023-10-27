package com.DreamFly.DreamFly.serviceImpl;
import com.DreamFly.DreamFly.entities.Flight;
import com.DreamFly.DreamFly.repositories.FlightRepository;
import com.DreamFly.DreamFly.serviecs_interface.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightRepository flightRepository;

    @Override
    public Flight createFlight(Flight flight) {
        return null;
    }

    @Override
    public Flight updateFlight(Flight flight) {
        return null;
    }

    @Override
    public Flight getFlightById(Long flightId) {
        return null;
    }

    @Override
    public void deleteFlight(Long flightId) {

    }

    @Override
    public List<Flight> getAllFlights() {
        return null;
    }
}