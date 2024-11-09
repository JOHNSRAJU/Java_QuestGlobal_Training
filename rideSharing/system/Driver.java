package com.rideSharing.system;

public class Driver {
	private int driveId;
	private String name;
	private boolean isAvailable;
	private Ride currentRide;
	
	public Driver(int driveId, String name) {
		super();
		this.driveId = driveId;
		this.name = name;
		this.isAvailable = true;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public Ride getCurrentRide() {
		return currentRide;
	}
	public void setCurrentRide(Ride currentRide) {
		this.currentRide = currentRide;
	}
	public int getDriveId() {
		return driveId;
	}
	public String getName() {
		return name;
	}
}
