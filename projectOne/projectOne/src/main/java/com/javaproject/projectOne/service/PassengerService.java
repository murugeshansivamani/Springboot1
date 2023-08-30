package com.javaproject.projectOne.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaproject.projectOne.model.Passenger;
import com.javaproject.projectOne.repository.PassengerRepo;

@Service
public class PassengerService {
	@Autowired
	private PassengerRepo passengerRepo;
	
	public Object addNewPassenger(Passenger passenger) {
		return passengerRepo.save(passenger);
		
	}

}
