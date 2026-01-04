class JavaApplication{
	public static void execution(){

		Student student =new Student(1,"Abdul","abdul9973@gmail.com", 9973914185l);
        student.displayStudentInfo();


		Project project = new Project(1,"E-commerce","Java based web Application");
		student.createProject(project);
		student.readProject();

		student.updateProject(1,"Airline System","React Based Web Application");
		student.readProject();

        student.deleteProject(1);
        student.readProject();
	}
}