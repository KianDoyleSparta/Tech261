package com.sparta.kd;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class App {

    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new CustomFormatter());

        logger.addHandler(consoleHandler);

        logger.setLevel(Level.ALL);

        logger.setUseParentHandlers(false);

        logger.info("This is info message");
        logger.warning("This is warning message");
        logger.fine("This is fine message");
    }
}
