package com.example.javatest;

import com.example.javatest.subset.*;

import java.io.IOException;

public class JavatestApplication {

    public static void main(String[] args) throws IOException {
        //SpringApplication.run(JavatestApplication.class, args);
        Problem7 problem = new Problem7();
        problem.solve();
    }

}
