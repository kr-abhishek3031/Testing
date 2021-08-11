package p1;

public class atm {

    private BankAccount guest;
    private double withdrawalAmount;
    public atm(BankAccount guest, double withdrawalAmount){
        this.guest = guest;
        this.withdrawalAmount = withdrawalAmount;
        guest.withdraw(withdrawalAmount);
    }
}
