package com.example.javatest;

import com.example.javatest.subset.*;

import java.io.IOException;

public class JavatestApplication {

    public static void main(String[] args) throws IOException {
        //SpringApplication.run(JavatestApplication.class, args);
        Problem12 problem = new Problem12();
        problem.solve();
    }

}
