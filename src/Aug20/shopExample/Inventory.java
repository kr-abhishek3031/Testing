package Aug20.shopExample;

//import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Inventory {
    private Set<TShirt> tshirtCollection = new HashSet<>();

    public Set<TShirt> getCollection(){
        return this.tshirtCollection;
    }
    public void addTshirt(TShirt t){
        if (this.tshirtCollection!= null) {
            if (this.tshirtCollection.contains(t)) {
                System.out.println("Tshirt already in the inventory");
            }
            else {
                this.tshirtCollection.add(t);
                System.out.println("Tshirt added");
            }
        }
        else {
            System.out.println(t.tshirtName);
            this.tshirtCollection.add(t);
            System.out.println("Tshirt added");
        }
    }

}
