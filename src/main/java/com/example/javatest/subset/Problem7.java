package com.example.javatest.subset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem7 {
    public void solve() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int A[] = new int[N];
        for(int i = 0 ; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int count = 0;
        int start_index = 0;
        int end_index = N - 1;
        int sum = 0;

        while(start_index != end_index){
            sum = A[start_index] + A[end_index];
            if(sum == M){
                count++;
                end_index--;
            } else if (sum > M) {
                end_index--;
            } else {
                start_index++;
            }
        }
        System.out.println(count);

    }
}
