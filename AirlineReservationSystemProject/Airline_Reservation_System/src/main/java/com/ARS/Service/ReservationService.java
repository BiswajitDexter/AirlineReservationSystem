package com.ARS.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ARS.Entity.Reservation;
import com.ARS.Repository.ReservationRepository;



import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    // Get all reservations
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    // Get a reservation by ID
    public Reservation getReservationById(Long id) {
		return reservationRepository.findById(id).orElse(null);
	}

	public Reservation createReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

	public void deleteReservation(Long id) {
		reservationRepository.deleteById(id);
	}

	public void cancelReservation(Long id) {
	}

	public Reservation updateReservation(Long id, Reservation reservation) {
		return reservation;
	}
}