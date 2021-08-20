package Aug20.shopExample;

public class FashionShop {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        TShirt t1 = new TShirt();
        t1.tshirtName = "feqqf";
        inventory.addTshirt(t1);

        t1.addtshirtSize(Size.S, 10);
        Guest g = new Guest("one", 1234);
        g.buy(t1, Size.S, 3, inventory);
        System.out.println(t1.getstockSize().get(Size.S));
    }
}
