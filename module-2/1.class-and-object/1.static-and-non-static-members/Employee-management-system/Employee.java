class Employee{
	int id;
	String name;
	int age;
	String gender;
	String dateOfBirth;
	String mailId;
	long contactNumber;
	long aadharNo;
	String panNo;
	String maritalStatus;
	static String company;
	String branch;
	String department;
	String reportingManager;
	String designation;
	double salary;
	String role;
	double incentive;
	long uanNumber;
	double yearOfExperience;
	static String city;
	static String state;
	static String country;

	public void displayEmployeDetails(){
		System.out.println("Employe Details ");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _");
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age: "+ age);
		System.out.println("Gender "+ gender);
		System.out.println("Date Of Birth "+ dateOfBirth);
		System.out.println("Mail ID : "+mailId);
		System.out.println("Contact Number : "+contactNumber);
		System.out.println("Aadhar No: "+ aadharNo);
		System.out.println("Pan Number : "+panNo);
		System.out.println("Marital Status: "+maritalStatus);
		System.out.println("Company: "+company);
		System.out.println("Branch: "+branch);
		System.out.println("Department: "+department);
		System.out.println("Reporting Manager: "+reportingManager);
		System.out.println("Designation: "+designation);
		System.out.println("Salary: "+ salary);
		System.out.println("Role: "+role);
		System.out.println("Incentive: "+incentive);
		System.out.println("UNA number: "+uanNumber);
		System.out.println("Year of Experience: "+ yearOfExperience);
		System.out.println("City : "+city);
		System.out.println("State : "+state);
		System.out.println("Country : "+country);
		System.out.println();

	}
	public void entry(){
		System.out.println("You have enter in the company");

	}
	public void login(){
		System.out.println("You have been login successfully");

	}
	public void shortBreak(){
		System.out.println("You have taken 2 short break");

	}
	public void task(){
		System.out.println("Today task is to work on backend");

	}
	public void update(){
		System.out.println("Data base has been updated");

	}
	public void meeting(){
		System.out.println("You have a metting at 3:00 PM ");

	}

	public void reverseKt(){
		System.out.println("Today i have work on backend and data base");
		
	}
	public void longBreak(){
		System.out.println("Your break time is 1:00 pm - 2:00pm");
		
	}
	public void logOut(){
		System.out.println("You have been logout");
		
	}
	public void exit(){
		System.out.println("Thank You!!");
		System.out.println();
		
	}


}