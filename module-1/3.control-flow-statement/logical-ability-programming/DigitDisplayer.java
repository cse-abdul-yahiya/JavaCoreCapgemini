class DigitDisplayer{
	public static void main(String[] args) {
		int n=1234;
		int r=0;
		for(int t = n; t !=0; t/=10){
			r = t%10;
			System.out.print(r);
		}
	}
} 