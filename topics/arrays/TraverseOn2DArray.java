package topics.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TraverseOn2DArray {
    public static void main(String[] args) {
        nestedForLoop();
        forEachLoop();
        usingWhileLoop();
        doWhileLoop();
        usingStreamApi();
        usingIntStream();
    }

    // 1. Traditional for Loop
    private static void nestedForLoop() {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for (int i = 0; i < array.length; i++) { // Traverse rows
            for (int j = 0; j < array[i].length; j++) { // Traverse columns
                System.out.println(array[i][j]);
            }
        }
    }

    //  Enhanced for Loop (for-each Loop)
    private static void forEachLoop() {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for (int[] row : array) { // Traverse rows
            for (int value : row) { // Traverse columns in each row
                System.out.println(value);
            }
        }
    }

    //  Using while Loop
    private static void usingWhileLoop() {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int i = 0;
        while (i < array.length) { // Traverse rows
            int j = 0;
            while (j < array[i].length) { // Traverse columns
                System.out.println(array[i][j]);
                j++;
            }
            i++;
        }
    }

    //  Using do-while Loop
    private static void doWhileLoop() {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int i = 0;
        do {
            int j = 0;
            do {
                System.out.println(array[i][j]);
                j++;
            } while (j < array[i].length);
            i++;
        } while (i < array.length);
    }

    //  Using Stream API (Java 8 and later)
    private static void usingStreamApi() {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        Arrays.stream(array)
              .flatMapToInt(Arrays::stream)
              .forEach(System.out::println);
    }

    //  Using Arrays.asList() (for Objects)
    private static void usingIntStream() {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        IntStream.range(0, array.length).forEach(i ->
            IntStream.range(0, array[i].length).forEach(j ->
                System.out.println(array[i][j])
            )
        );
    }
}
