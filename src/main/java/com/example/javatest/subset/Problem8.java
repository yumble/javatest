package com.example.javatest.subset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem8 {
    public void solve() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int A[] = new int[N];
        for(int i = 0 ; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int count = 0;


        for(int i = 0 ; i < N ; i ++){
            int find = A[i];
            int start_index = 0;
            int end_index = N - 1;
            while(start_index != end_index){
                int sum = A[start_index] + A[end_index];
                if(sum == find){
                    if(start_index == i)
                        start_index++;
                    else if (end_index == i)
                        end_index--;
                    else {
                        count++;
                        break;
                    }
                } else if (sum > find) {
                    end_index--;
                } else {
                    start_index++;
                }
            }
        }
        System.out.println(count);

    }
}
