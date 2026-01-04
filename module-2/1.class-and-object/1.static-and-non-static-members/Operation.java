import java.util.*;
class Operation{
	public static void op(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int a= n*n;
		// int b= n**(1/2);
		System.out.println("Square of "+n+" is: "+a);
		for(int i=1;i<=n;i++){
			if((i*i)=n){
				System.out.println();
			}
		}

	}
}