public class Driver{
  public static void main(String[] args){
    BankAccount TeacherAccount = new BankAccount(576223, 1000, "Konstantinovich");
    BankAccount RandomStudentAccount = new BankAccount(313144, 0, "Allen");
    System.out.println(TeacherAccount.getAccountID());//576223
    System.out.println(RandomStudentAccount.getAccountID());//313144
    System.out.println(TeacherAccount.getBalance());//1000
    System.out.println(RandomStudentAccount.getBalance());//0
    System.out.println(TeacherAccount);//576223 1000
    System.out.println(RandomStudentAccount);//313144 0
    System.out.println(TeacherAccount.deposit(4000));//true
    System.out.println(TeacherAccount.getBalance());//5000
    System.out.println(TeacherAccount.withdraw(5000));//true
    System.out.println(TeacherAccount.getBalance());//0
    System.out.println(RandomStudentAccount.deposit(2.52));//true
    System.out.println(RandomStudentAccount.getBalance());//2.52
    System.out.println(RandomStudentAccount.deposit(-2));//false
    System.out.println(RandomStudentAccount.withdraw(3));//false
    System.out.println(RandomStudentAccount.getBalance());//2.52
    RandomStudentAccount.setPassword("T-shirt");
    TeacherAccount.setPassword("Cool T-shirt");
  }


}
