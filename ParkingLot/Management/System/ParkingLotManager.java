package com.ParkingLot.Management.System;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotManager {



	static List<ParkingSpot> spotList = new ArrayList<ParkingSpot>();


	static ParkingSpot spotFinder(int slotId) {
		for(ParkingSpot p:spotList) {
			if(p.spotId==slotId) {
				return p;
			}
		}
		throw new SpotUnAvailableException("Spot Unavailable");
	}

	static void addParkingSpot(ParkingSpot spot){
		if(spotList.contains(spot)) {
			throw new SpotAlreadyExistsException("Spot Already Exists");
		}
		else {
			spotList.add(spot);
			System.out.println("Added Successfuly");
		}
	}

	static void parkVehicle(int spotId, Vehicle vehicle){
		ParkingSpot spot = spotFinder(spotId); 
		if(!spot.isOccupied) {
			if(vehicle.getVehicleType().equals("motorCycle")&&spot.spotType.equals("compact")){
				spot.isOccupied=true;
				System.out.println("Parked Successfuly");
			}
			else if(vehicle.getVehicleType().equals("car")&&spot.spotType.equals("regular")){
				spot.isOccupied=true;
				System.out.println("Parked Successfuly");
			}
			else if(vehicle.getVehicleType().equals("truck")&&spot.spotType.equals("large")){
				spot.isOccupied=true;
				System.out.println("Parked Successfuly");
			}
			else {
				throw new SpotUnAvailableException("Spot Unavailable");
			}
		}
		else {
			throw new SpotUnAvailableException("Spot Unavailable");
		}
	}
	static void removeVehicle(int spotId){
		ParkingSpot spot = spotFinder(spotId);
		if(spot.isOccupied) {
			spot.isOccupied=false;
			System.out.println("Removed successfully");
		}
		else {
			throw new SpotNotOccupiedException("Spot not occupied");
		}
	}
	static void viewAvailableSpots() {
		for(ParkingSpot p:spotList) {
			if(!p.isOccupied) {
				System.out.println(p);
			}
		}
	}
	static void parkingFee(int spotId,double time) {
		ParkingSpot spot = spotFinder(spotId);
		System.out.println("Fee : "+spot.pricePerHour*time/60);
	}

}
