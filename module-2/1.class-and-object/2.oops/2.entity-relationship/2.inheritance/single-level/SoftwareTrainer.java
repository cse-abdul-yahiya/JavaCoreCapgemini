class SoftwareTrainer extends Employee{
	String desingnation;
	double salary;
	String role;
	double incentive;

	static  String department;
	static String branch;
	static String company;

	static {
		department ="Software Training";
		branch="jalandhar";
		company="Test Yantra";
		city ="Amritsar";
		state="Punjab";
		country ="India";

	}

	public void task(){
		System.out.println("Training the Trainees");
	}

	public void reverseKT(){
		System.out.println("Explanation about lastet software development and testing tools and technology");
	}

	public void displaySoftwareTrainerInfo(){
		System.out.println("Software Trainer Info");
		System.out.println("-------");
	}
}