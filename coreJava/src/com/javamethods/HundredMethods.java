package com.javamethods;

public class HundredMethods {

	void method1() {
		System.out.println("called Method 1");
	}

	static void method2() {
		System.out.println("called Method 2");
	}

	void method3() {
		System.out.println("called Method 3");
	}

	static void method4() {
		System.out.println("Called Method 4");
	}

	void helloWorld() {
		System.out.println("Hello World.!");
	}

	void myName() {
		System.out.println("My name is Apex");
	}

	void myAge() {
		System.out.println("My Age is 22");
	}

	static void collegeName() {
		System.out.println("My College name is VLITS");
	}

	static void city() {
		System.out.println("Hyderabad");
	}

	static void favoriteFood() {
		System.out.println("Biryani");
	}

	void favoriteMovie() {
		System.out.println("Arya");
	}

	static void favProgLang() {
		System.out.println("Java");
	}

	void printFiveNum() {
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
	}

	void printRevFiveNum() {
		for (int i = 5; i > 0; i--) {
			System.out.print(i + " ");
		}
	}

	static void ascii() {
		System.out.println((char) 65);
	}

	void printThreeSentences() {
		System.out.println("first sentence.\nsecond sentence.\nthird sentence.");
	}

	void printNameFive() {
		for (int i = 1; i <= 5; i++) {
			System.out.print("Apex" + " ");
		}
	}

	static void java() {
		System.out.println("Java is Fun");
	}

	static void second() {
		System.out.println("This is named Second");
	}

	void jump() {
		System.out.println("Why..?");
	}

	void nameAge() {
		System.out.println("Rocky 22");
	}

	static void intro() {
		System.out.println("Small Intro");
	}

	void even() {
		System.out.println("0 2 4 6 8");
	}

	void odd() {
		System.out.println("1 3 5 7 9");
	}

