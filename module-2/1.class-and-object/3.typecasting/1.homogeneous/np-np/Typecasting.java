class Typecasting{
	public static void upcastingDowncasting(){
		//generic container
		Employee employee;
		employee = new SoftwareDeveloper();
		employee.entry();
		employee.login();
		employee.shortBreak();
		employee.meeting();
		employee.longBreak();
		employee.logout();
		employee.exit();

        //specific container
		SoftwareDeveloper softwareDeveloper =(SoftwareDeveloper)employee;
		softwareDeveloper.displaySoftwareDeveloperInfo();
		softwareDeveloper.reverseKT();
		softwareDeveloper.task();

		System.out.println();

		employee = new SoftwareTester();
		employee.entry();
		employee.login();
		employee.shortBreak();
		employee.meeting();
		employee.longBreak();
		employee.logout();
		employee.exit();

		SoftwareTester softwareTester =(SoftwareTester)employee;
		softwareTester.displaySoftwareTesterInfo();
		softwareTester.reverseKT();
		softwareTester.task();


	}

}