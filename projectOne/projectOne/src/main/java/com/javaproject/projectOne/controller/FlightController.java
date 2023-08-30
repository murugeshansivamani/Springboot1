package com.javaproject.projectOne.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaproject.projectOne.model.Flight;
import com.javaproject.projectOne.service.FlightService;

@RestController
public class FlightController{
	
	@Autowired
	private FlightService flightService;
	
	@PostMapping("/flight/add")
	public Object addNewFlight(@RequestBody Flight flight) {
		 
		return flightService.addNewFlight(flight);
		
	}
	
	@GetMapping("/flight/from_to_date")   
	public List<Integer> getDepartureArrivalDateFlights(@RequestParam String departureCity,@RequestParam String arrivalCity,@RequestParam String dateOfDeparture){
		
		List <Flight> flights=flightService.getDepartureArrivalDateFlights(departureCity,arrivalCity,dateOfDeparture);
		List<Integer> flightNumbers=new ArrayList<Integer>();
//		flightNumbers.add("Names operating AirLines");
		for(Flight flight:flights){
			
			flightNumbers.add(flight.getFlightNumber());
		}
		return flightNumbers;
	}
	
	
}
