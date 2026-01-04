class Student{
	int id;
	String name;
	String mailId;
	long contactNo;
	static String city;
	static String state;
	static String country;


    //this keyword is used to diffreneciat ebetween local and global variable
    //it have address of object of non static variable
	Student(int id, String name, String mailId,
long contactNo){
		this.id=id;
		this.name=name;
		this.mailId=mailId;
		this.contactNo=contactNo;
	}
	//static variable initilizer
	static{

		city ="Jalandhar";
		state="Punjab";
		country="India";
	
	}
	//non static variable initilizer
	//it should not be preffferd because it will cause object dublication like static initilizer
	//this is the main reason to use constructor
	// {
	// 	id=1;
	//     name="Abdul";
	//     mailId="abdul9973@gmail.com";
	//     contactNo=9973914185l;
	// }


	public void displayStudentDetails(){
		System.out.println("Student Details");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _");
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Mail ID : "+mailId);
		System.out.println("Contact Number : "+contactNo);
		System.out.println("City : "+city);
		System.out.println("State : "+state);
		System.out.println("Country : "+country);
		System.out.println();
	}
}