// write a program to create private variables with getter and setter methods.
public class Bankaccount {
     private int accountNumber;
     private double balance;
     // step 2 setter methods to assign values

     public void setaccountnumber(int accountnumber) {

          this.accountNumber = accountnumber;

     }

     public void setbalance(double balance) {

          this.balance = balance;

     }

     // step 3 getter methods to access values
     public int getaccountnumber() {
          return accountNumber;
     }

     public double getbalance() {
          return balance;

     }
     public static void main(String[] args) {
          // step 4 create object
          Bankaccount account = new Bankaccount();

          // step 5 set values using setter methods
          account.setaccountnumber(345666);
          account.setbalance(5000.75);

          // step 6 access values using getter methods
          System.out.println("Account Number: " + account.getaccountnumber());
          System.out.println("Balance: " + account.getbalance());
     }
     
}
