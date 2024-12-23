package com.ARS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ARS.Entity.Passenger;
import com.ARS.Repository.PassengerRepository;

@Service
public class PassengerService {
    @Autowired
	private PassengerRepository passengerRepository;
	
	public List<Passenger> getAllPassengers(){
		return passengerRepository.findAll();
	}
	
	public Passenger savePassenger(Passenger passenger) {
		return passengerRepository.save(passenger);
		
	}

	public Passenger getPassengerById(Long id) {
		return passengerRepository.findById(id).orElse(null);
	}

	public Passenger createPassenger(Passenger passenger) {
		return passengerRepository.save(passenger);
	}

	public void deletePassenger(Long id) {
		passengerRepository.deleteById(id);
	}

	public Passenger updatePassenger(Long id, Passenger passengerDetails) {
		return passengerDetails;
	}
}
