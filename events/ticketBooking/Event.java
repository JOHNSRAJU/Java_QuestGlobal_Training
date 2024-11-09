package com.events.ticketBooking;

import java.util.Objects;

public class Event {
	private int eventId;
	private String eventName; 
	private int totalSeats;
	private int bookedSeats;
	private double pricePerTicket;
	
	public int getBookedSeats() {
		return bookedSeats;
	}
	public void setBookedSeats(int bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	public int getEventId() {
		return eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public double getPricePerTicket() {
		return pricePerTicket;
	}
	
	public int getAvailableSeats() {
		return totalSeats-bookedSeats;
	}
	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventName=" + eventName + ", totalSeats=" + totalSeats
				+ ", bookedSeats=" + bookedSeats + ", pricePerTicket=" + pricePerTicket + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(eventId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		return eventId == other.eventId;
	}
	public Event(int eventId, String eventName, int totalSeats, int bookedSeats, double pricePerTicket) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.totalSeats = totalSeats;
		this.bookedSeats = bookedSeats;
		this.pricePerTicket = pricePerTicket;
	}
	
	
	
}
