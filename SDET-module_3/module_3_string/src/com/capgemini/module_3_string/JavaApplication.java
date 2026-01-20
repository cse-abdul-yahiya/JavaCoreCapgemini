package com.capgemini.module_3_string;

public interface JavaApplication {
	public static void execution1() {
		String s1="Java";
		System.out.println(s1);
		
		String s2= new String("Java");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println();
		
		
		
	}
	
	
	
	public static void execution2() {
		StringBuffer s1= new StringBuffer("Java");
		System.out.println(s1);
		
		StringBuffer s2= new StringBuffer("Java");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println();
		
		
	}
	
	public static void execution3() {
		StringBuilder s1= new StringBuilder("Java");
		System.out.println(s1);
		
		StringBuilder s2= new StringBuilder("Java");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println();
		
		
	}

}
