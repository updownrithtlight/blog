package com.billfu.blog.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyBean implements CommandLineRunner {
// @Autowired
// public MyBean(ApplicationArguments args) {
// boolean debug = args.containsOption("debug");
// List<String> files = args.getNonOptionArgs();
// // if run with "--debug logfile.txt" debug=true, files=["logfile.txt"]
// }

    @Override
    public void run(String... args) throws Exception {

    }
}