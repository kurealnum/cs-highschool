public class BankAccount {
    private String name;
    private Integer accountNumber;
    private Double balance;

    public BankAccount(String name, Integer accountNumber, Double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(String name, Integer accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String toString() {
        return this.name
                + " with account number "
                + accountNumber
                + " has "
                + balance
                + " dollars in their account. ";
    }

    public void withdraw(Double amount) {
        if (this.balance - amount > 0) {
            this.balance -= amount;
        }
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public static void main(String args[]) {
        BankAccount myAccount = new BankAccount("Oscar", 12345678, 500.00);
        myAccount.withdraw(100.0);
        myAccount.deposit(200.0);
        System.out.println(myAccount.toString());
    }
}
