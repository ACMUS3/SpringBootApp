package com.example.springbootapp.runner;

import org.springframework.boot.CommandLineRunner;

public class MessageRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Welcome");
    }
}
