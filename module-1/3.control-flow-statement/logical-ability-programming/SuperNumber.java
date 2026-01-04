class SuperNumber{

	//Super number:-even digit sum is equal to odd digit sum, 
	//eg-1254 in this 1 &5 is odd digit whose sum is & 1,5 is even digit whose sum is also 6.
	public static void main(String[] args) {
		int n =1254;
		int r;
		int evenDigitSum=0;
		int oddDigitSum=0;
		for(int t=n; t!=0; t/=10){
			r=t%10;
			if(r%2==0){
				evenDigitSum=evenDigitSum+r;
			}
			else{
				oddDigitSum=oddDigitSum+r;
			}
		}
		if(evenDigitSum==oddDigitSum){
			System.out.println("it is a super Number");
		}
		else{
			System.out.println("it is a Not super Number");
		}

	}
}