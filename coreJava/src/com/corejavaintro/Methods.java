package com.corejavaintro;

public class Methods {
	
	void method1() {
		System.out.println("method1 called");
		System.out.println();
	}
	
	static void method2() {
		System.out.println("method2 called");
		System.out.println();
	}
	
	void method3() {
		System.out.println("method3 called");
		System.out.println();
	}
	
	static void method4() {
		System.out.println("method4 started");
		Methods m = new Methods();
		m.method3();
		System.out.println("method4 called");
		System.out.println("method4 ended");
		System.out.println();
	}
	
	void method5() {
		System.out.println("method5 started");
		method4();
		System.out.println("method5 called");
		System.out.println("method5 ended");
		System.out.println();
	}
	
	static void method6() {
		System.out.println("method6 started");
		System.out.println("method6 called");
		Methods m = new Methods();
		m.method7();
		System.out.println("method5 ended");
		System.out.println();
	}
	
	void method7() {
		System.out.println("method7 started");
		System.out.println("method7 called");
		method8();
		method9();
		method10();
		System.out.println("method7 ended");
		System.out.println();
	}
	
	static void method8() {
		System.out.println("method8 called");
		System.out.println();
	}
	
	void method9() {
		System.out.println("method9 called");
		System.out.println();
	}
	
	static void method10() {
		System.out.println("method10 started");
		Methods m = new Methods();
		System.out.println("method10 called");
		m.method11();
		System.out.println("method10 ended");
		System.out.println();
	}
	
	void method11() {
		System.out.println("method11 started");
		System.out.println("method11 called");
		method12();
		method13();
		method14();
		method15();
		method16();
		method17();
		method18();
		method19();
		method20();
		System.out.println("method11 ended");
		System.out.println();
	}
	
	static void method12() {
		System.out.println("method12 called");
		System.out.println();
	}
	
	void method13() {
		System.out.println("method13 called");
		System.out.println();
	}
	
	static void method14() {
		System.out.println("method14 called");
		System.out.println();
	}
	
	void method15() {
		System.out.println("method15 called");
		System.out.println();
	}
	
	static void method16() {
		System.out.println("method16 called");
		System.out.println();
	}
	
	void method17() {
		System.out.println("method17 called");
		System.out.println();
	}
	
	static void method18() {
		System.out.println("method18 called");
		System.out.println();
	}
	
	void method19() {
		System.out.println("method19 called");
		System.out.println();
	}
	
	static void method20() {
		System.out.println("method20 called");
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("Main method Started");
		System.out.println();
		Methods m = new Methods();
		m.method1();
		method2();
		m.method5();
		method6();
		System.out.println("Main Method ended");
	}
}
