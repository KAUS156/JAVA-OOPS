package ARRAY;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Accessing elements
        System.out.println("Element at index 1: " + list.get(1));  // Python

        // Removing an element
        list.remove(2);  // Removes "C++"

        // Checking size
        System.out.println("Size of list: " + list.size());  // 2

        // Checking if element exists
        System.out.println("Contains Java? " + list.contains("Java"));  // true
    }
}
