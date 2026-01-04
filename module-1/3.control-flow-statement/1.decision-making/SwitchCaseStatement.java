class SwitchCaseStatement{
	public static void main(String[] args){
		System.out.println("Start");
		int choice = 4;
		switch(choice){
		   case 1 : {
              System.out.println("Statement-1");
		   }
		   break;

		   case 2 : {
              System.out.println("Statement-2");
		   }
		   break;

		   case 3 : {
              System.out.println("Statement-3");
		   }
		   break;

		   default : {
		   	  System.out.println("Invalid Choice!! Please try again...");
		   }
		}
		System.out.println("End");
	}
}