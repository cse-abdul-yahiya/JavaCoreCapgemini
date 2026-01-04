class HarshadNumber{
	public static void isHarshadNumber(int n){
	int r=0;
	int sum=0;
	for(int t = n; t !=0; t/=10){
		r = t%10;
		sum=sum+r;
	
	}
	if(n%sum==0){
			System.out.println( n+" is a Harshad Number");
		}
		else{System.out.println( n+" is Not a Harshad Number");
		}
	}	
}