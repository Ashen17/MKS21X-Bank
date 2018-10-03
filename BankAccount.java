public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int newAccountID, double newBalance, String newPassword){
    balance = newBalance;
    accountID = newAccountID;
    password = newPassword;
  }
  public double getAccountID(){
    return accountID;
  }

  public double getBalance(){
    return balance;
  }

  public void setPassword(String newPass){
    password = newPass;
  }
  public String toString(){
    return accountID + "\t" + balance;
  }


  public boolean deposit(double amount){
    if (amount >= 0){balance += amount;}
    return amount >= 0;
  }

  public boolean withdraw(double amount){
    if (balance > amount){
      balance -= amount;
    }
    return balance > amount;
  }
}
