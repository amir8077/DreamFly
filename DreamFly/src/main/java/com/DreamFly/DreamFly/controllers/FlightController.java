package com.DreamFly.DreamFly.controllers;
import com.DreamFly.DreamFly.entities.Flight;
import com.DreamFly.DreamFly.serviecs_interface.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping
    public Flight createFlight(@RequestBody Flight flight) {
        return flightService.createFlight(flight);
    }

    @PutMapping("/{flightId}")
    public Flight updateFlight(@PathVariable Long flightId, @RequestBody Flight flight) {
        flight.setId(flightId);
        return flightService.updateFlight(flight);
    }

    @GetMapping("/{flightId}")
    public Flight getFlightById(@PathVariable Long flightId) {
        return flightService.getFlightById(flightId);
    }

    @DeleteMapping("/{flightId}")
    public void deleteFlight(@PathVariable Long flightId) {
        flightService.deleteFlight(flightId);
    }

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    // Add other flight-related request mappings and methods as needed
}

