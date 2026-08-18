package com.corejavaintro;

public class EmployInfo {
	
	static int count = 0;
	
	String eId;
	String eName;
	int sal;
	int exp;
	char grade;
	String permanentStatus;
	
	static {
		System.out.println("                             Employee Information");
		System.out.println("---------------------------------------------------------------------------------");
	}
	
	{
		count++;
		System.out.println("Employee Number "+count);
		System.out.println("*******************************");
	}
	
	void showEinfo() {		
		System.out.println("Employee Id: "+ eId);
		System.out.println("Employee Name: "+ eName);
		System.out.println("Employee Salary: "+ sal);
		System.out.println("Employee Experience: "+ exp);
		System.out.println("Employee Grade: "+ grade);
		System.out.println("Employee Permanent Status: "+ permanentStatus);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		EmployInfo e1 = new EmployInfo();
		e1.eId = "E101";
		e1.eName = "Charan";
		e1.sal = 100000;
		e1.exp = 2;
		e1.grade = 'A';
		e1.permanentStatus = "Permanent";
		
		e1.showEinfo();
		
		EmployInfo e2 = new EmployInfo();
		e2.eId = "E102";
		e2.eName = "Eshwar";
		e2.sal = 100000;
		e2.exp = 2;
		e2.grade = 'A';
		e2.permanentStatus = "Permanent";
		e2.showEinfo();
		
		EmployInfo e3 = new EmployInfo();
		e3.eId = "E103";
		e3.eName = "Ameer";
		e3.sal = 100000;
		e3.exp = 2;
		e3.grade = 'A';
		e3.permanentStatus = "Permanent";
		e3.showEinfo();
		
		
		
		
		
	}

}
