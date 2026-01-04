class DeficientPerfectAbundent{
	public static void isDeficientPerfectAbundent(int n){
		int sum = 0;
		for(int i = 1;i<n;i++){
			if(n%i==0){
				sum=sum+i;
			}
		}
		if(sum==n){
			System.out.println(n+ " is a perfect Number");
		}
		else if(sum<n){
			System.out.println(n+ " is a Deficient Number");
		}
		else if(sum>n){
			System.out.println(n+ " is a Abundent Number");
		}
		else{
			System.out.println("Invalid Number");
		}
	}
}