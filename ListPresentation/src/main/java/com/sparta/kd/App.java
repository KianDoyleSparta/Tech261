package com.sparta.kd;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // List Interface implements Collection Interface
        // A List is an ordered collection

        // overloaded add() method -> add(int index, E element)
        // indexOf(E element)

        // Trying to instantiate a List
        List<?> newList = new List<>();
        // List is an Interface and therefore cannot be instantiated by itself

        // Instantiating a List with an implementation
        List<String> newListExample = new ArrayList<>();
        newListExample.clone();
        // Does not exist in List but does in ArrayList
        // Flexible but...
        // Can't access specific ArrayList methods
        ArrayList<String> newArrayListExample = new ArrayList<>();
        Object newArrayListClone = newArrayListExample.clone();
        // Does exist in ArrayList, hence usable

        // Next
    }

}
