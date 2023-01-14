package com.example.javatest.subset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem9 {
    static int[] A = new int[4];
    static int[] B = new int[4];
    static int check = 0;
    public void solve() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        String arr = bf.readLine();


        int result = 0;

        st = new StringTokenizer(bf.readLine());

        for(int i = 0 ; i < 4; i++){
            A[i] = Integer.parseInt(st.nextToken());
            if(A[i] == 0){
                check++;
            }
        }

//        HashSet<String> hashSet = new HashSet<>();

        for(int i = 0 ; i < P; i++){
            add(arr.charAt(i));
        }
        if (check == 4 ){
            result++;
//            hashSet.add(arr.substring(0, P));
        }
        for(int start_index = 0 ; start_index < S - P  ; start_index++){

            remove(arr.charAt(start_index));
            add(arr.charAt(start_index+P));
            if(check == 4){
                result++;
//                hashSet.add(arr.substring(start_index, start_index+P));
            }
        }
        System.out.println(result);
        bf.close();
    }
    void add(char c){
        switch (c) {
            case 'A':
                B[0]++;
                if(A[0] == B[0]){
                    check++;
                }
                break;
            case 'C':
                B[1]++;
                if(A[1] == B[1]){
                    check++;
                }
                break;
            case 'G':
                B[2]++;
                if(A[2] == B[2]){
                    check++;
                }
                break;
            case 'T':
                B[3]++;
                if(A[3] == B[3]){
                    check++;
                }
                break;
        }
    }
    void remove(char c) {
        switch (c) {
            case 'A':
                if(A[0] == B[0]){
                    check--;
                }
                B[0]--;
                break;
            case 'C':
                if(A[1] == B[1]){
                    check--;
                }
                B[1]--;
                break;
            case 'G':
                if(A[2] == B[2]){
                    check--;
                }
                B[2]--;
                break;
            case 'T':
                if(A[3] == B[3]){
                    check--;
                }
                B[3]--;
                break;
        }
    }
}
