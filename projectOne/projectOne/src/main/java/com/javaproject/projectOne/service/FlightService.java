package com.javaproject.projectOne.service;

import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaproject.projectOne.model.Flight;
import com.javaproject.projectOne.repository.FlightRepo;

@Service
public class FlightService {
	@Autowired
	private FlightRepo flightRepo;
	
	public Object addNewFlight(Flight flight) {
	
		return flightRepo.save(flight);
	}

	public List<Flight> getDepartureArrivalDateFlights(String departureCity, String arrivalCity, String dateOfDeparture) {
		// TODO Auto-generated method stub
	List <Flight> flights=	flightRepo.findAll();
	System.out.println(departureCity+" "+arrivalCity+" "+dateOfDeparture);
	
	Predicate<? super Flight> predicate1 = flight -> flight.getDepartureCity().equals(departureCity);
	Predicate<? super Flight> predicate2 = flight -> flight.getArrivalCity().equals(arrivalCity);
	Predicate<? super Flight> predicate3 = flight -> flight.getDateOfDeparture().equals(dateOfDeparture);
	
//	flights.stream().filter(predicate1).filter(predicate2).filter(predicate3).collect(Collectors.toList());
		return   flights.stream().filter(predicate1)
				.filter(predicate2)
				.filter(predicate3)
				.toList();
				
//				.collect(Collectors.toList());
		
	}

}
