import java.util.Scanner;

class JavaApplication{
	public static void execution(){
		Scanner sc = new Scanner(System.in);

		// System.out.println("Enter Number which you have to check: ");
		// int n = sc.nextInt();
	

		// ArithmeticOperation
		ArithmeticOperation.addition(2,3);
		ArithmeticOperation.subtraction(7,4);
		ArithmeticOperation.multiplication(5,6);
		ArithmeticOperation.division(16,8);
		ArithmeticOperation.modulas(12,5);



		//NumberDisplayerSystem
		// System.out.println("Enter starting point of integer type: ");
		// int s = sc.nextInt();
		// System.out.println("Enter ending point of integer type: ");
		// int e = sc.nextInt();
		// NumberDisplayerSystem.series(s,e);
         
        //CharacterDisplayerSystem
        // System.out.println("Enter starting character: ");
        // char s = sc.next().charAt(0);

        // System.out.println("Enter ending character: ");
        // char e = sc.next().charAt(0);
		// CharacterDisplayerSystem.charDisplay(s,e);

		// Number.isDeficientPerfectAbundent(n);

		
        // System.out.println("Enter The number");
        // int n = sc.nextInt();
        // Factorial.fact(n);
		// StrongNumber.isStrongNumber(144);


		//DivisorOrFactor
		// System.out.println("Enter The number");
        // int n = sc.nextInt();
        // DivisorOrFactor.isDivisorOrFactor(n);


        // DeficientPerfectAbundent
        // System.out.println("Enter The number");
        // int n = sc.nextInt();
        // DeficientPerfectAbundent.isDeficientPerfectAbundent(n);

        // SpecialNumber
        // System.out.println("Enter The number");
        // int n = sc.nextInt();
        // SpecialNumber.isSpecialNumber(n);


        // HarshadNumber
        // System.out.println("Enter The number");
        // int n = sc.nextInt();
        // HarshadNumber.isHarshadNumber(n);

        // NeonNumber
        // System.out.println("Enter a Number: ");
        // int n = sc.nextInt();
        // NeonNumber.isNeonNumber(n);


        // PrimeOrComposite
        // System.out.println("Enter a Number: ");
        // int n = sc.nextInt();
        // PrimeOrComposite.isPrimeOrComposite(n);

        // ArmstrongNumber
        // System.out.println("Enter a Number: ");
        // int n = sc.nextInt();
        // ArmstrongNumber.isArmstrongNumber(n);


        // PalindromNumber
        // System.out.println("Enter a Number: ");
        // int n = sc.nextInt();
        // PalindromNumber.isPalindromNumber(n);


        // PalindromPrimeOrComposite


        // PalindromPrimeOrComposite.isPalindromPrimeOrComposite(n);


        // RamanujanNumber
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        RamanujanNumber.isRamanujanNumber(n);

	}
}