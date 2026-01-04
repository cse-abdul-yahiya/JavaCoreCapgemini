class JavaApplication{
	public static void execution(){
		// Student.city ="Jalandhar";
		// Student.state="Punjab";
		// Student.country="India";
	    
	    //parametarized constructor
	    Student student1 = new Student(1,"Abdul","abdul9973@gmail.com",9973914185l);
	    System.out.println("Student1 : "+student1);
	    // student1.id=1;
	    // student1.name="Abdul";
	    // student1.mailId="abdul9973@gmail.com";
	    // student1.contactNo=9973914185l;
	    student1.displayStudentDetails();

        
        //parametarized constructor
	    Student student2 = new Student(2,"Alok","alok993@gmail.com",9973967185l);
	    System.out.println("Student2 : "+student2);
	    // student2.id=2;
	    // student2.name="Alok";
	    // student2.mailId="alok993@gmail.com";
	    // student2.contactNo=9973967185l;
	    student2.displayStudentDetails();


	    // System.out.println(Members.sv);
	    // Members.sm();

	    // Members ns=new Members();
	    // System.out.println(ns.nsv);
	    // ns.nsm();


	    //contructor called statement
	    // Test t1= new Test();
	    // Test t2= new Test();


	}
}
