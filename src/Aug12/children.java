package Aug12;

public class children {
    private static String name;
    children (String nm){
        this.name = nm;
    }
    public basket takefruit(fruit fr, basket bskt){
        if (bskt.fruitQuantity.containsKey(fr)){

            System.out.println(fr.fruitname + ": taken");
            bskt.fruitQuantity.put(fr, bskt.fruitQuantity.get(fr) - 1);
            if(bskt.fruitQuantity.get(fr) ==0 ){
                bskt.fruitQuantity.remove(fr);
            }
        }
        else{
            System.out.println("Fruit not in basket");
        }
        return bskt;
    }
}
