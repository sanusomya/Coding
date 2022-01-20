package Sliding_Window.variable_length;
import java.util.*;
public class Longest_distinct_characters_substring {
    public static void main(String[] args) {
        String s = "mynameisanthonygonsalvis";
        Set<Character> set = new LinkedHashSet<>();
        int i = 0, j = 0, n = s.length(),max = 0;
       while(j<n){
            //System.out.println(set);
            if(set.contains(s.charAt(j))){
                max = Math.max(max,j-i);
                while(set.contains(s.charAt(j))){
                    set.remove(s.charAt(i));
                    i++;
                }
            }
            set.add(s.charAt(j));
            j++;
        }
        max = Math.max(max,set.size());
        System.out.println(max);

        //another better approach
        Map<Character,Integer> map = new HashMap<>();
        i = 0;
        j = 0;
        max = 0;
        while(j<n){
            //System.out.println(i+" "+j+" "+max+" "+map);
            if(map.containsKey(s.charAt(j))){
                max = Math.max(j-i,max);

                //since i will be updated according to previously inputted value
                //if our i has moved forward we don't need to put it back according
                // to previously occurred character so max function is used
                i = Math.max(map.get(s.charAt(j))+1,i);
            }
            map.put(s.charAt(j),j);
            j++;
        }
        max = Math.max(max, j-i);
        System.out.println(max);
    }
}
