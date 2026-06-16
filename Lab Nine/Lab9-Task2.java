class BankAccount{
 private String accountHolderName;
 private int accountNumber;
 private double balance;

 public void setAccountHolderName(String name){
  accountHolderName=name;
 }

 public void setAccountNumber(int number){
  accountNumber=number;
 }

 public void setBalance(double amount){
  if(amount >= 0) {
   balance = amount;
  } else {
   System.out.println("Error: Balance cannot be negative.");
  }
 }

 public String getAccountHolderName(){
  return accountHolderName;
 }

 public int getAccountNumber(){
  return accountNumber;
 }

 public double getBalance(){
  return balance;
 }
}

public class labrptt9 {
 public static void main(String[] args) {

  BankAccount account1 = new BankAccount();

  account1.setAccountHolderName("Abu Taher Nadim");
  account1.setAccountNumber(343284724);
  account1.setBalance(600000);

  System.out.println("Account Holder Name: " +
      account1.getAccountHolderName());

  System.out.println("Account Number : " +
      account1.getAccountNumber());

  System.out.println("Account Balance : $" +
      account1.getBalance());
 }
}