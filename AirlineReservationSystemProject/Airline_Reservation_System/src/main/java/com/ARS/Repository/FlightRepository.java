package com.ARS.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ARS.Entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long>{
    List<Flight> findByOriginAndDestination(String origin, String destination);
}
