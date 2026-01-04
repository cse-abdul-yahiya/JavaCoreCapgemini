import java.util.*;
class Calculator{
	public static void calculator(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your first Integer: ");
		int i = sc.nextInt();
		System.out.println("Enter Your Second Integer: ");
		int j = sc.nextInt();
		int choice;
		// boolean  = true;
	do{
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.division");
		System.out.println("5.Exit");

		
		System.out.println("Enter your choice");
		choice = sc.nextInt();
			switch(choice){
		    case 1:{
               int a =Math.addExact(i,j);
               System.out.println("Addition of "+i + " and " + j +" is " + a);
		   }
		   break;

		    case 2:{
		    	int b = Math.subtractExact(i,j);
		    	System.out.println("Subtraction of "+i + " and " + j +" is " + b);

		    }break;

		    case 3:{
		    	int  c= Math.multiplyExact(i,j);
		    	System.out.println("Multiplication of "+i + " and " + j +" is " + c);
		    }break;

		     case 4:{
		    	int  d= Math.floorDiv(i,j);
		    	int  e= Math.floorMod(i,j);
		    	System.out.println("Division of "+i + " and " + j +" is " + d + " and remainder is "+ e);
		    }break;

		    case 5:{
		    	System.out.println("Thank You! Visit Again");
		    }break;

		    default:{
		    	System.out.println("Invalid Choice");
		    }

		}
	}while(choice!=5);
		
		
		
	}

}