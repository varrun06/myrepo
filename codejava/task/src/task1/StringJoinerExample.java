package task1;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        
        StringJoiner sj = new StringJoiner("(join) ");
        
        sj.add("Apple");
        sj.add("Banana");
        sj.add("Orange");

        String result = sj.toString();

        System.out.println("Fruits: " + result);

        // You can also specify a prefix and suffix
        StringJoiner obj = new StringJoiner(", ", "[", "]");
        obj.add("Java");
        obj.add("Python");
        obj.add("C++");
        
        String result2 = obj.toString();

        System.out.println("Programming Languages: " + result2);
    }
}

