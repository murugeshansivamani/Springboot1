package com.javaproject.projectOne.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaproject.projectOne.model.Reservation;
import com.javaproject.projectOne.repository.ReservationRepo;
@Service
public class ReservationService {
	@Autowired
	private ReservationRepo reservationRepo;

	public Object addNewReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		return reservationRepo.save(reservation);
	}

}
