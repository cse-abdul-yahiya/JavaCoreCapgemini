class TypeCasting{
	public static void widening(){
		int i=34;
		System.out.println("i is: "+i);
		double d=i;
		System.out.println("d is: "+d);
		System.out.println();
	}

	public static void narrowing(){
		double d=34.56;
		System.out.println("d is: "+d);
		int i=(int)d;
		System.out.println("i is: "+i);
		System.out.println();
	}


}