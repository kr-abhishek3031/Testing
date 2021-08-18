package Aug17.UseCase;

public class Card implements PaymentOption{
    private String cardHolderName;
    private int cardNumber;

    public Card(String cardholder, int cardN){
        this.cardHolderName = cardholder;
        this.cardNumber = cardN;
    }

    @Override
    public void pay(double amount) {

        //Can add actual card interface to deduct the amount from the card
        System.out.println("Payment successful by Card. Thank you for shopping!!");
    }
}
