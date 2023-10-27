package com.DreamFly.DreamFly.serviecs_interface;

import com.DreamFly.DreamFly.entities.Flight;

import java.util.List;

public interface FlightService {

    Flight createFlight(Flight flight);

    Flight updateFlight(Flight flight);

    Flight getFlightById(Long flightId);

    void deleteFlight(Long flightId);

    List<Flight> getAllFlights();

    // Add other flight-related service methods as needed
}