	void printTenNumbers() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
	}

	void printReverseTen() {
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}

	void printEvenNumbers() {
		for (int i = 2; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
	}

	void printOddNumbers() {
		for (int i = 1; i <= 9; i += 2) {
			System.out.print(i + " ");
		}
	}

	void printSquares() {
		for (int i = 1; i <= 5; i++) {
			System.out.print(i * i + " ");
		}
	}

	void printCubes() {
		for (int i = 1; i <= 5; i++) {
			System.out.print(i * i * i + " ");
		}
	}

	void multiplicationTable() {
		int n = 5;

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}

	void sumNumbers() {
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
		}

		System.out.println("Sum = " + sum);
	}

	void averageMarks() {
		int math = 80;
		int java = 90;
		int dbms = 70;

		double average = (math + java + dbms) / 3.0;

		System.out.println("Average = " + average);
	}

	void totalMarks() {
		int math = 80;
		int java = 90;
		int dbms = 70;

		System.out.println("Total = " + (math + java + dbms));
	}

	void simpleAddition() {
		int a = 20;
		int b = 30;

		System.out.println("Sum = " + (a + b));
	}

	void simpleSubtraction() {
		int a = 50;
		int b = 20;

		System.out.println("Difference = " + (a - b));
	}

	void simpleMultiplication() {
		int a = 10;
		int b = 5;

		System.out.println("Product = " + (a * b));
	}

	void simpleDivision() {
		int a = 100;
		int b = 4;

		System.out.println("Result = " + (a / b));
	}

	void remainder() {
		int a = 17;
		int b = 5;

		System.out.println("Remainder = " + (a % b));
	}

	void square() {
		int n = 12;

		System.out.println("Square = " + (n * n));
	}

	void cube() {
		int n = 5;

		System.out.println("Cube = " + (n * n * n));
	}

	void rectangleArea() {
		int length = 10;
		int width = 5;

		System.out.println("Area = " + (length * width));
	}

	void rectanglePerimeter() {
		int length = 10;
		int width = 5;

		System.out.println("Perimeter = " + (2 * (length + width)));
	}

	void squareArea() {
		int side = 6;

		System.out.println("Area = " + (side * side));
	}

	void squarePerimeter() {
		int side = 6;

		System.out.println("Perimeter = " + (4 * side));
	}

	void circleArea() {
		double radius = 5;

		System.out.println("Area = " + (Math.PI * radius * radius));
	}

	void circleCircumference() {
		double radius = 5;

		System.out.println("Circumference = " + (2 * Math.PI * radius));
	}

	void celsiusToFahrenheit() {
		double celsius = 25;

		double fahrenheit = (celsius * 9 / 5) + 32;

		System.out.println("Fahrenheit = " + fahrenheit);
	}

	void fahrenheitToCelsius() {
		double fahrenheit = 77;

		double celsius = (fahrenheit - 32) * 5 / 9;

		System.out.println("Celsius = " + celsius);
	}

	void kilometersToMeters() {
		int kilometers = 5;

		System.out.println("Meters = " + (kilometers * 1000));
	}

	void metersToKilometers() {
		int meters = 5000;

		System.out.println("Kilometers = " + (meters / 1000.0));
	}

	void hoursToMinutes() {
		int hours = 3;

		System.out.println("Minutes = " + (hours * 60));
	}

	void minutesToSeconds() {
		int minutes = 5;

		System.out.println("Seconds = " + (minutes * 60));
	}

	void simpleInterest() {
		double principal = 10000;
		double rate = 5;
		double time = 2;

		double interest = (principal * rate * time) / 100;

		System.out.println("Interest = " + interest);
	}

	void totalAmount() {
		double price = 500;
		double tax = 50;

		System.out.println("Total = " + (price + tax));
	}

	void discount() {
		double price = 1000;
		double discount = 10;

		double finalPrice = price - (price * discount / 100);

		System.out.println("Final Price = " + finalPrice);
	}

	void profit() {
		double costPrice = 500;
		double sellingPrice = 700;

		System.out.println("Profit = " + (sellingPrice - costPrice));
	}

	void loss() {
		double costPrice = 800;
		double sellingPrice = 600;

		System.out.println("Loss = " + (costPrice - sellingPrice));
	}

	void speed() {
		double distance = 120;
		double time = 2;

		System.out.println("Speed = " + (distance / time) + " km/h");
	}

	void distance() {
		double speed = 60;
		double time = 3;

		System.out.println("Distance = " + (speed * time) + " km");
	}

	void fuelCost() {
		double liters = 10;
		double pricePerLiter = 105;

		System.out.println("Fuel Cost = " + (liters * pricePerLiter));
	}

	void shoppingBill() {
		int shirt = 800;
		int pants = 1200;
		int shoes = 2000;

		int total = shirt + pants + shoes;

		System.out.println("Shopping Total = " + total);
	}

	void restaurantBill() {
		int biryani = 250;
		int coke = 50;
		int starter = 150;

		int total = biryani + coke + starter;

		System.out.println("Restaurant Bill = " + total);
	}

	void ageNextYear() {
		int age = 22;

		System.out.println("Next year age = " + (age + 1));
	}

	void ageFiveYearsLater() {
		int age = 22;

		System.out.println("Age after 5 years = " + (age + 5));
	}

	void birthYear() {
		int currentYear = 2026;
		int age = 22;

		System.out.println("Birth Year = " + (currentYear - age));
	}

	void daysToHours() {
		int days = 5;

		System.out.println("Hours = " + (days * 24));
	}

	void weeksToDays() {
		int weeks = 4;

		System.out.println("Days = " + (weeks * 7));
	}

	void monthsToDays() {
		int months = 3;

		System.out.println("Approximate Days = " + (months * 30));
	}

	void printStars() {
		for (int i = 1; i <= 5; i++) {
			System.out.print("* ");
		}
	}

	void printFiveLines() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Java");
		}
	}

	void countdown() {
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}

		System.out.println("Go!");
	}

	void printAlphabet() {
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c + " ");
		}
	}

	void printSmallAlphabet() {
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c + " ");
		}
	}

	void printAsciiNumbers() {
		System.out.println((char) 65);
		System.out.println((char) 66);
		System.out.println((char) 67);
	}

	void showPercentage() {
		double obtained = 450;
		double total = 500;

		System.out.println("Percentage = " + (obtained / total * 100));
	}

	void showSalary() {
		double salary = 30000;
		double deduction = 3000;

		System.out.println("Final Salary = " + (salary - deduction));
	}

	void showBalance() {
		double balance = 10000;
		double withdrawal = 2500;

		System.out.println("Remaining Balance = " + (balance - withdrawal));
	}

	void showDeposit() {
		double balance = 10000;
		double deposit = 5000;

		System.out.println("New Balance = " + (balance + deposit));
	}

	void showElectricityBill() {
		int units = 150;
		int rate = 6;

		System.out.println("Electricity Bill = " + (units * rate));
	}

	void showMobileBill() {
		int plan = 599;
		int tax = 100;

		System.out.println("Mobile Bill = " + (plan + tax));
	}

	void showTravelCost() {
		int distance = 200;
		int costPerKm = 8;

		System.out.println("Travel Cost = " + (distance * costPerKm));
	}

	void showWorkingHours() {
		int start = 9;
		int end = 17;

		System.out.println("Working Hours = " + (end - start));
	}

	void showTemperature() {
		double temperature = 30;

		System.out.println("Temperature = " + temperature + " C");
	}

	void showDouble() {
		int number = 25;

		System.out.println("Double = " + (number * 2));
	}

	void showHalf() {
		int number = 50;

		System.out.println("Half = " + (number / 2.0));
	}

	void showNextNumber() {
		int number = 99;

		System.out.println("Next Number = " + (number + 1));
	}

	void showPreviousNumber() {
		int number = 100;

		System.out.println("Previous Number = " + (number - 1));
	}

	void showProductDetails() {
		String product = "Laptop";
		double price = 55000;

		System.out.println("Product: " + product);
		System.out.println("Price: " + price);
	}

	void showStudentResult() {
		int marks = 85;

		if (marks >= 40) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

	void showVotingStatus() {
		int age = 22;

		if (age >= 18) {
			System.out.println("Eligible to Vote");
		} else {
			System.out.println("Not Eligible");
		}
	}

	void showPositiveNumber() {
		int number = 25;

		if (number > 0) {
			System.out.println("Positive");
		}
	}

	void showEvenNumber() {
		int number = 24;

		if (number % 2 == 0) {
			System.out.println("Even");
		}
	}

	void showLargestNumber() {
		int a = 20;
		int b = 35;

		System.out.println(Math.max(a, b));
	}

	void showSmallestNumber() {
		int a = 20;
		int b = 35;

		System.out.println(Math.min(a, b));
	}

	void showRandomNumber() {
		int number = (int) (Math.random() * 100) + 1;

		System.out.println("Random Number = " + number);
	}

	void showCurrentYear() {
		System.out.println("Current Year = 2026");
	}

	void showJavaVersion() {
		System.out.println("Java Version: 21");
	}

	public static void main(String[] args) {

	}

}
