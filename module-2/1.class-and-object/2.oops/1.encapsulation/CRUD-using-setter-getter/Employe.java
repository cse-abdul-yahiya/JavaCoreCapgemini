public class Employe{
	private int id;
	private String name;
	private long contactNumber;
	private String mailId;
	private String designation;
	private String role;
	private long salary;
	private double yearOfExperience;


	public Employe( int id,
	String name,long contactNumber,String mailId,String designation,String role,long salary,double yearOfExperience ){
		this.id=id;
		this.name=name;
		this.contactNumber=contactNumber;
		this.mailId=mailId;
		this.designation=designation;
		this.role=role;
		this.salary=salary;
		this.yearOfExperience=yearOfExperience;
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public long getContactNumber(){
		return contactNumber;
	}
	public String getMailId(){
		return mailId;
	} 

	public String getDesignation(){
         return designation;
	}
	public String getRole(){
           return role;
	}
	public double getSalary(){
		return salary;
	}
	public double getYearOfExperience(){
		return yearOfExperience;
	}
	public void setContactNumber(long contactNumber){
		this.contactNumber=contactNumber;
	}
	public void setMailId(String mailId){
		this.mailId=mailId;
	}
	public void setDesignation(String designation)
	{
		this.designation=designation;
	}
	public void setRole(String role){
		this.role=role;
	}
	public void setSalary(long salary){
		this.salary=salary;
	}
	public void setYearOfExperience(double yearOfExperience){
		this.yearOfExperience=yearOfExperience;
	}



}