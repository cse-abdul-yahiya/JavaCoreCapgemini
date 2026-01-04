class StrongNumber{
	public static void isStrongNumber(int n){
		int r = 0;
		int sum = 0;
		for(int t = n; t!=0; t/=10){
			r = t%10;
			sum+=fact(r);
		}
		if(sum==n){
		System.out.println("it is a Strong Number");
			}
	else{
		System.out.println("it is Not a Strong Number");
	}
}

	public static int fact(int n){
		int f = 1;
		for(int i = 1; i<=n; i++){
			f= f*i;
		}
		return f;
	}
}