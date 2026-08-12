package com.corejavaintro;

public class Student {
	
	static String collegeName="Vcube";
	static String location="KPHB";
	
	int rollNo;
	String name;
	long mobile;
	String email;
	String branch;

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.rollNo = 101;
		st1.name = "abcd";
		st1.mobile = 9876543210L;
		st1.email = "xyz@email.com";
		st1.branch = "JFS";
		
		System.out.println("College Name : " + collegeName);
		System.out.println("Location : " + location);
		
		System.out.println("StudentRollNo : " + st1.rollNo);
		System.out.println("StudentName : " + st1.name);
		System.out.println("Mobile : " + st1.mobile);
		System.out.println("Email : " + st1.email);
	}

}
