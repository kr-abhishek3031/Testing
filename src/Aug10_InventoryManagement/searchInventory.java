package Aug10_InventoryManagement;
import java.lang.NullPointerException;
public class searchInventory {
    public static void searchByName(String query, product[] listproduct) throws productNotFound {
        //System.out.println(listproduct.length);
        if (listproduct.length == 0){
            System.out.println("Sorry, inventory is empty ");
        }
        for (int i = 0; i < listproduct.length; i++) {

            //System.out.println(temp);
            try {
                String temp = listproduct[i].getPname();
                if (temp == query) {
                    System.out.println("Your Product is available");
                    return;
                }
            } catch (NullPointerException e) {
                //  Block of code to handle errors

                throw new productNotFound("Product out of stock");
            }

        }
        //System.out.println("Reached");
        throw new productNotFound("Product out of stock");
    }

    public static void searchBytype(String query, product[] listproduct) throws productNotFound {
        if (listproduct.length == 0){
            System.out.println("Sorry, inventory is empty ");
        }
        for (int i = 0; i < listproduct.length; i++) {

            try {
                String temp = listproduct[i].getPtype();
                if (temp == query) {
                    System.out.println("Your Product is available");
                    return;
                }
            } catch (NullPointerException e) {
                //  Block of code to handle errors

                throw new productNotFound("Product out of stock");
            }
            throw new productNotFound("Product out of stock");
        }
    }
}
