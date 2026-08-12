package com.corejavaintro;

public class Product {
	
	static String company_name = "VCube";
	String productId;
	String productName;
	int productPrice;
	String productInfo;
	
//	{
//		System.out.println(company_name);
//	}
	
	void show() {
		System.out.println("Product ID: "+ productId);
		System.out.println("Product Name: "+ productName);
		System.out.println("Product Price: "+ productPrice);
		System.out.println("Product Info: "+ productInfo);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product();
		
		p1.productId = "p101";
		p1.productName = "Fan";
		p1.productPrice = 800;
		p1.productInfo = "Electronics";
		
		p2.productId = "p102";
		p2.productName = "Light";
		p2.productPrice = 1800;
		p2.productInfo = "Electronics";
		
		p1.show();
		p2.show();
		
	}
}
