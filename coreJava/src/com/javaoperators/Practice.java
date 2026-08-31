package com.javaoperators;

public class Practice {

	public static void main(String[] args) {
		int x  = 555, y  = -66, z = 7;
		
		int max = x>y?(x>z?x:z):(y>z?y:z);
		int min = x<y?x<z?x:z:y<z?y:z;
		System.out.println("MAX: "+max);
		System.out.println("MIN: "+min);
		
	}

}
