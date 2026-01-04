import java.util.*;
class StudentOperation{
	int id;
	String name;
	long contactNumber;

	Scanner sc = new Scanner(System.in);
	public  void create(){
		System.out.println("Student is created :");
			}

	public void insert(){
		// System.out.println("Id: "+id);
		System.out.println("Enter You Details");
		System.out.println("Enter your id");
		id =sc.nextInt();
		sc.nextLine();

		System.out.println("Enter student Name: ");
		name = sc.nextLine();
		System.out.println();
		System.out.println("Enter Your contact number: ");
	    contactNumber=sc.nextLong();
		System.out.println();
		System.out.println("Insert Successfully");

	}
	public void read(){
		System.out.println("Id: "+id);
		System.out.println("Student Name is: "+name);
		System.out.println("Student Contact Number is: "+contactNumber);
	}

	public void update(){
		System.out.println("Enter your new contact number");
		contactNumber=sc.nextLong();
		System.out.println();

	}
	// public void delete(StudentOperation s){
	// 	s=null;
	// 	System.out.println("Student is deleted Successfuulllyyy");

	// }
	public void exit(){
		System.out.println("Thank You!!");
	}

}