package com.rideSharing.system;

import java.util.Objects;

public class Ride {
	private int rideId;
	private String passengerName;
	private int driverId;
	private String pickUpLocation;
	private String dropLocation;
	private String status = "Requested";
	public String getPickUpLocation() {
		return pickUpLocation;
	}
	public void setPickUpLocation(String pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}
	public String getDropLocation() {
		return dropLocation;
	}
	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getRideId() {
		return rideId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public int getDriverId() {
		return driverId;
	}
	@Override
	public String toString() {
		return "Ride [rideId=" + rideId + ", passengerName=" + passengerName + ", DriverId=" + driverId
				+ ", pickUpLocation=" + pickUpLocation + ", dropLocation=" + dropLocation + ", status=" + status + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(rideId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ride other = (Ride) obj;
		return rideId == other.rideId;
	}
	public Ride(int rideId, String passengerName, String pickUpLocation, String dropLocation) {
		super();
		this.rideId = rideId;
		this.passengerName = passengerName;
		this.pickUpLocation = pickUpLocation;
		this.dropLocation = dropLocation;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	
	
}
