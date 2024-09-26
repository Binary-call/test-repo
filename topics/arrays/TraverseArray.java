package topics.arrays;

import java.util.*;
import java.util.stream.IntStream;;

public class TraverseArray {
    public static void main(String[] args) {
        // traditionalForLoop();
        // forEachLoop();
        // usingWhileLoop();
        // doWhileLoop();
        // usingStreamApi();
        // usingArraysAsList();
        // usingForEachWithList();
        // usingIntStreamForPrimitiveArr();
        // forEachLoopFunctionalLoop();
        // usingMapInStreamAPI();
        usingFilterStreamAPI();
    }

    // 1. Traditional for Loop
    private static void traditionalForLoop() {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //  Enhanced for Loop (for-each Loop)
    private static void forEachLoop() {
        int[] array = {1, 2, 3, 4, 5};
        for (int value : array) {
            System.out.println(value);
        }
    }

    //  Using while Loop
    private static void usingWhileLoop() {
        int[] array = {1, 2, 3, 4, 5};
        int i = 0;
        
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    }

    //  Using do-while Loop
    private static void doWhileLoop() {
        int[] array = {1, 2, 3, 4, 5};
        int i = 0;
        
        do {
            System.out.println(array[i]);
            i++;
        } while (i < array.length);
    }

    //  Using Stream API (Java 8 and later)
    private static void usingStreamApi() {
        int[] array = {1, 2, 3, 4, 5};
        
        Arrays.stream(array)
            .forEach(System.out::println);
    }

    //  Using Arrays.asList() (for Objects)
    private static void usingArraysAsList() {
        String[] array = {"one", "two", "three", "four", "five"};
        List<String> list = Arrays.asList(array);
        
        for (String value : list) {
            System.out.println(value);
        }
    }

    // Using forEach Method with List
    private static void usingForEachWithList() {
        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(array);
        
        list.forEach(System.out::println);
    }

    // Using IntStream for Primitive Arrays
    private static void usingIntStreamForPrimitiveArr() {
        int[] array = {1, 2, 3, 4, 5};

        IntStream.of(array)
                 .forEach(System.out::println);
    }

    // for-each loop (functional style)
    private static void forEachLoopFunctionalLoop() {
        int[] array = {1, 2, 3, 4, 5};

        Arrays.asList(array).stream().forEach(System.out::println);
    }

    // Using map in stream API
    private static void usingMapInStreamAPI() {
        int[] array = {1, 2, 3, 4, 5};

        Arrays.asList(array).stream().map(element -> {
            return element;
            }).forEach (System.out::println);
            
    }

    // Using map in stream API
    private static void usingFilterStreamAPI() {
        int[] array = {1, 2, 3, 4, 5};

        Arrays.asList(array).stream().filter(element -> {
            return true;
        }).forEach (System.out::println);      
            
    }
}
