package Aug12.inventoryManagement;
import java.util.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

/*
Add Prices for your products and give user a flexibility to sort on the basis of price and name of the product.
 If the product is part of sale then give them discount of flat 10%. Use concepts we discussed till now.
 */
public class inventory{

    private static List<product> productList = new ArrayList<>();
    public static void addProduct(String pName, int pCategory, float pPrice, boolean sale){
        product newProduct = new product(pName, pCategory, pPrice, sale);
        productList.add(newProduct);
    }

    public static void main(String[] args) throws productNotFound {
        guest newGuest = new guest("one", 0);
        addProduct("Nike", 1, 100, false);
        addProduct("Adidas", 1, 50.0f, true);
        addProduct("Asics", 1, 20.0f, true);
        //newGuest.search(productNameList, "Nike" );
        //category temp = new category("shoes");
        //newGuest.search(categoryList, 1);
        printList(productList);
        Collections.sort(productList, product.PRICE_ORDER);
        System.out.println("Ordering by Price");
        printList(productList);
        Collections.sort(productList, product.NAME_ORDER);
        System.out.println("Ordering by Name");
        printList(productList);

    }
    static Discount dis = (double a) -> {return 0.9*a ;};
    public static void printList(List<product> list) {
        for(product p : list) {
            System.out.println("Product Name: " + p.getPname() + ", Product price: " + p.getPprice());
            if(p.sale){
                double t = dis.newPrice(p.getPprice());
                System.out.println("Product on sale!!! Our Discounted Price: " + t);
            }
        }
        System.out.println();
        System.out.println("======================================================================");
    }

}
interface Discount{
    //String greet(String s);

    double newPrice(double a);
}
