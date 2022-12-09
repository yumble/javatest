package com.example.javatest;

import com.example.javatest.subset.Problem3;
import com.example.javatest.subset.Problem4;

import java.io.IOException;

public class JavatestApplication {

    public static void main(String[] args) throws IOException {
        //SpringApplication.run(JavatestApplication.class, args);
        Problem4 problem4 = new Problem4();
        problem4.solve();
    }

}
