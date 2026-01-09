class SoftwareDeveloper extends Employee{
	String desingnation;
	double salary;
	String role;
	double incentive;

	static  String department;
	static String branch;
	static String company;

	static {
		department ="Software Department";
		branch="jalandhar";
		company="Test Yantra";
		city ="Amritsar";
		state="Punjab";
		country ="India";

	}

	public void task(){
		System.out.println("Developing the software");
	}

	public void reverseKT(){
		System.out.println("Explanation about lastet software development and  tools and technology");
	}

	public void displaySoftwareDeveloperInfo(){
		System.out.println("Software Developer Info");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _");
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Mail ID : "+mailId);
		System.out.println("Contact Number : "+contactNumber);
		System.out.println("Designation: "+desingnation);
		System.out.println("Salary: "+ salary);
		System.out.println("Role: "+role);
		System.out.println("Incentive: "+incentive);
		System.out.println("Company: "+company);
		System.out.println("Branch: "+branch);
		System.out.println("Department: "+department);
		System.out.println("City : "+city);
		System.out.println("State : "+state);
		System.out.println("Country : "+country);
		System.out.println();
	}
}