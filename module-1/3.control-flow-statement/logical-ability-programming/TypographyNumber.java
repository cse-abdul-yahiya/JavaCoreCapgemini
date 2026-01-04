import java.util.*;
class TypographyNumber{

	//Typography Number:-The count of digits is equal to the sum of its digits ,eg-111, digit count is 3 and digit sum is also 3

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:  ");
		int n = sc.nextInt();
		int r=0;
		int sum=0;
		int count =0;
		for(int t=n; t!=0;t=t/10){
			r=t%10;
			sum =sum+r;
			count++; //counting digit
		}
		
		if(count ==sum){
			System.out.println("This is a Typography Number");
		}
		else{
			System.out.println("This is a not Typography Number");
		}

	}
}