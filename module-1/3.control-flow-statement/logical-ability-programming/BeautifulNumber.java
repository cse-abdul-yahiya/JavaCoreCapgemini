import java.util.*;
class BeautifulNumber{

	//BeautifulNumber:- even digit count == odd digit count
	public static void main(String[] args) {
		int n=12345;
		int r;
		int countEven=0;
		int countOdd=0;
		while(n!=0){
			r=n%10;
			n=n/10;
			if(r%2==0){
				countEven++;
			}
			else{
				countOdd++;
			}
		}
		if(countEven==countOdd){
			System.out.println("It is a Beautiful Number");
		}
		else{
			System.out.println("It is a not Beautiful Number");
		}
	}
}