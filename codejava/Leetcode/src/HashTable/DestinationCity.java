//Program 51: DestinationCity
package HashTable;

import java.util.*;
import java.lang.*;
import java.io.*;
	

public class DestinationCity {
	 
    public static String destCity(List<List<String>> obj1) {
        Set<String> startingCities = new HashSet();

        for (List<String> obj2 : obj1) {
            startingCities.add(obj2.get(0));
        }
        for (List<String> obj2 : obj1) {
            if (!startingCities.contains(obj2.get(1))) return obj2.get(1);
        }
        return null;
    }
	    
        public static void main (String[] args) {
	    List<List<String>> city = new ArrayList<List<String>>();
	    city.add(new ArrayList(Arrays.asList("London","New York")));
	    city.add(new ArrayList(Arrays.asList("New York","Lima")));
	    city.add(new ArrayList(Arrays.asList("Lima","Sao Paulo")));
	    System.out.print(destCity(city));
	  }
	}
