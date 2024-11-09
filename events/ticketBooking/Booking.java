package com.events.ticketBooking;

public class Booking {
	private int bookingId;
	private String userName;
	private int eventId;
	private int numberOfTickets;
	private String status;
	
	public Booking(int bookingId, String userName, int eventId, int numberOfTickets, String status) {
		super();
		this.bookingId = bookingId;
		this.userName = userName;
		this.eventId = eventId;
		this.numberOfTickets = numberOfTickets;
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getBookingId() {
		return bookingId;
	}

	public String getUserName() {
		return userName;
	}

	public int getEventId() {
		return eventId;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}
	
	
	
}
