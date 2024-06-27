package com.sparta.kd;

import java.io.IOException;
import java.util.logging.*;

public class App {

    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new CustomFormatter());

        logger.addHandler(consoleHandler);

        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/log-file.log", true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new CustomFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        logger.setLevel(Level.ALL);

        logger.setUseParentHandlers(false);

        logger.info("This is info message");
        logger.warning("This is warning message");
        logger.fine("This is fine message");
    }
}
