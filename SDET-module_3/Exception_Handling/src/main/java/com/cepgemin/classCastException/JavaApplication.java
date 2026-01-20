/**
 * 
 */
package com.cepgemin.classCastException;

/**
 * 
 */
public interface JavaApplication {
//	public static void execution() {
//		Object o = new A();
//		try{
//			B b=(B) o;
//			System.out.println("Typecasting done succcexxfullyy");
//		}
//		catch(ClassCastException classCastException) {
//			System.err.println("Non Related Entity Typecasting");
//		}
//	
//	}
	
	class ReverseString {
	    public static void main(String[] args) {
	        String s = "Java Main";
	        String rev = "";

	        for (int i = s.length() - 1; i >= 0; i--) {
	            rev = rev + s.charAt(i);
	        }

	        System.out.println(rev);
	    }
	}


}
