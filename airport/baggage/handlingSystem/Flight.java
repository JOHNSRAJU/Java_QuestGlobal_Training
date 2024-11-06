package com.airport.baggage.handlingSystem;

import java.util.ArrayList;
import java.util.List;

public class Flight {
	private int flightId;
	private String destination;
	private String depatureTime;
	private List<Bag> bagList = new ArrayList<Bag>();
	private int limitWeight;
	private int bagCount;
	
	public int getLimitWeight() {
		return limitWeight;
	}
	
	public int getBagCount() {
		return bagCount;
	}
	
	public Flight(int flightId, String destination, String depatureTime, int limitWeight,
			int bagCount) {
		super();
		this.flightId = flightId;
		this.destination = destination;
		this.depatureTime = depatureTime;
		this.bagList = bagList;
		this.limitWeight = limitWeight;
		this.bagCount = bagCount;
	}

	public List<Bag> getBagList() {
		return bagList;
	}

	public int getFlightId() {
		return flightId;
	}

	void addBag(Bag bag){
		if(!bagList.contains(bag)) {
			if(bag.getWeight()<=limitWeight) {
				bagList.add(bag);
				bagCount--;
				System.out.println("Bag : "+bag.getBagId()+" is added to Flight : "+this.flightId);
			}
			else {
				throw new UnableToLoadBagException("Bag : "+bag.getBagId()+" is over Weight");
			}
		}
		else {
			throw new UnableToLoadBagException("Bag : "+bag.getBagId()+" is Already loaded");
		}
	}
	

	void removeBag(int bagId) {
		Bag bag = this.bagFinder(bagId);
		bagList.remove(bag);
	}
	
	Bag bagFinder(int bagId) {
		for(Bag bag:bagList) {
			if(bag.getBagId()==bagId) {
				return bag;
			}
		}
		throw new BagNotFoudException("Bag : "+bagId+" not found");
	}
}
