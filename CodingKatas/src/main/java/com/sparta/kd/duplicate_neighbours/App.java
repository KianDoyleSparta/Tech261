package com.sparta.kd.duplicate_neighbours;

import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;

public class App {

    public static void main(String[] args) {

        ConsoleHandler consoleHandler = new ConsoleHandler();
        Logging.consoleHandlerSetup(consoleHandler);

        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/log-file.log", true);
            Logging.fileHandlerSetup(fileHandler);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Logging.loggerSetup();

        int[] input = {0, -1, -1, -1 , 4, 44};
        boolean duplicatesInArray = DuplicateNeighbours.containsDuplicates(input);

        System.out.println(duplicatesInArray);
        Logging.logger.info("Printed out array duplicates");
    }

}
