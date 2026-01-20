/**
 * 
 */
package com.capgemini.java_development.module_3_class_object;

/**
 * 
 */
public class JavaApplication {
	public static void execution() {
		Student student = new Student();
		student.setId(1);
		student.setName("Abdul");
		student.setMailId("abdul2@gmail.com");
		student.setContactNumber(9973914183l);
		
		System.out.println(student);
	}

}
