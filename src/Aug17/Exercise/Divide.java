package Aug17.Exercise;

//import java.util.logging.Level;
//import java.util.logging.Logger;
import java.util.logging.*;

import static java.util.logging.Level.*;


/*
Exercise :
Create a class for Mathematic operations and add a method for divide by zero error then log the message for error and also show for other levels.
 */
public class Divide {
    private static Logger LOGGER = Logger.getLogger(Divide.class.getName());

    public int a;
    public int b;
    Divide (int a, int b){
        this.a = a;
        this.b = b;
    }
    public double execute(){
        return this.a/this.b;
    }

    public static void main(String[] args) {

        Divide divide = new Divide(5, 0);
        Divide.LOGGER.setLevel(CONFIG);
        Divide.LOGGER.config("Division of number");

        try{
            System.out.println(divide.execute());
        }catch(ArithmeticException e){
            LOGGER.log(SEVERE, "Exception occur", e);
        }

        LOGGER.info("Logger Name: "+LOGGER.getName());
        LOGGER.log(INFO,
                "Logger Name: "+LOGGER.getName());
        LOGGER.warning("Can cause DivisionByZeroException");
    }

}
