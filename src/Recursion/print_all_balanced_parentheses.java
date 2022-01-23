package Recursion;

import java.util.*;
public class print_all_balanced_parentheses {
    static ArrayList<String> li = new ArrayList<>();
    public static void main(String[] args) {
        int n = 9;
        String s = "(";
        solve(n,n-1,s);
        System.out.println(li);
    }
    static void solve(int closed, int open,String s){
        if(open == 0 && closed == 0){
            li.add(s);
        }
       else if(open == 0 && closed > 0) solve(closed-1,open,s+')');
        else if(closed == open) solve(closed,open-1,s+'(');
        else {
            String s1 = s + '(';
            String s2 = s + ')';
            solve(closed, open - 1, s1);
            solve(closed - 1, open, s2);
        }

    }
}
