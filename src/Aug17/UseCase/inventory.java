package Aug17.UseCase;
import java.io.IOException;
import java.util.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.logging.*;

/*
Add Prices for your products and give user a flexibility to sort on the basis of price and name of the product.
 If the product is part of sale then give them discount of flat 10%. Use concepts we discussed till now.
 */
public class inventory{
    public static final Logger LOGGER = Logger.getLogger(inventory.class.getName());
    public static String className = inventory.class.getName();
    private static Handler consoleHandler = null;
    private static Handler fileHandler  = null;
    private static List<product> productList = new ArrayList<>();
    static {
        consoleHandler = new ConsoleHandler();
        try {
            fileHandler = new FileHandler("/Users/Z007JCC/IdeaProjects/Testing/src/Aug17/UseCase/app-handler.log");
        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.log(Level.SEVERE, "File not found", e);
        }

        //Assigning handlers to LOGGER object
        LOGGER.addHandler(consoleHandler);
        LOGGER.addHandler(fileHandler);
        //LOGGER.setFilter(new Factorial());
        //Setting levels to handlers and LOGGER
        consoleHandler.setLevel(Level.ALL);
        fileHandler.setLevel(Level.ALL);
        LOGGER.setLevel(Level.ALL);

        LOGGER.config("Configuration done.");

        //Console handler removed
        LOGGER.removeHandler(consoleHandler);
    }

    public static void addProduct(String pName, int pCategory, float pPrice, boolean sale){
        LOGGER.log(Level.FINE, "New producted added");
        product newProduct = new product(pName, pCategory, pPrice, sale, className);
        productList.add(newProduct);
    }

    public static void main(String[] args) throws productNotFound {
        guest newGuest = new guest("one", 0);
        LOGGER.log(Level.FINE, "New guest arrived");
        addProduct("Nike", 1, 100, false);

        addProduct("Adidas", 1, 50.0f, true);
        addProduct("Asics", 1, 20.0f, true);
        //newGuest.search(productNameList, "Nike" );
        //category temp = new category("shoes");
        //newGuest.search(categoryList, 1);
        //printList(productList);
        //Collections.sort(productList, product.PRICE_ORDER);
        //System.out.println("Ordering by Price");
        //printList(productList);
        //Collections.sort(productList, product.NAME_ORDER);
        //System.out.println("Ordering by Name");
        //printList(productList);
        newGuest.myCart.addProductInCart(productList.get(0), 1);
        newGuest.myCart.deleteFromCart(productList.get(2));
        double cartvalue;
        cartvalue = newGuest.cartValue();
        try {
            newGuest.getCard().pay(cartvalue);
        } catch (NullPointerException e) {
            //  Block of code to handle errors
            System.out.println("Card not found. Kindly add your card before Payment.");
            LOGGER.log(Level.SEVERE, "Null pointer exception occured", e);

            //throw new productNotFound("Card not found. Kindly add your card before Payment.");
        }
        newGuest.getRewardPoints().pay(cartvalue);
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
