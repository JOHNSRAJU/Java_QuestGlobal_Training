package com.airport.baggage.handlingSystem;

import java.util.Scanner;

public class Main {	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome \n");
		Scanner sc = new Scanner(System.in);
		int option;
		do {
			System.out.println("\n1. Check-In Bag\n2. Load to Flight\n3. Retrive Bag\n4. View all loaded bag\n5. Exit");
			option = sc.nextInt();
			switch(option) {
			case 1:{
				System.out.print("Enter bag id :");
				int bagId = sc.nextInt();
				System.out.print("Enter Your Name :");
				String name = sc.next();
				System.out.print("Enter bag weight :");
				int weight = sc.nextInt();
				System.out.print("Enter the destination : ");
				String destination = sc.next();
				Bag bag = new Bag(bagId, name, weight, destination);
				Thread t1= new Thread(()->{
					try {
						AirportManager.checkInBag(bag);
					} catch (Exception e) {
						// TODO: handle exception
						System.err.println(e.getMessage());
					}
				});
				t1.start();
				t1.join();
				break;
			}
			case 2:{
				System.out.print("Enter bag id : ");
				int bagId = sc.nextInt();
				System.out.print("Enter flight id : ");
				int flightId = sc.nextInt();
				Thread t2 = new Thread(()->{
					try {
						AirportManager.loadBagOntoFlight(bagId, flightId);
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
				});
				t2.start();
				t2.join();
				break;
			}
		case 3:{
			System.out.print("Enter Bag id : ");
			int bagId = sc.nextInt();
			Thread t3 = new Thread(()-> {
				try {
					AirportManager.retriveBag(bagId);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			});
			t3.start();
			t3.join();
			break;
		}
		case 4:{
			Thread t4 = new Thread(()-> {
				System.out.print("Enter flight id : ");
				int flightId = sc.nextInt();
				System.out.println("Loaded Bag : ");
				try {
					AirportManager.viewLoadedBag(flightId);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
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
	}while(option!=6);
}
}
