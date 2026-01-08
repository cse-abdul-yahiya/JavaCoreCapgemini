class Instagram extends SoftwareApplication{

    @Override
	public void open(){
		System.out.println("Instagram Opened");
	}

	@Override
	public  void signUp(){
		System.out.println("Sign up for continue further");
	}
    @Override
	public  void signIn(){
		System.out.println("Sign In to Instagram");
	}
    @Override
	public  void signOut(){
		System.out.println("Sign Out from Instagram");
	}

	@Override
	public void close(){
		System.out.println("Instagram Closed");
		System.out.println();
	}



}