//Program 51: JewelsAndStones
package HashTable;


import java.io.*;
import java.util.*;

	
	public class JewelsAndStones {
		
		public static int numJewelsInStones(String jewels, String stones) {
	        HashMap<Character,Integer> mapper = new HashMap<>();
	       
	        int ans = 0;
	        for(char s : jewels.toCharArray()){
	            mapper.put(s,0);
	        }
	        for(char stone : stones.toCharArray()){
	            if(mapper.containsKey(stone)){
	               ans++;
	            }
	        }
	        return ans;
	    }
	
	
	 public static void main (String[] args) 
			 
	 {
		    String jewels = "aA";
		    String stones = "aAaaAbbbb";
		    System.out.println(numJewelsInStones(jewels, stones));
		  }
		}