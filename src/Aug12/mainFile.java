package Aug12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/*
Exercise:
A family has a fruit of basket of 3 types fruits. The basket has a capacity to add 1 more type fruit up to max 5 for each type. Family want to distribute these fruits in their children on first come first basis.
Write a program to demonstrate this and use appropriate collections type.
 */
public class mainFile {
    public static void main(String[] args) throws FileNotFoundException {
        basket newBasket = new basket();
        fruit apple = new fruit("apple");
        newBasket.addFruit(apple);
        newBasket.addFruit(apple);
        newBasket.addFruit(apple);
        newBasket.addFruit(apple);
        newBasket.addFruit(apple);
        newBasket.addFruit(apple);
        fruit mango = new fruit("mango");
        newBasket.addFruit(mango);
        fruit banana = new fruit("banana");
        newBasket.addFruit(banana);

        Queue <children> q = new LinkedList<>();
        children c1 = new children("a");
        q.add(c1);
        basket updatedBasket = c1.takefruit(apple, newBasket);
        try (PrintStream out = new PrintStream(new FileOutputStream("output.txt"))) {
            System.setOut(out);
        }
    }
}
