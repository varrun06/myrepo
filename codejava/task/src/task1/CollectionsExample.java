package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(10);

      
        System.out.println("Original List: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

       
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

    
        Collections.shuffle(numbers);
        System.out.println("Shuffled List: " + numbers);

        
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Min: " + min + ", Max: " + max);

        
       // List<Integer> unmodifiableList = Collections.unmodifiableList(numbers);
        int index = Collections.binarySearch(numbers, 8);
        System.out.println("Index of 8: " + index);
    }
}

