package com.corejavaintro;

class A {
	B b;
	
    @Override
    protected void finalize() {
        System.out.println("A finalized");
    }
}

class B {
	A a;
	
    @Override
    protected void finalize() {
        System.out.println("B finalized");
    }
}

public class GCE {
	
	@Override
	protected void finalize() {
		System.out.println("Finalize Method Called");
	}
	
	
	void hello() {
		System.out.println("Hello..!");
		@SuppressWarnings("unused")
		GCE obj = new GCE(); //Object Inside Method
	}

	public static void main(String[] args) {
		
		A obja = new A();
		B objb = new B();
		
		obja.b = objb;
		objb.a = obja;
		
		obja = null;
		objb = null;
		
		@SuppressWarnings("unused")
		GCE obj1 = new GCE();
		@SuppressWarnings("unused")
		GCE obj2 = new GCE();
		GCE obj3 = new GCE();
		obj1 = null; // nullifying
		obj2 = obj3; // re- initialization
		new GCE().hello(); //Anonymous
		
		System.gc();
	}

}
