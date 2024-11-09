package com.ParkingLot.Management.System;

import java.util.Objects;

public class ParkingSpot {
	int spotId;
	String spotType;
	boolean isOccupied;
	double pricePerHour;
	@Override
	public int hashCode() {
		return Objects.hash(spotId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParkingSpot other = (ParkingSpot) obj;
		return spotId == other.spotId;
	}
	@Override
	public String toString() {
		return "ParkingSpot [spotId=" + spotId + ", spotType=" + spotType + ", isOccupied=" + isOccupied
				+ ", pricePerHour=" + pricePerHour + "]";
	}
	public ParkingSpot(int spotId, String spotType,double pricePerHour) {
		super();
		this.spotId = spotId;
		this.spotType = spotType;
		this.isOccupied = false;
		this.pricePerHour = pricePerHour;
	}
	
}
