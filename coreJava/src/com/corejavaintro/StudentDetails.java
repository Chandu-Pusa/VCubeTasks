package com.corejavaintro;

class Address {
	String doorNo;
	String street;
	String city;
	String state;

	void display() {
		System.out.println("Student Address: ");
		System.out.println("--------------------------------");
		System.out.println("DoorNo: " + doorNo + " , Street: " + street + "\nCity: " + city + " , State: " + state);
		System.out.println();
	}
}

public class StudentDetails {

	static int count = 0;

	static String collegeName = "VCube";
	static int collegeId = 555;

	Address address;
	String sId;
	String sName;
	String branch;

	{
		count++;
		System.out.println("Student " + count + " Details:-");
		System.out.println("****************************************************");
		System.out.println();
	}

	void displayDetails() {
		address.display();
		System.out.println("Student College Details: ");
		System.out.println("--------------------------------");
		System.out.println("College Name: " + collegeName);
		System.out.println("College Id: " + collegeId);
		System.out.println("Student Id: " + sId);
		System.out.println("Student Name: " + sName);
		System.out.println("Student Branch: " + branch);
	}

	public static void main(String[] args) {

		StudentDetails s1 = new StudentDetails();

		s1.address = new Address();

		s1.address.doorNo = "1-25";
		s1.address.street = "Velavayur";
		s1.address.city = "Hyderabad";
		s1.address.state = "Telangana";

		s1.sId = "S101";
		s1.sName = "Apex";
		s1.branch = "CSE";

		s1.displayDetails();

	}

}
