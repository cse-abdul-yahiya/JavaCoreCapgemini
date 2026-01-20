/**
 * 
 */
package com.capgemini.arithmetic.exception;

/**
 * 
 */
public interface JavaApplication {
	public static void execution() {
		int i =10;
		System.out.println("i is : "+i);
		int j=0;
		System.out.println("j is : "+j);
		try {
			int q= i/j;
			System.out.println("Division of "+i+" and "+j+" is : "+q);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Cannot Divide any number by zero !");
		}
	}
	
	
	public static void execution1() {
		int i =10;
		System.out.println("i is : "+i);
		int j=0;
		System.out.println("j is : "+j);
		try {
			int q= i/j;
			System.out.println("Division of "+i+" and "+j+" is : "+q);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}


}
