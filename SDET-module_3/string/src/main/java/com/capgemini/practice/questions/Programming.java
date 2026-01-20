package com.capgemini.practice.questions;

import java.util.Scanner;



public interface Programming {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter your string: ");
		String input=sc.next();
		String half=input.substring(4);
		String otherHalf=input.substring(0,4);
		String up=otherHalf.toUpperCase();
		String rev="";
		char[] arr=half.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			rev = rev+arr[i];
			
		}
		String value=rev+up;
		System.out.println(value);
	
}

}
