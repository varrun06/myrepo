//Program 57: SortNamesByHeightUsingTree2
package leetprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortNamesByHeightUsingTree2 {

    public static void main(String[] args) {
        Map<String, String> heights = new HashMap<>();
        heights.put("180", "Mary");
        heights.put("165", "John");
        heights.put("170", "Emma");

        System.out.println("Map: " + heights);

        TreeMap<String, String> sortedHeights = new TreeMap<>(heights);

        System.out.println("Heightwise sorted: " + sortedHeights);

        System.out.println("Sorted Names by Height:");

        for (Map.Entry<String, String> entry : sortedHeights.entrySet()) {
            System.out.println(entry.getValue() + ": " + entry.getKey());
        }
    }
}
