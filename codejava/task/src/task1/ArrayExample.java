package task1;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        
        int[] intArray = {1, 4, 2, 7, 5};

       
        int firstElement = intArray[0];
        System.out.println("First element: " + firstElement);

        // Modify an element in the array
        intArray[1] = 10;
        System.out.println("Modified array: " + Arrays.toString(intArray));
        
        int arrayLength = intArray.length;
        System.out.println("Array length: " + arrayLength);

        Arrays.sort(intArray);
        System.out.println("Sorted array: " + Arrays.toString(intArray));

        int indexOfSeven = Arrays.binarySearch(intArray, 7);
        System.out.println("Index of 7: " + indexOfSeven);

        //  Copy an array
        int[] copiedArray = Arrays.copyOf(intArray, intArray.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        // Fill an array with a specific value
        Arrays.fill(intArray, 0);
        System.out.println("Array filled with 0s: " + Arrays.toString(intArray));

    }
}

