//Program 11: For each example
package com.company;

public class ForEach {

    public static void main(String[] args) {

        int[] count = new int[10];

        
        int[] numbers = {1, 7, 7, 7, 8, 9};

       
        for (int number : numbers) {
            count[number]++;
        }

       
        for (int i = 0; i < count.length; i++) {
            System.out.println("Count of " + i + ": " + count[i]);
        }
    }
}
