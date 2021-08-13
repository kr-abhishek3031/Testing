package Aug13.caseStudy;

public class RewardPoints implements PaymentOption {
    private String Name;
    private double rewardPoints;

    public RewardPoints(String name){
        this.Name = name;
        this.rewardPoints = 1000;
    }
    @Override
    public void pay(double amount) {
        if(this.rewardPoints - amount<0){
            System.out.println("Insufficient Reward points");
        }
        else{
            this.rewardPoints -= amount;
            System.out.println("Payment successful. Thank you for shopping!!");
            System.out.println("Your remaining reward points is " + this.rewardPoints);
        }
    }
}
