class JavaApplication{
	public static void execution(){
		Student s= new Student();
		// //direct read operation-unsafe
		// System.out.println(s.id);
		// System.out.println(s.name);


		//direct update operation-unsafe
		// s.id=1;
		// s.name="Abdul"


       // indirect update operation-safe method using setter method
        s.setId(12);
        s.setName("Abdul");
		//indirect read operation-safe
		System.out.println(s.getId());
		System.out.println(s.getName());
	}
}