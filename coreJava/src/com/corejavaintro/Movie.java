package com.corejavaintro;

public class Movie {
	
	String movieName;
	int releaseYear;
	int ticketPrice;
	
	{
		System.out.println("**********************************************************");
	}
	
	void show() {
		System.out.println("Movie Name: " + movieName);
		System.out.println("Release Date: "+ releaseYear);
		System.out.println("ticketPrice: "+ticketPrice);
	}
	public static void main(String[] args) {
		
		Movie m1 = new Movie();
		
		m1.movieName = "Bahubali";
		m1.releaseYear = 2015;
		m1.ticketPrice = 200;
		
		m1.show();
		
		
		Movie m2 = new Movie();
		
		m2.movieName = "Bahubali2";
		m2.releaseYear = 2017;
		m2.ticketPrice = 250;
		
		m2.show();
		
		Movie m3 = new Movie();
		
		m3.movieName = "Arya";
		m3.releaseYear = 2004;
		m3.ticketPrice = 50;
		
		m3.show();
	}

}
