package Aug11.inventoryManagement;
import Aug10_InventoryManagement.productNotFound;
import Aug10_InventoryManagement.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

/*
Use Case :

An online retail shop has inventory system where they want to store products with their respective categories.
User can online shopping by searching product using their category, name and buy them.
If product is not available show a message to user out of stock.
Clearly define entities and use all concepts we discussed today.

Use generics for this use case and also consider a case to maintain a wait queue of customer if product is on sale to sell first come first serve basis
but not more than 5 people waiting at a time.Improve searching of your solution using map’s constant time methods
 */

public class inventory{
    private static HashMap<String, Integer> productNameCategory = new HashMap<String, Integer>();

    private static HashMap <category, Queue <user>> userTraffic_category;
    private static List<String> productNameList = new ArrayList<>();
    private static List<Integer> categoryList = new ArrayList<>();

    public static void addProduct(String pName, int pCategory){
        product newProduct = new product(pName, pCategory);
        productNameList.add(pName);
        categoryList.add(newProduct.getPtype());
        productNameCategory.put(pName, pCategory);
    }

    public static void main(String[] args) throws productNotFound {
        guest newGuest = new guest("one", 0);
        addProduct("Nike", 1);
        //newGuest.search(productNameList, "Nike" );
        //category temp = new category("shoes");
        newGuest.search(categoryList, 1);

    }


}
