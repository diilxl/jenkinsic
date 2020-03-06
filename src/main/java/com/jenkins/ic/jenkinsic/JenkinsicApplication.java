package com.jenkins.ic.jenkinsic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsicApplication {

    public static void main(String[] args) {

        System.out.println("Hello World JAVA");
        SpringApplication.run(JenkinsicApplication.class, args);
    }

}
