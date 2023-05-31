package com.jsp.theatre.booking;

public class Ticket {
	private String movie_name;
	private int no_of_tickets;

	public Ticket() {
		System.out.println("Under Process");
	}

	public Ticket(String name, int no_tickets) {
		this();
		this.movie_name = name;
		this.no_of_tickets = no_tickets;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public int getNo_of_tickets() {
		return no_of_tickets;
	}

	public void setNo_of_tickets(int no_of_tickets) {
		this.no_of_tickets = no_of_tickets;
	}
public void printTicketDetails() {
	System.out.println("=======Ticket========");
	System.out.println("Name of the Movie is :"+ movie_name);
	System.out.println("Number of Tickets is :"+ no_of_tickets);
}
}
