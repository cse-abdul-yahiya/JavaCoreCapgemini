class JavaApplication{
	public static void execution(){
		System.out.println(SuperInterface.c);
		SuperInterface.sm();
		System.out.println();
		System.out.println(SubConcreteClass.c);
		SubConcreteClass scc=new SubConcreteClass();
		scc.nsm();


	}
}