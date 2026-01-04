class PalindromPrimeOrComposite{
	public static boolean isPalindrom(int n){
		int rem=0;
		int rev =0;
		for(int t=n; t!=0; t/=10){
			rem = t%10;
			rev = (rev *10)+rem;
		}
		if(rev==n){
			return true;
		}
		else{
			return false;
		}
	}
	public static void isPrimeOrComposite(int n){
		 int c=0;
		 if(isPalindrom(n)){
		 	   for(int i=2;i<=n/2;i++){
        	if(n%i==0){
        		c++;
        	}
        }
        if(c==0){
        	System.out.println(n+" is a Palindrom Prime");
        }
        else{
        	System.out.println(n + " is Palindrom Composite");
        }
	}
	else{
		System.out.println(n +" is neither Palindrom Prime nor Palindrom Composite ");
	}
     
        
	}
	

	

}