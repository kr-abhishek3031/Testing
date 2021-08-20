package Aug20.shopExample;

import java.util.Map;
import java.util.Set;

public class Guest {
    private String name;
    private int phoneNum;

    Guest (String nm, int num){
        this.name = nm;
        this.phoneNum = num;
    }
    public void buy(TShirt  t, Size s, Integer quantity, Inventory inventory){
        Set<TShirt> currentInventory = inventory.getCollection();
        if(currentInventory!=null){
            if(!currentInventory.contains(t)){
                System.out.println("Requested product not available");
            }
            else{
                Map<Size, Integer> sizeAvail = t.getstockSize();
                Integer sizeStock = sizeAvail.get(s);
                if(sizeStock - quantity< 0){
                    System.out.println("Requested product in size " + s + " not available");
                }
                else{
                    System.out.println("Order processed. Thank you for shopping with us.");
                    sizeAvail.put(s, sizeStock- quantity);
                    System.out.println("Stock updated");
                }
            }
        }

    }
}
