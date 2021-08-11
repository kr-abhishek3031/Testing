package p1;

/*
Part 2:

        Add one bank associated with the customer use bank class and customer as its instance member class then
         create above withdraw and deposit functionality.
 */
public class Bank {
    public static String bankName = "XYZ bank";

    public static void main(String[] args) {
        BankAccount user1 = new BankAccount(Bank.bankName);
        user1.setAccountName("User1");
        user1.setBalance(0);
        user1.setBalance(100);
        double bal = user1.getBalance();
        System.out.println(bal);
        user1.withdraw(200);
        atm t1 = new atm(user1, 50);
    }
}
