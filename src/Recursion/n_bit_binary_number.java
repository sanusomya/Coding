package Recursion;

import java.util.*;
public class n_bit_binary_number {
    static ArrayList<String> li = new ArrayList<>();
    public static void main(String[] args) {
        String s = "1";
        solve(1,0,s,4);
        System.out.println(li);
    }
    static void solve(int one, int zero, String s, int n){
        if(one+zero == n) li.add(s);
        else if(one == zero) solve(one+1,zero,s+'1',n);
        else{
            solve(one+1,zero,s+'1',n);
            solve(one,zero+1,s+'0',n);
        }
    }
}
