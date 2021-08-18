package Aug17.Exercise1;

import Aug12.inventoryManagement.productNotFound;

import java.io.IOException;
import java.util.logging.*;

public class Factorial implements Filter {
    //public int num;
    public static final Logger LOGGER = Logger.getLogger(Factorial.class.getName());
    private static Handler consoleHandler = null;
    private static Handler fileHandler  = null;

    static {
        try {
            //Creating consoleHandler and fileHandler
            consoleHandler = new ConsoleHandler();
            fileHandler = new FileHandler("/Users/Z007JCC/IdeaProjects/Testing/src/Aug17/Exercise1/app-handler.log");

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

            LOGGER.log(Level.FINE, "Finer logged");
        } catch (
                IOException exception) {
            LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", exception);
        }
    }

    public long calFactorial(int n) throws Exception {
        if(n<=1){
            return 1;
        }
        else{

            long temp = calFactorial(n-1);
            try {
                if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) {
                    Exception customizedEx = new Exception("An error occured");

                    throw customizedEx;
                }
            }
            catch (Exception e){
                Factorial.LOGGER.log(Level.SEVERE, "an error occurred", e);
                throw e;
            }
            //System.out.println(temp);
            return temp*n;
        }

    }

    @Override
    public boolean isLoggable(LogRecord record) {
        if(record == null)
            return false;

        String message = record.getMessage()==null?"":record.getMessage();

        if(message.contains("error"))
            return true;

        return false;
    }
}
