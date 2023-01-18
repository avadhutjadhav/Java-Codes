package Collection;

import java.util.HashMap;

//Write a Java Program to count the number of words in a string using HashMap.
public class Hashmap {
	public static void main1(String[] args) {
        String str = "This this is is done by Saket Saket";
        String[] split = str.split(" ");
         HashMap<String,Integer> map = new HashMap<String,Integer>();
        for (int i=0; i<split.length; i++) {
            if (map.containsKey(split[i])) {
                int count = map.get(split[i]);
                map.put(split[i], count+1);
            }
            else {
                map.put(split[i], 1);
            }
        }
        System.out.println(map);
    }
//The same program can be used to count the number of characters in a string. All you need to do is to 
//remove one space (remove space delimited in split method) in String[] split = str.split(“”);
	public static void main(String[] args) {
        String str = "This this is is done by Saket Saket";
        String[] split = str.split("");
         HashMap<String,Integer> map = new HashMap<String,Integer>();
        for (int i=0; i<split.length; i++) {
            if (map.containsKey(split[i])) {
                int count = map.get(split[i]);
                map.put(split[i], count+1);
            }
            else {
                map.put(split[i], 1);
            }
        }
        System.out.println(map);
    }
}
