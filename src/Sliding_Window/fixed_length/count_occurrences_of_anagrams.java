package Sliding_Window.fixed_length;

import java.util.*;

public class count_occurrences_of_anagrams {
    public static void main(String[] args) {
        String pat = "for";
        String txt = "forxxorfxdofr";
        int count = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<pat.length(); i++){
            if(map.containsKey(pat.charAt(i)))
                map.put(pat.charAt(i),map.get(pat.charAt(i))+1);
            else
                map.put(pat.charAt(i),1);
        }
        int j = 0, i = 0;
        Map<Character,Integer> temp = new HashMap<>();
        while(j<txt.length()){
            if(temp.containsKey(txt.charAt(j)))
                temp.put(txt.charAt(j),temp.get(txt.charAt(j))+1);
            else
                temp.put(txt.charAt(j),1);
            if(j-i+1 == pat.length()){
                if(map.equals(temp)) count++;
                int x = temp.get(txt.charAt(i));
                if(x == 1) temp.remove(txt.charAt(i));
                else temp.put(txt.charAt(i),x-1);
                i++;
            }
            j++;
        }
        System.out.println(count);
    }
}
