package Recursion;

import java.util.*;
//https://practice.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1/# refer to this question
public class tower_of_hanaoi {
    static int ans = 0;
    public static void main(String[] args) {
        int n = 3;
        solve(n,1,2,3);
        System.out.println(ans);
    }
    static void solve(int N, int from, int to, int aux){
        ans ++;
        if(N == 1) {
            System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
            return;
        }
        solve(N-1,from,aux,to);
        System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
        solve(N-1,aux,to,from);

    }
}
