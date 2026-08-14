package com.corejavaintro;

public class ObjectCount {
	
	static int count = 0;
	
    {
		count ++;
	}
	
	public static void main(String[] args) {
		
		
		@SuppressWarnings("unused")
		ObjectCount obj1 = new ObjectCount();
		
		@SuppressWarnings("unused")
		ObjectCount obj2 = new ObjectCount();
		
		@SuppressWarnings("unused")
		ObjectCount obj3 = new ObjectCount();
		
		@SuppressWarnings("unused")
		ObjectCount obj4 = new ObjectCount();
		
		@SuppressWarnings("unused")
		ObjectCount obj5 = new ObjectCount();
		
		System.out.println(count);
	}
}
