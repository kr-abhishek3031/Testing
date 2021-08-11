package p1;

/*
  Problem1: 9 August 2021
         Create a new class for a bank account
         Create fields for the account number, balance, customer name, email and phone number.

         Create getters and setters for each field
         Create two additional methods
         1. To allow the customer to deposit funds (this should increment the balance field).
         2. To allow the customer to withdraw funds. This should deduct from the balance field,
         but not allow the withdrawal to complete if their are insufficient funds.
         You will want to create various code in the TestMain class (the one created by IntelliJ) to
         confirm your code is working.
         Add some System.out.println's in the two methods above as well.
 */
public class BankAccount{
    private int accountNum;
    private double balance  ;
    private String custName;
    private String email;
    private int phoneNum;
    private String bankname;

    public BankAccount(String bankName) {
        this.bankname = bankname;
    }

    public BankAccount(int accountNum, double balance, String custName, String email
                       , int phoneNum, String bankname){
        this.accountNum = accountNum;
        this.balance =  balance;
        this.custName = custName;
        this.email =  email;
        this.phoneNum = phoneNum;
        this.bankname = bankname;
    }

    public void displayBankName(){
        System.out.println(this.bankname);
    }
    public void setAccountNum(int accountNum){
        this.accountNum = accountNum;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAccountName(String name){
        this.custName = name;
    }
    public void setemail(String email){
        this.email = email;
    }
    public void setPhoneNum(int num){
        this.phoneNum = num;
    }

    public int getAccountNum(){
        return (this.accountNum);
    }

    public double getBalance(){
        return (this.balance);
    }
    public String getAccountName(){
        return (this.custName);
    }
    public String getemail(){
        return (this.email) ;
    }
    public int getPhoneNum(){
        return (this.phoneNum);
    }

    public void deposit(double amountAdded){
        double tempBalance = this.balance + amountAdded;
        this.setBalance(tempBalance);
        System.out.println("Updated Balance: " + this.balance);
    }
    public void withdraw(double amountWithdraw){
        double tempBalance = this.balance - amountWithdraw;
        if(tempBalance < 0 ){
            System.out.println("Invalid Request: Insufficient  balance");
        }
        else{
            this.setBalance(tempBalance);
            System.out.println("Updated Balance: " + this.balance);
        }
    }

}
