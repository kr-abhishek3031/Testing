package Aug10_InventoryManagement;

public class product {
    private final String productName;
    private final String productType;

    public product(String pName, String pType){
        this.productName = pName;
        this.productType = pType;
    }
    public String getPname(){return this.productName;}
    public String getPtype(){return this.productType;}

}
