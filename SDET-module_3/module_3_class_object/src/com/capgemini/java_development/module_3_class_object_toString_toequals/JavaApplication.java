package com.capgemini.java_development.module_3_class_object_toString_toequals;

public class JavaApplication {
	public static void execution() {
		Product product1=new Product(1,"Apsara","Pencil",25.56);
		System.out.println(product1);
		
		Product product2=new Product(1,"Apsara","Pencil",25.56);
		System.out.println(product2);
		
		System.out.println(product1.equals(product2));
		
		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
		
	}
	
	

}
