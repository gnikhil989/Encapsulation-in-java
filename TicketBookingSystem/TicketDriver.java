package com.jsp.theatre.booking;

import java.util.Scanner;

public class TicketDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Theatre theatre = new Theatre("INOX", 500);
		boolean flag = true;
		while (flag) {
			System.out.println("Enter 1.Availibility status" + "2. Book your Ticket" + "3. Show booking details"
					+ "4. Cancel tickets " + "5- exit");

		
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			theatre.checkAvailability();

		}
			break;
		case 2: {
			System.out.println("Enter the no of seats");
			int seats = sc.nextInt();
			System.out.println("Enter movie name: ");
			String movie = sc.next();
			theatre.setTicket(new Ticket(movie, seats));
			theatre.bookTicket();
		}
			break;
		case 3: {
			theatre.printDetails();
		}
			break;
		case 4: {
			System.out.println("Enter number");
			int cancel = sc.nextInt();
			theatre.cancell(cancel);
		}
			break;
		case 5: {
			System.out.println("Thank you");
			flag = false;

		}
			break;
		default: {
			System.out.println("Wrong input");
		}
		}

	}

}}