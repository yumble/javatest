package com.example.javatest;

import com.example.javatest.subset.Problem3;
import com.example.javatest.subset.Problem4;
import com.example.javatest.subset.Problem5;

import java.io.IOException;

public class JavatestApplication {

    public static void main(String[] args) throws IOException {
        //SpringApplication.run(JavatestApplication.class, args);
        Problem5 problem = new Problem5();
        problem.solve();
    }

}
