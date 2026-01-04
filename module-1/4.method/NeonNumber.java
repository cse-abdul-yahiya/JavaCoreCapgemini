class NeonNumber{
	public static void isNeonNumber(int n){
		int r;
		int sum =0;
		for(int t=n*n; t!=0; t/=10){
			r=t%10;
			sum = sum+r;
		}
		if(sum==n){
			System.out.println(n+" is Neon Number");
		}
		else{
			System.out.println(n+" is not Neon Number");
		}
	}
}