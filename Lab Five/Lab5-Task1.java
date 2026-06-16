class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private static String bankName = "Brac Bank";

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("24784734234", "Nadim Mahmud", 23842.0);
        BankAccount account2 = new BankAccount("24627846231", "Shahedul Islam", 50000.0);

        BankAccount.showBankName();
        
        System.out.println("\nAccount 1 Details:");
        account1.displayAccountDetails();
        
        System.out.println("\nAccount 2 Details:");
        account2.displayAccountDetails();
    }
}