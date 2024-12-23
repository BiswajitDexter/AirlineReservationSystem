package com.ARS.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ARS.Entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
