class Facebook extends SoftwareApplication{
	@Override
	public void open(){
		System.out.println("Facebook Opened");
	}

	@Override
	public  void signUp(){
		System.out.println("Sign up for continue further");
	}
    @Override
	public  void signIn(){
		System.out.println("Sign In to facebook");
	}
    @Override
	public void signOut(){
		System.out.println("Sign Out from Facebook");
	}
	@Override
	public void close(){
		System.out.println("Facebook Closed");
	}
}