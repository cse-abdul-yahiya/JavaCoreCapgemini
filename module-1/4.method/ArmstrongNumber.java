import java.util.*;
class ArmstrongNumber{
	public static void isArmstrongNumber(int n){
		int originalNum=n;
		int r;
		int sum=0;
		int count =0;
		for(int t=n; t!=0;t/=10){
			// r=t%10;
			count++;
		}
		for(int t=n; t!=0; t/=10){
			r=t%10;
			sum=sum+(int)Math.pow(r,count);
		}

       if (sum == originalNum)
           System.out.println(n+" is  Armstrong Number");
       else
           System.out.println(n+ " is Not Armstrong Number");
	}
}