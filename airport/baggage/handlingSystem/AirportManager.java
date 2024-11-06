package com.airport.baggage.handlingSystem;

import java.util.HashMap;
import java.util.Map;

public class AirportManager {
	private static HashMap<Integer, Bag> bagMap = new HashMap<Integer, Bag>();
	private static  HashMap<Integer, Flight> flightMap = new HashMap<Integer, Flight>();
	static {
		flightMap.put(201,new Flight(201, "TVM", "17:34", 30, 10));
		flightMap.put(202,new Flight(202, "COK", "05:14", 30, 10));
		System.out.println("Currently available flights are : "+flightMap.keySet());
	}
	static void checkInBag(Bag bag) {
		if(bagMap.containsKey(bag.getBagId())) {
			throw new BagAlreadyCheckedInException("Bag : "+bag.getBagId()+" is Already checked-In");
		}
		else {
			bag.setStatus("Checked In");
			bagMap.put(bag.getBagId(), bag);
			System.out.println("Bag "+bag.getBagId()+" Checked-In Successfully");
		}
	}
	static synchronized void loadBagOntoFlight(int bagId,int flightId) {
		Flight flight = flightMap.get(flightId);
		Bag bag = bagMap.get(bagId);
		if(flight!=null&&bag!=null) {
			if(flight.getLimitWeight()>=bag.getWeight()&&flight.getBagCount()>0) {
				bag.setStatus("Loaded");
				flight.addBag(bag);
				System.out.println("Bag "+bag.getBagId()+" Loaded Successfully");
			}
			else {
				throw new UnableToLoadBagException("Bag : "+bagId+" cant be loaded");
			}
		}
		else {
			throw new UnableToLoadBagException("Bag : "+bagId+" cant be loaded");
		}
	}
	
	static synchronized void retriveBag(int bagId) {
		if(bagMap.get(bagId).getStatus().equals("Checked In")) {
			bagMap.get(bagId).setStatus("Retrived");
			bagMap.remove(bagId);
			System.out.println("Bag "+bagId+" Retrived Successfully");
		}
		else {
			throw new BagNotRetrivableException("Bag cannot be retrived");
		}
	}
	
	static void viewLoadedBag(int flightId) {
		Flight flight = flightMap.get(flightId);
		if(flight!=null) {
			for(Bag bag : flight.getBagList()) {
				System.out.println(bag);
			}
		}
		else {
			throw new FlightNotFoundException("No flight found");
		}
	}
}
