package Aug12.inventoryManagement;

import java.lang.NullPointerException;
import java.util.List;

public class guest {
    private String userName;
    private int userId;

    guest (String uName, int uId){
        this.userName = uName;
        this.userId   = uId;
    }

    public String getuserName() {
        return this.userName;
    }
    public int getuserId(){
        return this.getuserId();
    }

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
}