package com.example.javatest;

import com.example.javatest.subset.*;

import java.io.IOException;

public class JavatestApplication {

    public static void main(String[] args) throws IOException {
        //SpringApplication.run(JavatestApplication.class, args);
        Problem11 problem = new Problem11();
        problem.solve();
    }

}
