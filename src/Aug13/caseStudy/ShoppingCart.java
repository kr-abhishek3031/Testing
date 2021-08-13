package Aug13.caseStudy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShoppingCart implements AddInCart, DeleteFromCart {
    private Map<product, Integer> cart;

    public ShoppingCart(){
        this.cart = new HashMap<>();
    }

    @Override
    public void addProductInCart(product p, Integer quantity) {
        if(this.cart.containsKey(p)){
            this.cart.put(p, this.cart.get(p) + quantity);
        }
        else this.cart.put(p, quantity);
        System.out.println("Following product is successfully added to your cart!!!");
        System.out.println("Product Name: " + p.getPname() + "; Price: " + p.getPprice()+ "; Quantity: "+ quantity);
    }

    @Override
    public void deleteFromCart(product p) {

        if(this.cart.containsKey(p)){
            this.cart.put(p, this.cart.get(p) - 1);
            if(this.cart.get(p)==0){
                this.cart.remove(p);
            }
            System.out.println("Product is successfully removed from your cart!!!");
        }
        else System.out.println("Error: Product is not in your cart!!!");
    }

}
