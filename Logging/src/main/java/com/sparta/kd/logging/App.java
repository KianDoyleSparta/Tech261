package com.sparta.kd.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        final Logger logger = AppLogger.getLogger(Level.ALL, Level.INFO, true);

        logger.log(Level.INFO, "This is a log message");
    }
}
