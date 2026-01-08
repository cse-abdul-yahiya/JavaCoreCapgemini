class SoftwareDeveloper extends Employee{
	String designation;
	double salary;
	String role;
	double incentive;
	static String branch;
	static String department;
	static String company;

	static{
		city= "Jalandhar";
		state= "Pubjab";
		country = "India";
		branch = "Amritsar";
		department ="Software Development";
		company = "Capgemini";
	}
	SoftwareDeveloper
	(int id, String name,String mailId,long contactNumber,String designation,double salary,String role,
		double incentive
	){
		super(id,name,mailId,contactNumber);
		this.designation=designation;
		this.salary=salary;
		this.role=role;
		this.incentive=incentive;

	}
	@Override
	public void reverseKT(){
		System.out.println("Explained about latest Software Development tools and technologies");
	}
	public void task(){
		System.out.println("Software Developement");
		System.out.println();
	}
	public void employeeInfo(){
		System.out.println("Employee info");
		System.out.println("-----------------");
		System.out.println("Id: "+super.id);
		System.out.println("Name: "+super.name);
		System.out.println("Mail Id: "+super.mailId);
		System.out.println("Contact Number: "+super.contactNumber);
		System.out.println("Designation: "+this.designation);
		System.out.println("Salary: "+this.salary);
		System.out.println("Role: "+this.role);
		System.out.println("Incentive: "+this.incentive);
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("Country: "+country);
		System.out.println("Branch: "+branch);
		System.out.println("Department: "+department);
		System.out.println("Company: "+company);
		System.out.println();
	}
}