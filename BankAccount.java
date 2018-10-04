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
    //System.out.println("depositing");
    if (amount >= 0){
      //System.out.println("deposited");
      balance += amount;}
    return amount >= 0;
  }

  public boolean withdraw(double amount){
    boolean result = balance >= amount;
    if (result){
      //System.out.println("withdrawn");
      balance -= amount;}
    return result;
  }

  private boolean authenticate(String password){
    //System.out.println("authenticated");
    return password.equals(this.password);
    }
  public boolean transferTo(BankAccount other, double amount, String password){
    return (authenticate(password) && withdraw(amount) && other.deposit(amount));
  }
}
