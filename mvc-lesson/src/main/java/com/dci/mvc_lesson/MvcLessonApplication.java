package com.dci.mvc_lesson;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcLessonApplication implements CommandLineRunner {

	@Value("${name.student}")
	String name;
	public static void main(String[] args) {
		SpringApplication.run(MvcLessonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(name);
	}
}
