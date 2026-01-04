class Department{
	private int deptId;
	private String deptName;
	private int noOfCourse;
	private String deptHodName;
	private Student student;

	public Department(){

	}

	public Department(int deptId,String deptName,int noOfCourses,String deptHodName){
		this.deptId=deptId;
		this.deptName=deptName;
		this.noOfCourse=noOfCourse;
		this.deptHodName=deptHodName;

	}

	public int getDeptId(){
		return deptId;
	}

	public void setDeptId(int deptId){
		this.deptId=deptId;
	}

	public String getDeptName(){
		return deptName;
	}
	public void setDeptName(String deptName){
		this.deptName=deptName;

	}

	public int getNoOfCourse(){
		return noOfCourse;
	}

	public void setNoOfCourse(int noOfCourse){
		this.noOfCourse=noOfCourse;
	}


	public String getDeptHodName(){
		return deptHodName;
	}
	public void setDeptHodName(String deptHodName){
		this.deptHodName=deptHodName;

	}

	public Student getStudent(){
		return student;
	}

	public void setStudent(Student student){
     this.student=student;
	}

		public void displayDepartmentInfo(){
		System.out.println("Department Info");
		System.out.println("-------------");
		System.out.println("Id: "+getDeptId());
		System.out.println("Name :"+getDeptName());
		System.out.println("No of Courses: "+getNoOfCourse());
		System.out.println("Name of HOD: "+getDeptHodName());
		System.out.println("-------------");
		System.out.println();

	}

	public void createStudent(Student student){
		if((this.student==null) && (student!=null)){
			// this.project=project;

			setStudent(student);
			System.out.println("Student is created successfully");
			System.out.println();
			System.out.println();
			System.out.println();
		}else{
			System.out.println("Student Not Created ");
		}
	}

	public void readStudent(){
		if(this.student!=null){
			this.getStudent().displayStudentInfo();
			System.out.println("Student Displayed!");
			System.out.println("-------------");
			System.out.println();
			System.out.println();

		}else{
			System.out.println("No Existing student");
		}
	}

	public void updateProject(int deptId, String deptName,int noOfCourse,
	String deptHodName)
{
		if(deptId > 0 && deptName!=null && noOfCourse!=null && deptHodName!=null){
			if(this.getStudent().getDeptId()==deptId){
				this.getStudent().setDeptName(deptName);
				this.getStudent().setNoOfCourse(noOfCourse);
				this.getStudent().setDeptHodName(deptHodName);
				System.out.println("Student Updated !");
				System.out.println();
			}else{
				System.out.println("Student not updated");
			}
		}else{
			System.out.println("Invalid data !");
		}




}