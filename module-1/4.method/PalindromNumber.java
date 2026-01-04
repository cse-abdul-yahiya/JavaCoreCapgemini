class PalindromNumber{
	public static void isPalindromNumber(int n){
		int rem=0;
		int rev =0;
		for(int t=n; t!=0; t/=10){
			rem = t%10;
			rev = (rev *10)+rem;
		}
		if(n==rev){
			System.out.println(n+" is a Palindrom Number");
		}
		else{
			System.out.println(n+" is not Palindrom Number");
		}
	}
}