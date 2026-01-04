class BankAccount{
    private String accountHolder;
    private double accountBalance;

    BankAccount(String accountHolder,double accountBalance){
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount){
        if(amount > 0){
            accountBalance += amount;
            System.out.println("Deposited: " + amount);
        }else{
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= accountBalance){
            accountBalance -= amount;
            System.out.println("Withdrawn: " + amount);
        }else{
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void showCurrentBalance(){
        System.out.println("Current Balance: " + accountBalance);
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public String getAccountHolder(){
        return accountHolder;
    }
}