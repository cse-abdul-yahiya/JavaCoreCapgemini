class DivisorOrFactor{
	public static void isDivisorOrFactor(int n){
		System.out.print("Divisors or Factors of " + n + ": ");
		for(int i=1;i<=n;i++){
			if(n%i==0){
				System.out.print(i+" ");
			}
		}
	}
}