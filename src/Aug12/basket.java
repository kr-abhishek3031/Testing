package Aug12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class basket  {
        public List<fruit> fruitBasket = new ArrayList<>();
        Map <fruit, Integer> fruitQuantity = new HashMap<>();
        public void addFruitCategory(fruit fName){
            if(this.fruitBasket.size()<4){
                this.fruitBasket.add(fName);
                this.fruitQuantity.put(fName, 1);
            }
            else System.out.println("Basket Full");
        }
        public void addFruit(fruit fr){
            if (this.fruitQuantity.containsKey(fr)){
                Integer temp = this.fruitQuantity.get(fr);
                System.out.println(temp);
                if(temp >= 5){
                    System.out.println("Maximum Capacity of fruit reached");
                }
                else{
                    this.fruitQuantity.put(fr, this.fruitQuantity.get(fr) + 1);
                }
            }
            else{
                addFruitCategory(fr);
            }
        }

}
