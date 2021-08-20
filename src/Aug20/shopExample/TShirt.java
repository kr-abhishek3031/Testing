package Aug20.shopExample;

import java.util.HashMap;
import java.util.Map;

public class TShirt {
    public String tshirtName;
    private Map<Size, Integer> stockPerSize;
    {
        stockPerSize = new HashMap<>();
        for (Size p : Size.values()) {
           stockPerSize.put(p, 0);
        }
    }
    public Map<Size, Integer> getstockSize(){
        return this.stockPerSize;
    }
    public void addtshirtSize(Size s, Integer quantity){
            Integer temp = stockPerSize.get(s) +quantity ;
            stockPerSize.put(s, temp);
    }
}
