package com.airport.baggage.handlingSystem;

import java.util.Objects;

public class Bag {
	private int bagId;
	private String ownerName;
	private double weight;
	private String destination;
	private String status="Un Checked";
	
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getBagId() {
		return bagId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public double getWeight() {
		return weight;
	}
	public Bag(int bagId, String ownerName, double weight, String destination) {
		super();
		this.bagId = bagId;
		this.ownerName = ownerName;
		this.weight = weight;
		this.destination = destination;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Bag [bagId=" + bagId + ", ownerName=" + ownerName + ", weight=" + weight + ", destination="
				+ destination + ", status=" + status + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(bagId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bag other = (Bag) obj;
		return bagId == other.bagId;
	}
	
}
