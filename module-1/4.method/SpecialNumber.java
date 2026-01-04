class SpecialNumber{
	public static void isSpecialNumber(int n){
		int originalNum=n;
		int r;
		int sum =0;
		int product = 1;
		while(n!=0){
			r=n%10;
			sum =sum+r;
			product=product*r;
			n=n/10;
		}
		int finalNum=sum+product;
		if(finalNum==originalNum){
			System.out.println(originalNum+ " is a Special Number");
		}
		else{
			System.out.println(originalNum+ " is a not Special Number");
		}
	}
}