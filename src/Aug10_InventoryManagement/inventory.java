package Aug10_InventoryManagement;

/*
Use Case :

An online retail shop has inventory system where they want to store products with their respective categories.
User can online shopping by searching product using their category, name and buy them.
 If product is not available show a message to user out of stock.
 Clearly define entities and use all concepts we discussed today.
 */

public class inventory extends searchInventory {
    
    
    public static void main(String[] args) throws productNotFound {
        //product listProducts[] = new product[20];
        //String listNameProducts[];
        //String listProductType[];
        product listProducts[] = new product[20];
        listProducts[0] = new product("Nike", "Shoes");
        listProducts[1] = new product("ball", "sports");
        user user1 = new user("A", 1);
        //System.out.println(listProducts[0].getPname());
        searchInventory.searchByName("Nike", listProducts);
        searchInventory.searchBytype("Shoes", listProducts);
        searchInventory.searchByName("Adidas", listProducts);
    }


}
