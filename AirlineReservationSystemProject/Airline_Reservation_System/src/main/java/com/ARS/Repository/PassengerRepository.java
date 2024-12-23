package com.ARS.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ARS.Entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long>{
	
}