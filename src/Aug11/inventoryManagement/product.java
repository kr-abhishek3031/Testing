package Aug11.inventoryManagement;

public class product extends category {
    private final String productName;
    //private String categoryName;

    public product(String pName, int pType){
        super(pType);
        this.productName = pName;
    }
    public String getPname(){return this.productName;}
    public Integer getPtype(){return this.getCtype();}


}
