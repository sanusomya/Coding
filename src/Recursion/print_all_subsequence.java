package Recursion;

import java.util.*;

// the concept here is either to take a character from the input or not
//choices and decisions
public class print_all_subsequence {
    static ArrayList<String> li = new ArrayList<>();
    public static void main(String[] args) {
        String s = "aadc";
        solve(s,"");
        System.out.println(li);
    }
    static void solve(String input, String output){
        if(input.length() == 0){
            li.add(output);
            return;
        }
        String out1 = output;
        String out2 = output+input.charAt(0);
        input = input.substring(1);
        solve(input,out1);
        solve(input,out2);
    }
}
