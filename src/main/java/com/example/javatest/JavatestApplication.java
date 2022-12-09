package com.example.javatest;

import com.example.javatest.subset.Problem3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

@SpringBootApplication
public class JavatestApplication {

    public static void main(String[] args) throws IOException {
        //SpringApplication.run(JavatestApplication.class, args);
        Problem3 problem3 = new Problem3();
        problem3.solve();
    }

}
