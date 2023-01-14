package com.example.javatest.subset;

import java.io.*;
import java.util.*;

public class Problem11 {
    public void solve() throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuffer bf = new StringBuffer();
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean result = true;

        for (int i = 0; i < N; i++) {
            if (A[i] >= num) {
                while (A[i] >= num) {
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            } else {
                int n = stack.pop();
                if (n > A[i]) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }
        if(result) {
            System.out.println(bf.toString());
        }


    }
}
