class Employee{
	int id;
	String name;
	String mailId;
	long contactNumber;
	static String city;
	static String state;
	static String country;

	public static void entry(){
		System.out.println("Employee can enter int the campus");
	}

	public static void login(){
		System.out.println("Employee can longin into office");
	}
	public static void shortBreak(){
		System.out.println("EMployee wentr for tea");
	}
	public static void meeting(){
		System.out.println("Employe is in meeting");
	}

	public static void longBreak(){
		System.out.println("Employee went for Lunch!!");
	}

	public static void logout(){
		System.out.println("Employe can logout from the office");
	}
	public static void exit(){
		System.out.println("Employee can exit from campus");
	}
}