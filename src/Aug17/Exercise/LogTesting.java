package Aug17.Exercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.Level;

public class LogTesting {

    private static final LogManager logManager = LogManager.getLogManager();
    private static final Logger LOGGER = Logger.getLogger("confLogger");

    static{
        try {
            logManager.readConfiguration(new FileInputStream("/Users/Z007JCC/IdeaProjects/Testing/src/Aug17/Exercise/logger.properties"));
        } catch (IOException exception) {
            LOGGER.log(Level.SEVERE, "Error in loading configuration",exception);
        }
    }
    public static void main(String[] args) {
        try{
            Class x = Class.forName("Aug17.Exercise.Divide");
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        LOGGER.config("Testing configurations");
        LOGGER.severe("Severe message logged");
        LOGGER.fine("Fine message logged");
        LOGGER.info("Info message logged");
        LOGGER.warning("Warning message logged");

    }
}
