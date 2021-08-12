package Aug12.inventoryManagement;
import java.util.*;

public class product extends category {
    private final String productName;
    private final float productPrice;
    public boolean sale;
    //private String categoryName;

    public product(String pName, int pType, float pPrice, boolean sl){
        super(pType);
        this.productName = pName;
        this.productPrice = pPrice;
        this.sale = sl;
    }

    static final Comparator<product> PRICE_ORDER;
    static final Comparator<product> NAME_ORDER;
    static {
        PRICE_ORDER = new Comparator<product>() {
            @Override
            public int compare(product p1, product p2) {
                if (p1.getPprice() < p2.getPprice()) {
                    return -1;
                } else if (p1.getPprice() > p2.getPprice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
    }

    static {
        NAME_ORDER = new Comparator<product>() {
            @Override
            public int compare(product p1, product p2) {
                String str1 = p1.getPname();
                String str2 = p2.getPname();
                return str1.compareTo(str2);
            }
        };
    }

    public String getPname(){return this.productName;}
    public Integer getPtype(){return this.getCtype();}
    public float getPprice(){return this.productPrice;}
}
