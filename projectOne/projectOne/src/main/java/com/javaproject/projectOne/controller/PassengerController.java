package com.javaproject.projectOne.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaproject.projectOne.model.Passenger;
import com.javaproject.projectOne.service.PassengerService;

@RestController
public class PassengerController {
	
	@Autowired
	private PassengerService passengerService;
	
	@PostMapping("/passenger/add")
	public Object addNewPassenger(@RequestBody Passenger passenger) {
		
		return passengerService.addNewPassenger(passenger);
	}

}
