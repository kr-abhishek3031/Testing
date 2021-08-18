package Aug17.Exercise1;

import java.util.logging.Level;

/*
Exercise :
Create a handler and attach this to your logger for a program where you are calculating factorial of a number.
Use Logger properties to configure your logger and proper log level.
Note:- inside your program add a method that throws a custom exception “an error occurred” and call this method, use logger to show exception.
Add a filter to find a message containing “error” as a word in your exception.

Exercise :
 Install VisualVm and analyse your IDE process heap, take a heap dump perform GC. Learn how these metrics are displayed on which graph.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Factorial f1 = new Factorial();
        Factorial.LOGGER.setFilter(f1);
        long out;
        try{
            out = f1.calFactorial(1000);
            Factorial.LOGGER.log(Level.FINE,
                    "error method running");
            System.out.println(out);
        }
        catch(Exception e) {
            //  Block of code to handle errors
            //System.out.println("fvilwhvfwhrf");
            Exception customizedEx = new Exception("An error occured");
            Factorial.LOGGER.log(Level.SEVERE, "an error occurred", customizedEx);
            throw e;
            //throw new Exception("An error occured");
        }
        //System.out.println(f1.calFactorial(10));
    }
}
