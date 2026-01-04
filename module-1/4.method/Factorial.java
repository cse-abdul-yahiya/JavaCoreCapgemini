class Factorial{
	public static void fact(int n){
		int p=1;
		for(int i=1; i<=n;i++){
			p=p*i;
		}
		System.out.println("Factorial of "+n+ " is " + p);
	}
}