package Recursion;

import java.util.*;
// the concept here is we can use a list as a data structure
// which store the permanent positions of people in the greater circle
public class josephus_problem {
    public static void main(String[] args) {
        int n = 40, k = 7;
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 1; i<=n; i++) li.add(i);
        System.out.println(solve(0,k-1,li));

    }
    static int solve(int n, int k, ArrayList<Integer> li){
        if(li.size() == 1) return li.get(0);
        n = (n+k)%li.size();
        li.remove(n);
        return solve(n,k,li);
    }
}
