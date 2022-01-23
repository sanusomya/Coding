package Recursion;
import java.util.*;
//https://leetcode.com/problems/letter-case-permutation/submissions/ refer to this question
public class Letter_case_permutation {
    public static void main(String[] args) {
        String s = "aB5cDu";
        List<String> list = new ArrayList<>();
        solve(s,"",list);
        System.out.println(list);
    }
    static void solve(String in, String out, List<String> list){
        if(in.length() == 0){
            list.add(out);
            return;
        }
        if(Character.isLetter(in.charAt(0))){
            String out1 = out+Character.toUpperCase(in.charAt(0));
            String out2 = out+Character.toLowerCase(in.charAt(0));
            in = in.substring(1);
            solve(in,out1,list);
            solve(in,out2,list);
        }
        else{
            out = out+in.charAt(0);
            in = in.substring(1);
            solve(in,out,list);
        }
    }
}
