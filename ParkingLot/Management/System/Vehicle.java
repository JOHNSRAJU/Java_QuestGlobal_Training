package com.ParkingLot.Management.System;

public class Vehicle {
	private String licencePlate;
	private String vehicleType;
	public String getLicencePlate() {
		return licencePlate;
	}
	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public Vehicle(String licencePlate, String vehicleType) {
		super();
		this.licencePlate = licencePlate;
		this.vehicleType = vehicleType;
	}
	
}
