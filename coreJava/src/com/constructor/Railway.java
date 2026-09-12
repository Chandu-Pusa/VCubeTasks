package com.constructor;

public class Railway {

	String passengerName;
	int age;
	String source;
	String destination;

	Railway() {
		this("Unknown", 0, "Unknown", "Unknown");
	}

	Railway(String pName, int age, String source, String dest) {
		this.passengerName = pName;
		this.age = age;
		this.source = source;
		this.destination = dest;
	}

	public static void main(String[] args) {

		Ticket t1 = new Ticket("Bob", 55, "Hyderabad", "Varanasi", 2);

		t1.displayBookingDetails();
	}
}

class Ticket extends Railway {

	int numberOfTickets;
	static int price = 500;

	Ticket(String pName, int age, String source, String dest, int nTickets) {
		super(pName, age, source, dest);
		this.numberOfTickets = nTickets;
	}

	void bookTicket() {

		int total = numberOfTickets * price;

		System.out.println(numberOfTickets + " tickets successfully booked");
		System.out.println("Total Price: " + total);
	}

	void displayBookingDetails() {

		System.out.println("Passenger Name: " + super.passengerName);
		System.out.println("Age: " + super.age);
		System.out.println("Source: " + super.source);
		System.out.println("Destination: " + super.destination);

		bookTicket();
	}
}