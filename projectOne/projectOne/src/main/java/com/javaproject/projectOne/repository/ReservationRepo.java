package com.javaproject.projectOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.projectOne.model.Reservation;



public interface ReservationRepo extends JpaRepository<Reservation, Integer> {

}
