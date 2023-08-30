package com.javaproject.projectOne.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaproject.projectOne.model.Reservation;
import com.javaproject.projectOne.service.ReservationService;

@RestController
public class ReservationController {
	@Autowired
	private ReservationService reservationService;
	
	@PostMapping("/reservation/add")
	public Object addNewReservation(@RequestBody Reservation reservation) {
		return reservationService.addNewReservation(reservation);
	}

}
