package Aug10_InventoryManagement;

public class productNotFound extends Exception{
    public productNotFound(String str)
        {
            // calling the constructor of parent Exception
            super(str);
        }
}
