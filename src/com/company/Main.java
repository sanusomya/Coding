package com.company;


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();

        int a[] = new int[N];

        int b[] = new int[N];

        for (int i = 0; i < N; i++) {

            a[i] = sc.nextInt();

        }

        for (int i = 0; i < N; i++) {

            b[i] = sc.nextInt();

        }


        helper(a, b);


    }

    static void helper(int a[], int b[]) {

        int n = a.length;


        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();


        pq.addAll(Arrays.stream(a).boxed().collect(Collectors.toList()));


        int mergeCost = 0;


        while (pq.size() > 1) {

            int a1 = pq.poll();

            int a2 = pq.poll();


            mergeCost += a1 + a2;


            pq.add(a1 + a2);

        }


        int finalSize = pq.peek();

        System.out.println(mergeCost);


        int totalCost = 0;

        for (int i = 0; i < a.length; i++) {

            totalCost += a[i] * b[i];

        }


        if (totalCost > mergeCost)

            System.out.println("YES");

        else

            System.out.println("NO");

    }
}
