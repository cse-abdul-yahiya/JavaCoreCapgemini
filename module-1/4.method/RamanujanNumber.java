class RamanujanNumber{
	public static void isRamanujanNumber(int n){
		int r;
		int sum=0;
		int rv;
		int rev=0;
	
		for(int t = n; t!=0; t/=10){
			r=t%10;
			sum=sum+r;
			
		}


		for(int p = sum; p!=0; p/=10){
			rv=p%10;
			rev=(rev*10)+rv;
			
		}
		if((sum*rev)==n){
			System.out.println(n + " is Ramanujan Number");
		}
		else{
			System.out.println(n + " is not Ramanujan Number");
		}

	}

	

	
}
