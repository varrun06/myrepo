package WorkOut;

//ArrayList in Java is a dynamic array that automatically resizes 
//itself, providing a flexible and resizable list to store elements.
import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        
        ArrayList<String> stringList = new ArrayList<>();

        
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        
        System.out.println("Elements in the ArrayList:");


        
        System.out.println(stringList);
    }
}

