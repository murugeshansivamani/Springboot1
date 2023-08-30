package com.javaproject.projectOne.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int flightId;
	
	private int passengerId;

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservation(int id, int flightId, int passengerId) {
		super();
		this.id = id;
		this.flightId = flightId;
		this.passengerId = passengerId;
	}

	public Reservation(int flightId, int passengerId) {
		super();
		this.flightId = flightId;
		this.passengerId = passengerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", flightId=" + flightId + ", passengerId=" + passengerId + "]";
	}
	

}
