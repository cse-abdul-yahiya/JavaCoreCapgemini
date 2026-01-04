import java.util.*;
class JavaApplication{
	static StudentOperation s;
	public static void execute(){
		// StudentOperation s;
		Scanner sc = new Scanner(System.in);
		boolean selection=true;
		while(selection){
			System.out.println("Student Details");
			System.out.println("****************");
			System.out.println("Select Your Choice");
			System.out.println("1.Create Student");
			System.out.println("2.Insert Student");
			System.out.println("3.Read Student");
			System.out.println("4.Update Student");
			System.out.println("5.Delete Student");
			System.out.println("6.Exit");
			int choice = sc.nextInt();
			switch(choice){
			case 1:
				s = new StudentOperation();
				s.create();
				break;
			case 2:
				s.insert();

				break;
			case 3:
				s.read();
				break;
			case 4:
				s.update();
				break;
			case 5:
				s = null;
				System.out.println("Object deleted Successfuulllyyy");
				break;
			case 6:
				s.exit();
				selection=false; 
				break;
			default:
				System.out.println("Invalid Choice");

			}
		}


		}
	}
