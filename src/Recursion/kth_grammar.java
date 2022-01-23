package Recursion;
import java.util.*;
//https://leetcode.com/problems/k-th-symbol-in-grammar/ refer to this question

// the question is completely based on observation
//0
//10
//1001
//10010110 => look at the first half of this segment it is completely identical to the upper row
// also the second half is complement to the upper row
public class kth_grammar {
    public static void main(String[] args) {
        int n = 4, k = 3;
        System.out.println(solve(n, k));
    }

    static int solve(int n, int k) {
        if (n == 1 && k == 1) return 0;
        int mid = (int) Math.pow(2, n - 2);
        if (k <= mid) return solve(n - 1, k);
        else {
            if (solve(n, k - mid) == 0) return 1;
            else return 0;
        }
    }
}
