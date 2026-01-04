class CharacterDisplayerSystem{
	public static void charDisplay(char s, char e){
		if(s<e){
			System.out.print("Forward Series: ");
			for(char i=s;i<=e;i++){
				System.out.print(i + " ");
			}
			System.out.println();
		}
		else if(s>e){
			System.out.print("Backward Series: ");
			for(char i= s; i>=e; i--){
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		else{
			System.out.println("Invalid Char");
		}
	}
}