public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Implement toString here
    public String toString() {
        return this.name + ", " + this.balance;
    }

    public static void main(String[] args) {
        Account acct1 = new Account("Armani Smith", 1500);
        System.out.println(acct1);
        // Uncomment this code to test SavingsAccount
        SavingsAccount acct2 = new SavingsAccount("Dakota Jones", 1500, 4.5);
        System.out.println(acct2);
    }
}

/*
 * Write the SavingsAccount class which inherits from Account. Add an
 * interest rate instance variable and write a constructor and a toString
 * method.
 */
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String name, double balance, double interestRate) {
        super(name, balance);
        this.interestRate = interestRate;
    }

    public String toString() {
        return super.toString() + ", " + this.interestRate;
    }
}
