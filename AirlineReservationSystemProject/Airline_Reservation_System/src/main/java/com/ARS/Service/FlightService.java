package com.ARS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ARS.Entity.Flight;
import com.ARS.Repository.FlightRepository;

@Service
public class FlightService {
	@Autowired
	private FlightRepository flightRepository;
	
	public List<Flight> getAllFlights(){
		return flightRepository.findAll();
	}
	
	public Flight getFlightById(Long id) {
		return flightRepository.findById(id).orElse(null);
	}
	
	public Flight saveFlight(Flight flight) {
		return flightRepository.save(flight);
	}

	public void deleteFlight(Long id) {
	   flightRepository.deleteById(id);
	}

	public List<Flight> searchFlights(String origin, String destination) {
		return flightRepository.findByOriginAndDestination(origin, destination);
	}

	public Flight createFlight(Flight flight) {
		return flight;
	}

	public Flight updateFlight(Long id, Flight flight) {
		return flight;
	
	}
}
