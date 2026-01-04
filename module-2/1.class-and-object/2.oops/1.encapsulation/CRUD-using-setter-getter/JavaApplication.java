import java.util.*;
class JavaApplication{
	static Employe e;
	public static void execute(){
		// StudentOperation s;
		Scanner sc = new Scanner(System.in);
		boolean selection=true;
		while(selection){
			System.out.println("Employe Details");
			System.out.println("****************");
			System.out.println("Select Your Choice");
			System.out.println("1.Create Employe ");
			System.out.println("2.Read Employe");
			System.out.println("3.Update Employe");
			System.out.println("4.Delete Employe");
			System.out.println("5.Exit");
			int choice = sc.nextInt();
			switch(choice){
			case 1:
				
				System.out.println("Eployee Created Successfuulllyyy");
				break;
			case 2:
				 System.out.println("Enter Employee Details:");

			    System.out.print("Enter Id: ");
			    int id = sc.nextInt();
			    sc.nextLine();

			    System.out.print("Enter Name: ");
			    String name = sc.nextLine();

			    System.out.print("Enter Contact Number: ");
			    long contactNumber = sc.nextLong();
			    sc.nextLine();

			    System.out.print("Enter Email: ");
			    String mailId = sc.nextLine();

			    System.out.print("Enter Designation: ");
			    String designation = sc.nextLine();

			    System.out.print("Enter Role: ");
			    String role = sc.nextLine();

			    System.out.print("Enter Salary: ");
			    long salary = sc.nextLong();

			    System.out.print("Enter Experience: ");
			    double yearOfExperience = sc.nextDouble();

			    e = new Employe(id,name,contactNumber,mailId,designation,role,salary,yearOfExperience);

			    System.out.println("\n------ Employee Details ------");
			    System.out.println("Id: " + e.getId());
			    System.out.println("Name: " + e.getName());
			    System.out.println("Contact: " + e.getContactNumber());
			    System.out.println("Email: " + e.getMailId());
			    System.out.println("Designation: " + e.getDesignation());
			    System.out.println("Role: " + e.getRole());
			    System.out.println("Salary: " + e.getSalary());
			    System.out.println("Experience: " + e.getYearOfExperience());
                break;
			case 3:
				System.out.println("Enter Updated mail: ");
				e.setMailId(sc.nextLine());

				System.out.println("Enter updated designation: ");
				e.setDesignation(sc.nextLine());

			    System.out.print("Enter updated Role: ");
			    e.setRole(sc.nextLine());

			    System.out.print("Enter updated Salary: ");
   				e.setSalary(sc.nextLong());
   				
				System.out.println("Updated Email: "+e.getMailId());
				System.out.println("Updated Designation: "+e.getDesignation());
				System.out.println("Updated Role: "+e.getSalary());
				System.out.println("Updated Salary: "+e.getSalary());
				System.out.println("Current Year Of experience: "+e.getYearOfExperience());
				break;
			case 4:
				e = null;
				System.out.println("Object deleted Successfuulllyyy");
				break;
			case 5:
				System.out.println("Thank You!!");
				selection=false; 
				break;
			default:
				System.out.println("Invalid Choice");

			}
		}


		}
	}
