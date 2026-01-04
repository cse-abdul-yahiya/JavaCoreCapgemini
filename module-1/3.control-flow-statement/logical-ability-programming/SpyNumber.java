import java.util.*;

//Spy Number:- Digit sum is equal to digit product. eg. 123 in which sum is 6 and digit product is also 6
class SpyNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		int rem;
		int sum=0;
		int product=1;
		for(int t=n ; t!=0; t/=10){
			rem=t%10;
			sum=sum+rem;
			product=product*rem;
		}
		if(product ==sum){
			System.out.println("This is a Spy Number");
		}
		else{
			System.out.println("This is a not Spy Number");
		}
	}
}