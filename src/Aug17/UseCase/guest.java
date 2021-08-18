package Aug17.UseCase;

import java.lang.NullPointerException;
import java.util.List;

public class guest implements CartValue {
    private String userName;
    private int userId;
    public ShoppingCart myCart;
    private PaymentOption card ;
    private PaymentOption rewardPoints;
    public guest (String uName, int uId, int cardNumber){
        this.userName = uName;
        this.userId   = uId;
        this.myCart = new ShoppingCart();
        this.card = new Card(uName, cardNumber);
        this.rewardPoints = new RewardPoints(uName);
    }
    public guest (String uName, int uId){
        this.userName = uName;
        this.userId   = uId;
        this.myCart = new ShoppingCart();
        this.rewardPoints = new RewardPoints(uName);
    }

    public String getuserName() {
        return this.userName;
    }
    public int getuserId(){
        return this.getuserId();
    }
    public PaymentOption getCard(){return this.card ;}
    public PaymentOption getRewardPoints(){return this.rewardPoints;}

    public <T> void search(List<T> searchlist, T query) throws productNotFound {
        for (T x: searchlist){
            if (searchlist.size() == 0){
                System.out.println("Sorry, inventory is empty ");
            }
            try {
                if (x == query) {
                    System.out.println("Your Product is available");
                    return;
                }
            } catch (NullPointerException e) {
                //  Block of code to handle errors

                throw new productNotFound("Product out of stock");
            }
        }
    }
    @Override
    public double cartValue() {
        double cartval =0;
        for (product p : this.myCart.getCart().keySet())
        {
            double prodVal = p.getPprice() * this.myCart.getCart().get(p);
            cartval += prodVal;
        }
        return cartval;
    }
}