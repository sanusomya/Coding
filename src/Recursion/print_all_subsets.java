package Recursion;

import java.util.ArrayList;

//subset allows order alteration i.e. ab and ba all are allowed
public class print_all_subsets {
    static ArrayList<String> li = new ArrayList<>();
    public static void main(String[] args) {
        String s = "ac";
        solve(s,"");
        System.out.println(li);
    }

    static void solve(String input, String output) {
        if(input.length() == 0){
            li.add(output);
            return;
        }
        if(output.length() == 0 && input.length() == 1){
            li.add(output+input.charAt(0));
            input = input.substring(1);
            solve(input,output);
            return;
        }
        String out1 = output;
        String out2 = output+input.charAt(0);
        String out3 = input.charAt(0)+output;
        input = input.substring(1);
        solve(input,out1);
        solve(input,out2);
        solve(input,out3);
    }
}
