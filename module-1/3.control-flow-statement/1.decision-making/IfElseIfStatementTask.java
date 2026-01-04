class IfElseIfStatementTask{
	public static void main(String[] args){
		char signal = 'y';
		if((signal=='R') || (signal=='r')){
			System.out.println("Please Stop! Have Some Patience!");
		}
		else if((signal =='Y' ) || (signal=='y')){
			System.out.println("Please Get Set Ready! Have some excitement!!");
		}
		else if((signal=='G') || (signal=='g')){
			System.out.println("Plese Get Lost! Have Some Ethics!");
		}
		else{
			System.out.println("Do whatever You Want!");
		}
	}
}