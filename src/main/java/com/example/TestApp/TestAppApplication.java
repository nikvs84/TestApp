package com.example.TestApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TestAppApplication {

	@Autowired
	DataController dataController;

	@PostConstruct
	public void init() {
		dataController.showData();
	}

	public static void main(String[] args) {
		SpringApplication.run(TestAppApplication.class, args);
	}
}
