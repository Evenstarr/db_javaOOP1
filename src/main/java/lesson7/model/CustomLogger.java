package lesson7.model;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomLogger {
    public void writeLog(String message) {
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.addHandler(fileHandler);

        logger.log(Level.INFO, message);
        fileHandler.close();
    }
}
