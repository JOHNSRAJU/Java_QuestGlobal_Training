package com.rideSharing.system;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome \n");
		Scanner sc = new Scanner(System.in);
		int option;
		do {
			System.out.println("\n1. Request Ride\n2. Accept Ride\n3. Pick Up\n4. Completed\n5. Cancel Ride \n6. View all Inprogress Ride \n7. Exit");
			option = sc.nextInt();
			switch(option) {
			case 1:{
				sc.nextLine();
				System.out.print("Enter Your Name :");
				String name = sc.nextLine();
				System.out.print("Enter pick up location :");
				String pickUpLocation = sc.nextLine();
				System.out.print("Enter the destination : ");
				String dropLocation = sc.nextLine();
				Thread t1 = new Thread(() -> {
					try {
						RideSharingManager.rideRequest(name, pickUpLocation, dropLocation);
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
				System.out.print("Enter driver id : ");
				int driverId = sc.nextInt();
				Thread t2 = new Thread(()->{
					try {
						RideSharingManager.acceptRequest(driverId);
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
				});
				t2.start();
				t2.join();
				break;
			}
			case 3:{
				System.out.print("Enter driver id : ");
				int driverId = sc.nextInt();
				Thread t3 = new Thread(()->{
					try {
						RideSharingManager.pickedUp(driverId);
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
				});
				t3.start();
				t3.join();
				break;
			}
			case 4:{
				System.out.print("Enter driver id : ");
				int driverId = sc.nextInt();
				Thread t4 = new Thread(()->{
					try {
						RideSharingManager.dropped(driverId);
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
				});
				t4.start();
				t4.join();
				break;
			}
			case 5:{
				System.out.print("Enter Ride id : ");
				int rideId = sc.nextInt();
				Thread t5 = new Thread(()->{
					try {
						RideSharingManager.canceled(rideId);
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
				});
				t5.start();
				t5.join();
				break;
			}
			case 6:{
				System.out.println("All In progess Rides are : ");
				Thread t6 = new Thread(()->{
					RideSharingManager.viewAllProgressRide();
				});
				t6.start();
				t6.join();
				break;
			}
			case 7:
				System.out.println("Thank you");
			default:
				System.out.println("Enter a valid output");
			}
		}while(option!=7);
	}
}
