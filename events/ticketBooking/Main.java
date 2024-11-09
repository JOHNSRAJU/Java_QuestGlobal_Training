package com.events.ticketBooking;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome\n");
		Scanner sc = new Scanner(System.in);
		int option;
		do {
			System.out.println("\n1. Add Event\n2. Book Ticket\n3. Cancel Booking\n4. View Events Available\n5. Exit");
			option = sc.nextInt();
			switch(option) {
			case 1:{
				System.out.print("Enter Event Id : ");
				int eventId = sc.nextInt();
				System.out.print("Enter Event Name : ");
				String eventName = sc.next();
				System.out.print("Enter Total Seats : ");
				int totalSeats = sc.nextInt();
				System.out.print("Enter price per Ticket : ");
				double price = sc.nextDouble();
				try {
					Thread t1= new Thread(()->{
						try {
							EventManager.addEvent(eventId, eventName, totalSeats, 0, price);
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					});
					t1.start();
					t1.join();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;
			}
			case 2:{
				System.out.print("Enter Booking Id : ");
				int bookingId = sc.nextInt();
				System.out.print("Enter your Name : ");
				String userName = sc.next();
				System.out.print("Enter Event Id : ");
				int eventId = sc.nextInt();
				System.out.print("Enter Number of Tickets : ");
				int noOfTickets = sc.nextInt();
				Thread t2 = new Thread(()->{
					try {
						EventManager.bookTickets(bookingId, userName, eventId, noOfTickets, "confirmed");
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

				});
				t2.start();
				t2.join();

				break;
			}
			case 3:{
				System.out.print("Enter Booking id : ");
				int bookingId = sc.nextInt();
				Thread t3 = new Thread(()-> {
					try {
						EventManager.cancelTickets(bookingId);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

				});
				t3.start();
				t3.join();
				break;
			}
			case 4:{
				Thread t4 = new Thread(()-> {
					System.out.println("Event details : ");
					EventManager.viewEvents();
				});
				t4.start();
				t4.join();
				break;
			}
			case 5:
				System.out.println("Thank you");
				break;

			default:
				System.out.println("Enter a valid output");
			}
		}while(option!=5);
	}
}
