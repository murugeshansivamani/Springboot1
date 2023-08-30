package com.javaproject.projectOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.projectOne.model.Passenger;

public interface PassengerRepo extends JpaRepository<Passenger, Integer> {

}
 