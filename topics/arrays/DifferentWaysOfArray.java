package topics.arrays;

import java.util.Arrays;

public class DifferentWaysOfArray {
    public static void main(String[] args) {

        /*
            Summary
            - Direct Initialization: Good for simple, static values.
            - Using Loops: Ideal for dynamic or computed values.
            - Utility Methods: Useful for filling or setting values easily.
            - Anonymous Arrays: Useful for passing arrays to methods immediately.
            - Initializer Blocks: Useful for more complex initialization scenarios.
            - Stream API: Provides a modern way to create arrays with sequences of values.
         */
        
        
        
        declaritiveDirectInitialization();
        declaritiveWithNewKeyword();
        multiDimensionalDirectInitialization();
        multiDimensionalWithNewKeyword();
        singleDimensionalArrayByLoop();
        multiDimensionalArrayByLoop();
        usingArraysUtilMethodFill();
        usingArraysUtilMethodSet();
        anonymousArrayByDirectMethod(new int[] {1, 2, 3, 4, 5});
        arrayInitializedBlockSingleDimensional();
        arrayInitializedBlockMultiDimensional();
        usingStreamApiSingleDimensional();
    }

    /* 1. FIRST WAY
     * Declarative Initialization
     */
    // Single-Dimensional Array

    // Direct Initialization:
    private static void declaritiveDirectInitialization() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
    }

    // Using new Keyword:
    private static void declaritiveWithNewKeyword() {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        System.out.println(Arrays.toString(numbers));
    }

    // Multi-Dimensional Array
    // Direct Initialization:
    private static void multiDimensionalDirectInitialization() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(Arrays.toString(matrix));
    }

    // Using new Keyword:
    private static void multiDimensionalWithNewKeyword() {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        System.out.println(Arrays.toString(matrix));
    }

    /* 2. SECOND WAY
     * Using a Loop
     */

    // Single-Dimensional Array
    private static void singleDimensionalArrayByLoop() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }

        System.out.println(Arrays.toString(numbers));
    }
    // Multi-Dimensional Array
    private static void multiDimensionalArrayByLoop() {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i * 3 + j;
            }
        }

        System.out.println(Arrays.toString(matrix));
    }

    /* 3. THIRD WAY
     * Using Arrays Utility Methods
     */

    // Arrays.fill() Method:
    private static void usingArraysUtilMethodFill() {
        int[] numbers = new int[5];
        java.util.Arrays.fill(numbers, 7);

        System.out.println(Arrays.toString(numbers));
    }

    // Arrays.setAll() Method (Java 8 and later):
    private static void usingArraysUtilMethodSet() {
        int[] numbers = new int[5];
        java.util.Arrays.setAll(numbers, i -> i * 2);        

        System.out.println(Arrays.toString(numbers));
    }

    /* 4. FOURTH WAY
     * Anonymous Arrays
     */

    // Passing Arrays Directly to Methods:
    private static void anonymousArrayByDirectMethod(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    /* 5. FIFTH WAY
     * Array Initializer Blocks (For Complex Initialization)
     */

    // Single-Dimensional Array:
    private static void arrayInitializedBlockSingleDimensional() {
        int[] numbers = new int[5];
        {
            numbers[0] = 1;
            numbers[1] = 2;
            numbers[2] = 3;
            numbers[3] = 4;
            numbers[4] = 5;
        }
        System.out.println(numbers);
    }

    // Multi-Dimensional Array:
    private static void arrayInitializedBlockMultiDimensional() {
        int[][] matrix = new int[3][3];
        {
            matrix[0] = new int[] {1, 2, 3};
            matrix[1] = new int[] {4, 5, 6};
            matrix[2] = new int[] {7, 8, 9};
        }
        System.out.println(matrix);
    }

    /* 6. SIXTH WAY
     * Using Stream API (Java 8 and Later)
     */

    // Single-Dimensional Array:
    private static void usingStreamApiSingleDimensional() {
        int[] numbers = java.util.stream.IntStream.range(0, 5).toArray();

        System.out.println(numbers);
    }
}
