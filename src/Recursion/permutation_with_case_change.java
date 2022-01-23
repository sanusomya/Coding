package Recursion;
import java.util.*;
public class permutation_with_case_change {
    static ArrayList<String> li = new ArrayList<>();
    public static void main(String[] args) {
        String input = "abc";
        solve(input,"");
        System.out.println(li);
    }
    static void solve(String input, String output){
        if(input.length() == 0){
            li.add(output);
            return;
        }
        String out1 = output+Character.toUpperCase(input.charAt(0));
        String out2 = output+input.charAt(0);
        input = input.substring(1);
        solve(input,out1);
        solve(input,out2);
    }
}
