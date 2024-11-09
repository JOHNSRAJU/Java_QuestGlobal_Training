package com.rideSharing.system;

import java.util.HashMap;

public class RideSharingManager {
	static HashMap<Integer, Driver> driverList = new HashMap<Integer, Driver>();
	static HashMap<Integer, Ride> rideList = new HashMap<Integer, Ride>();
	static int rideId=100;
	static {
		driverList.put(201, new Driver(201, "Johns Raju"));
		driverList.put(202, new Driver(201, "Anil Kumar"));
	}
	static void rideRequest(String passengerName,String pickUpLocation,String dropLocation) {
		isAnyDriverAvailable();
		Ride ride = new Ride(++rideId, passengerName, pickUpLocation, dropLocation);
		rideList.put(rideId, ride);
		System.out.println("Ride : "+ride.getRideId()+" is Requested Successfully");
	}
	static void acceptRequest(int driverId) {
		Driver driver = driverList.get(driverId);
		if(driver!=null) {
			if(driver.isAvailable()==true) {
				Ride ride = isAnyRideAvailable();
				ride.setStatus("Accepted");
				ride.setDriverId(driverId);
				driver.setAvailable(false);
				driver.setCurrentRide(ride);
				System.out.println("Driver : "+driver.getDriveId()+" Accepted Successfully");
			}
			else {
				throw new RideNotAvailableException("No ride available");
			}
		}
	}
	static void pickedUp(int driverId) {
		Driver driver = driverList.get(driverId);
		if(driver!=null) {
			if(driver.getCurrentRide()!=null) {
				driver.getCurrentRide().setStatus("In Progress");
				System.out.println("Driver : "+driver.getDriveId()+" Picked Successfully");
			}
		}
		else {
			throw new DriverNotAvailableException("Driver not available");
		}
	}
	
	static void dropped(int driverId) {
		Driver driver = driverList.get(driverId);
		if(driver!=null) {
			if(driver.getCurrentRide()!=null) {
				driver.getCurrentRide().setStatus("Completed");
				System.out.println("Driver : "+driver.getDriveId()+" dropped Successfully");
				driver.setAvailable(true);
				driver.setCurrentRide(null);
			}
		}
		else {
			throw new DriverNotAvailableException("Driver not available");
		}
	}
	
	static void canceled(int rideId) {
		Ride ride = rideList.get(rideId);
		System.out.println(ride);
		if(ride!=null) {
			if(ride.getStatus().equals("Requested")) {
				ride.setStatus("Cancelled");
				return;
			}
			else {
				Driver driver = driverList.get(ride.getDriverId());
				if(driver!=null) {
					if(driver.getCurrentRide()!=null) {
						if(driver.getCurrentRide().getStatus().equals("Requested")) {
							driver.getCurrentRide().setStatus("Cancelled");
							driver.setAvailable(true);
							driver.setCurrentRide(null);
							System.out.println("Driver : "+driver.getDriveId()+" cancelled Successfully");
						}
						throw new RideNotCancelableException("Ride cannot be cancelled");
						
					}
				}
				else {
					throw new DriverNotAvailableException("Driver not available");
				}
			}
		}
	}
	
	static Driver isAnyDriverAvailable() {
		for(Driver driver:driverList.values()) {
			if(driver.isAvailable()) {
				return driver;
			}
		}
		throw new NoDriverAvailableException("Currently no driver is available");
	}
	
	static Ride isAnyRideAvailable() {
		for(Ride ride:rideList.values()) {
			if(ride.getStatus().equals("requested")) {
				return ride;
			}
		}
		throw new RideNotAvailableException("Currently no Ride is available");
	}
	
	static void viewAllProgressRide() {
		for(Ride ride : rideList.values()) {
			if(ride.getStatus().equals("In Progress")) {
				System.out.println(ride);
			}
		}
	}
}
