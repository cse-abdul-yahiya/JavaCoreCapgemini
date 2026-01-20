/**
 * 
 */
package com.capgemini.different_way_to_print_collection;

import java.util.HashMap;

/**
 * 
 */
public class Map {
	public static void map() {
		HashMap<Integer, Double> hm = new HashMap<Integer, Double>();
		hm.put(1,11.11);
		hm.put(-2, -22.22);
		hm.put(3, 33.33);
		hm.put(-4, -44.44);
		System.out.println(hm);
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		hm.replace(-2, 123.33);//to update
		hm.remove(3);
		System.out.println(hm);
		
		
	}

}
