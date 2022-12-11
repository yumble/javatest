package com.example.javatest;

import com.example.javatest.subset.*;

import java.io.IOException;

public class JavatestApplication {

    public static void main(String[] args) throws IOException {
        //SpringApplication.run(JavatestApplication.class, args);
        Problem8 problem = new Problem8();
        problem.solve();
    }

}
