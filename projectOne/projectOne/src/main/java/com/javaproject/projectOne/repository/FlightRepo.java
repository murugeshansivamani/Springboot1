package com.javaproject.projectOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.projectOne.model.Flight;

public interface FlightRepo extends JpaRepository<Flight, Integer> {
//	@Query("SELECT F FROM FLIGHT F  WHERE  F.DEPARTURE_CITY=:departureCity AND F.ARRIVAL_CITY=:arrivalCity  AND F.DATE_OF_DEPARTURE=:dateOfDeparture")
//	List<Flight> findFlight(@Param("departureCity") String departureCity,@Param("arrivalCity") String arrivalCity,@Param("dateOfDeparture") String dateOfDeparture);
	 

}
