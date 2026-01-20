/**
 * 
 */
package com.capgemini.throwable;

import java.util.ArrayList;

/**
 * 
 */
public interface JavaApplication {
	public static void execution() {
		try {
			ArrayList<Integer> al = new ArrayList<Integer>();
			for (int i = 1; i < 5; i++) {
				al.add(i);
				
			}
			for (int i = 0; i <= al.size(); i++) {
				System.out.println(al.get(i));
				
			}
			Integer[] integers = new Integer[5];
			for (int i = 0; i < integers.length; i++) {
				integers[i]= i+1;
			}
			for (int j = 0; j < integers.length; j++) {
				System.out.println(integers[j]);
			}
			String s = "09AZaz";
			for (int k = 0; k < s.length(); k++) {
				System.out.println(s.charAt(k));
				
			}
			
		}
		catch(Throwable throwable) {
			throwable.printStackTrace();
			System.out.println("Exception handeled");
		}
	}

}
