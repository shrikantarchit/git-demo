package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

	public void m() {
		System.out.println("test done");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
	}

}
