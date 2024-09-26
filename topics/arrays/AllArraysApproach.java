package topics.arrays;

import java.util.Arrays;

public class AllArraysApproach {
    public static void main(String[] args) {
        primitiveApproach();
        multipleValues();
        storeHomogeneousVal();
    }

    // Primitive Data Type - Only one value
    public static void primitiveApproach() {
        int a = 12;
        System.out.println(a);
    }

    // For multiple value use Arrays - but not homogeneous value
    public static void multipleValues() {
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    // For multiple value use Arrays - but not homogeneous value
    public static void storeHomogeneousVal() {
        Object[] homoArr = new Object[2];
        homoArr[0] = 1;
        homoArr[1] = "Binary";
        System.out.println(homoArr);
        System.out.println(Arrays.toString(homoArr));
    }
}
