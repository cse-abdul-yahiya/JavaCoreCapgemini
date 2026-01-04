class JavaApplication{
	public static void execution(){
		Student p = new Student(1,"Abdul","abdul9973@gmail.com",9973914185l);

		// p.id=2; //cte bzc it is final variable so we cannot update it
		p.displayStudentInfo();
	}
}