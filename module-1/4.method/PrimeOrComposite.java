class PrimeOrComposite{
	public static void isPrimeOrComposite(int n){
		// int count =0;
		// for(int i=1;i<=n;i++){
		// 	if (n % i == 0) 
		// 	{
		// 		count++;
		// 	}
		// }
		// if(count == 2)
        //    System.out.println(n+" is Prime Number");

        // else if (n > 1)
        //     System.out.println(n+" is Composite Number");

        // else
        //     System.out.println(n+" is Neither Prime nor Composite");



        int c=0;
        for(int i=2;i<n;i++){
        	if(n%i==0){
        		c++;
        	}
        }
        if(n==0 && n==1){
        	System.out.println(n+"Neither Prime nor composite");
        }
        if(c==0){
        	System.out.println(n+ " is Prime");
        }
        else if(c>0){
        	System.out.println(n+" is Composite");
        }

	}
}