abstract class Employee{
	int id;
	String name;
	String mailId;
	long contactNumber;
	Employee(int id, String name,String mailId,long contactNumber){
		this.id=id;
		this.name=name;
		this.mailId=mailId;
		this.contactNumber=contactNumber;
	}

	static String city;
	static String state;
	static String country;

	public void entry(){
		System.out.println("Emplpoyee will enter into the campus !");
	}
	public void login(){
		System.out.println("Emplpoyee will login into the office !");
	}
	public void meeting(){
		System.out.println("Employee is in meeting");
	}
	public abstract void reverseKT();
	public abstract void task();
	public abstract void employeeInfo();

	public void logout(){
		System.out.println("Employee will logout from the office!");
	}
	public void exit(){
		System.out.println("Empoyee exit from office");
	}


}