package com.events.ticketBooking;

import java.util.HashMap;

public class EventManager {
	static HashMap<Integer, Event> eventMap = new HashMap<Integer, Event>();
	static HashMap<Integer,Booking> bookingMap = new HashMap<Integer, Booking>();
	
	static void addEvent(int eventId,String eventName,int totalSeats,int bookedSeats, double pricePerTicket) {
		if(!eventMap.containsKey(eventId)) {
			eventMap.put(eventId, new Event(eventId, eventName, totalSeats, bookedSeats, pricePerTicket));
			System.out.println("Event : "+eventId+ " added Successfully");
			return;
		}
		else {
			throw new EventAlreadyExistsException("Event : "+eventId+ "already Added");
		}
	}
	static void bookTickets(int bookingId,String userName,int eventId,int numberOfTickets,String status) {
		Event event = eventMap.get(eventId);
		if(event!=null) {
			if(event.getAvailableSeats()>=numberOfTickets) {
				bookingMap.put(bookingId, new Booking(bookingId, userName, eventId, numberOfTickets, status));
				event.setBookedSeats(event.getBookedSeats()+numberOfTickets);
				System.out.println("Event : "+eventId+ " Booked Successfully with BookingId : "+bookingId+"\nYou have to pay : "+numberOfTickets*event.getPricePerTicket());
				return;
			}
			else {
				throw new SeatsNotAvailableException("No seats available for the Event : "+eventId);
			}
		}
		else {
			throw new SeatsNotAvailableException("No seats available for the Event : "+eventId);
		}
	}
	static void cancelTickets(int bookingId) {
		Booking booking = bookingMap.get(bookingId);
		if(booking!=null) {
			Event event = eventMap.get(booking.getEventId());
			if(event!=null&&booking.getStatus()!="canceled") {
				booking.setStatus("canceled");
				event.setBookedSeats(event.getBookedSeats()-booking.getNumberOfTickets());
				System.out.println("Booking : "+bookingId+ " is canceled Successfully.");
			}
			else {
				throw new BookingNotCancelableException("Booking is not cancelable for Booking:"+bookingId);
			}
		}
		else {
			throw new BookingNotCancelableException("Booking is not cancelable for Booking:"+bookingId);
		}
	}
	static void viewEvents() {
		for(Event event:eventMap.values()) {
			System.out.println("Event : "+event.getEventName()+" - "+event.getAvailableSeats());
		}
	}
	
}
