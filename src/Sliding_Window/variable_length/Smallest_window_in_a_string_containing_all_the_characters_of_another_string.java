package Sliding_Window.variable_length;
import java.util.*;
public class Smallest_window_in_a_string_containing_all_the_characters_of_another_string {
    public static void main(String[] args) {
        String s = "maideewanahumaindewanaesejaanenadungajaana";
        String p = "mmsd";
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i<p.length(); i++){
            if(map.containsKey(p.charAt(i)))
                map.put(p.charAt(i),map.get(p.charAt(i))+1);
            else map.put(p.charAt(i),1);
        }
        int i = 0, j = 0, n = s.length(), min = Integer.MAX_VALUE,count = map.size();
        String ans = "";
        while(j<n){
            if(map.containsKey(s.charAt(j))){
                int x = map.get(s.charAt(j));
                if(x == 1) count--;
                map.put(s.charAt(j),x-1);
            }
            if(count == 0){
                while(count == 0){
                    if(map.containsKey(s.charAt(i))){
                        int x = map.get(s.charAt(i));
                        map.put(s.charAt(i),x+1);
                        if(x == 0){
                            count++;
                            if(j-i+1 < min){
                                ans = s.substring(i,j+1);
                                min = j-i+1;
                            }
                        }
                    }
                    i++;
                }
            }
            j++;
        }
        System.out.println(ans);
    }
}
