/**
 * 
 */
package com.capgemini.throwable;

import java.util.Scanner;

/**
 * 
 */
public interface ScannerExc {
	public static void execution() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the id");
			int id = sc.nextInt();
			System.out.println("Id : "+id);
			System.out.println("Enter the contact number");
			long contactNumber= sc.nextLong();
			System.out.println("Contact Number : "+contactNumber);
		}
		catch(Throwable throwable) {
			System.out.println("Invalid Input ! Please try Again!");
		}
		finally {
			sc.close();
			System.out.println("Resource Closed!");
			
		}
	}

}
