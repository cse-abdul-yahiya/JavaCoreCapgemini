class JavaApplication{
	public static void execution(){
		Instagram insta = new Instagram();
		insta.open();
		insta.signUp();
		insta.signIn();
		insta.signOut();
		insta.close();

		Facebook fb=new Facebook();
		fb.open();
		fb.signUp();
		fb.signIn();
		fb.signOut();
		fb.close();




	}
}