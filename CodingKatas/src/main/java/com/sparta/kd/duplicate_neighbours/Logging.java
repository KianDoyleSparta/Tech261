package com.sparta.kd.duplicate_neighbours;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.*;

public class Logging {
    public static final Logger logger = Logger.getLogger(App.class.getName());

    public static void consoleHandlerSetup(ConsoleHandler consoleHandler) {
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new CustomFormatter());
        logger.addHandler(consoleHandler);
    }

    public static void fileHandlerSetup(FileHandler fileHandler) {
        fileHandler.setLevel(Level.ALL);
        fileHandler.setFormatter(new CustomFormatter());
        logger.addHandler(fileHandler);
    }

    public static void loggerSetup() {
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false);
    }

}
