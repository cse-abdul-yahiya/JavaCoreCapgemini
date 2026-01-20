/**
 * 
 */
package com.capgemini.test;

/**
 * 
 */
public class JavaApplication {
	public static void execution() {
		ProductPojo  product1= new ProductPojo(1,"Pencil", "Apsara",23.32);
		System.out.println(product1);
		
		ProductPojo  product2= new ProductPojo(1,"Pencil", "Apsara",23.32);
		System.out.println(product1);
		
		
		System.out.println(product1.equals(product2));
		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
		System.out.println();
		System.out.println();
		
		
		
		
	}
	
	public static void execution1() {
		ProductBean  product1= new ProductBean(1,"Pencil", "Apsara",23.32);
		System.out.println(product1);
		
		ProductBean  product2= new ProductBean(1,"Pencil", "Apsara",23.32);
		System.out.println(product1);
		
		
		System.out.println(product1.equals(product2));
		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
		System.out.println();
		System.out.println();
		
		
		
		
	}
	
	
	public static void execution2() {
		Product  product1= new Product(1,"Pencil", "Apsara",23.32);
		System.out.println(product1);
		
		Product  product2= new Product(1,"Pencil", "Apsara",23.32);
		System.out.println(product1);
		
		
		System.out.println(product1.equals(product2));
		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
		System.out.println();
		System.out.println();
		
		
		
		
	}

}
