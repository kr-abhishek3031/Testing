package Aug17.UseCase;
import java.io.IOException;
import java.util.*;
import java.util.logging.*;

public class product extends category {
    private final String productName;
    private final float productPrice;
    public boolean sale;
    //private String categoryName;
    private final Logger LOGGER;
    private static Handler consoleHandler = null;
    private static Handler fileHandler  = null;
    /*
    {
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
    }*/
    public product(String pName, int pType, float pPrice, boolean sl, String loggerName){
        super(pType);
        this.productName = pName;
        this.productPrice = pPrice;
        this.sale = sl;
        this.LOGGER = Logger.getLogger(loggerName);
        this.LOGGER.log(Level.FINER, "New Product added");
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

    public String getPname(){
        LOGGER.log(
                Level.FINER,
                "Product name returned"
        );
        return this.productName;}
    public Integer getPtype(){return this.getCtype();}
    public float getPprice(){return this.productPrice;}
}
