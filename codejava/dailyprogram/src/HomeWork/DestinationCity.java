//Program 33: Destination City 

package HomeWork;

import java.util.*;
import java.lang.*;
import java.io.*;

public class DestinationCity {

    public static void main(String[] args) {
        List<List<String>> city = new ArrayList<List<String>>();
        city.add(new ArrayList(Arrays.asList("London", "New York")));
        city.add(new ArrayList(Arrays.asList("New York", "Lima")));
        city.add(new ArrayList(Arrays.asList("Lima", "Sao Paulo")));

        Set<String> startingCities = new HashSet();

        for (List<String> obj2 : city) {
            startingCities.add(obj2.get(0));
        }

        for (List<String> obj2 : city) {
            if (!startingCities.contains(obj2.get(1))) {
                System.out.println(obj2.get(1));
                break;
            }
        }
    }
}
