class Student{
	private int id;
	private String name;
	private String mailId;
	private long contactNumber;

	//Student HAS-A project
	private Project project;



	public Student(){

	}

	public Student(int id,String name,String mailId,long contactNumber){
		this.id=id;
		this.name=name;
		this.mailId=mailId;
		this.contactNumber=contactNumber;

	}



	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id=id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getMailId(){
		return mailId;
	}

	public void setMailId(String mailId){
		this.mailId=mailId;
	}

	public long getContactNumber(){
		return contactNumber;
	}

	public void setContactNumber(long contactNumber){
		this.contactNumber=contactNumber;
	}

	public Project getProject(){
		return project;
	}

	public void setProject(Project project){
		this.project=project;
	}

	public void displayStudentInfo(){
		System.out.println("Student Info");
		System.out.println("-------------");
		System.out.println("Id: "+getId());
		System.out.println("Name :"+getName());
		System.out.println("Email: "+getMailId());
		System.out.println("Contact: "+getContactNumber());
		System.out.println("-------------");
		System.out.println();

	}


	public void createProject(Project project){
		if((this.project==null) && (project!=null)){
			// this.project=project;

			setProject(project);
			System.out.println("Project is created successfully");
			System.out.println();
			System.out.println();
			System.out.println();
		}else{
			System.out.println("Project Not Created ");
		}
	}

	public void readProject(){
		if(this.project!=null){
			this.getProject().displayProjectInfo();
			System.out.println("Project Displayed!");
			System.out.println("-------------");
			System.out.println();
			System.out.println();

		}else{
			System.out.println("No Existing Project");
		}
	}

	public void updateProject(int id, String name,String description){
		if(id > 0 && name!=null && description!=null){
			if(this.getProject().getId()==id){
				this.getProject().setName(name);
				this.getProject().setDescription(description);
				System.out.println("Project Updated !");
				System.out.println();
			}else{
				System.out.println("Project not updated");
			}
		}else{
			System.out.println("Invalid data !");
		}


	}

	public void deleteProject(int id){
		if(id>0){
			if(this.getProject().getId()==id){
				this.setProject(null);
			System.out.println("Project Deleted successfully");
			System.out.println();
			}else{
				System.out.println("Project not found");
			}
			
		}else{
			System.out.println("Invalid Data");
		}

	}
}