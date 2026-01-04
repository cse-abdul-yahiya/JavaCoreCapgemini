import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder name: ");
        String accountHolder = sc.nextLine();

        System.out.print("Enter Initial Account Balance: ");
        double accountBalance = sc.nextDouble();

        BankAccount ac = new BankAccount(accountHolder, accountBalance);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        ac.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        ac.withdraw(withdrawAmount);
        
        ac.showCurrentBalance();

        System.out.println("Final Balance using getter: " + ac.getAccountBalance());
    }
}
