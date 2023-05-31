package com.jsp.theatre.booking;

public class Theatre {

	private String theatre_name;
	private int seat;
	private Ticket ticket;

	public Theatre(String theatre_name, int seat) {
		this.theatre_name = theatre_name;
		this.seat = seat;
	}

	public String getTheatre_name() {
		return theatre_name;
	}

	public void setTheatre_name(String theatre_name) {
		this.theatre_name = theatre_name;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public void bookTicket() {
		
		if (ticket.getNo_of_tickets() != 0 && ticket.getNo_of_tickets() <= seat) {
			seat = seat - ticket.getNo_of_tickets();
			System.out.println("Your Booking of " + ticket.getNo_of_tickets() + "has been booked");

		} else {
			System.out.println("Booking not Successfull");
		}
	}
	public void checkAvailability() {
		System.out.println("Available Seat:"+ seat);
	}

	public void cancell( int cancell_ticket) {
		if(cancell_ticket!=0&&cancell_ticket<=ticket.getNo_of_tickets()) {
			seat = seat + cancell_ticket;
			ticket.setNo_of_tickets(ticket.getNo_of_tickets()-cancell_ticket);
			
		}else {
			System.out.println("Wrong Input");
		}
	}
	public void printDetails() {
		System.out.println("=========== Ticket Details===========");
		System.out.println("Theatre name is:" + theatre_name);
		System.out.println("No of Tickets :"+ ticket.getNo_of_tickets());
	
	}
}
