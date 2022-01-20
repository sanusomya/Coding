package Sliding_Window.variable_length;
import java.util.*;
public class Longest_K_unique_characters_substring {
    public static void main(String[] args) {
        String s = "aaaa";
        int k = 2;
        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        int j = 0, i = 0, max = 0;
        while(j<n){
            if(map.containsKey(s.charAt(j)))
                map.put(s.charAt(j),map.get(s.charAt(j))+1);
            else
                map.put(s.charAt(j),1);
            if(map.size() > k){

            }
            if(map.size() == k){
                max = Math.max(max,j-i+1);
            }
            if(map.size() > k){
                while(map.size() > k){
                    int x = map.get(s.charAt(i));
                    if(x > 1) map.put(s.charAt(i),x-1);
                    else map.remove(s.charAt(i));
                    i++;
                }
            }
            j++;
        }
        System.out.println(max);
    }
}
