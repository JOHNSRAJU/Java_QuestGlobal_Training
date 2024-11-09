package com.ParkingLot.Management.System;

import java.util.Scanner;

public class MainClass {
	static Thread t1;
	static Thread t2;
	static Thread t3;
	static Thread t4;
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome\n");
		Scanner sc = new Scanner(System.in);
		int option;
		do {
			System.out.println("\n1. Add Parking Spot\n2. Park Vehicle\n3. Remove Vehicle\n4. View Available Spot\n5. Calculate Parking Fee\n6. Exit");
			option = sc.nextInt();
			switch(option) {
			case 1:{
				System.out.print("Enter parking slot id :");
				int slotId = sc.nextInt();
				System.out.print("Enter Slot type (compact,regular,large) : ");
				String spotType = sc.next();
				System.out.print("Enter price per hour : ");
				double price = sc.nextDouble();
				ParkingSpot parkingSpot = new ParkingSpot(slotId, spotType, price);
				try {
					t1= new Thread(()->{
						ParkingLotManager.addParkingSpot(parkingSpot);
					});
					t1.start();
					t1.join();
				} catch (SpotAlreadyExistsException e) {
					System.err.println(e.getMessage());
				}
				break;
			}
			case 2:{
				System.out.print("Enter parking slot id");
				int slotId = sc.nextInt();
				System.out.print("Enter Vehicle type : ");
				String vehicleType = sc.next();
				System.out.print("Enter Vehicle number : ");
				String vehicleNumber = sc.next();
				Vehicle vehicle = new Vehicle(vehicleNumber, vehicleType);
				try {
					t2 = new Thread(()->{
						ParkingLotManager.parkVehicle(slotId, vehicle);
					});
					t2.start();
					t2.join();
				} catch (SpotUnAvailableException e) {
					System.err.println(e.getMessage());
				}
				break;
			}
			case 3:{
				System.out.print("Enter parking slot id");
				int slotId = sc.nextInt();
				try {
					t3 = new Thread(()-> {
						ParkingLotManager.removeVehicle(slotId);
					});
					t3.start();
					t3.join();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;
			}
			case 4:{
				t4 = new Thread(()-> {
					ParkingLotManager.viewAvailableSpots();
				});
				t4.start();
				t4.join();
				break;
			}
			case 5:{
				System.out.print("Enter parking slot id");
				int slotId = sc.nextInt();
				System.out.print("Enter time in minutes");
				double time = sc.nextDouble();
				try {
					ParkingLotManager.parkingFee(slotId, time);
				} catch (SpotAlreadyExistsException e) {
					System.err.println(e.getMessage());
				}
				break;
			}
			case 6:
				System.out.println("Thank you");
				break;

			default:
				System.out.println("Enter a valid output");
			}
		}while(option!=6);
	}
}
