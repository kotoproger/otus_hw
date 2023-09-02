package ru.otus.kondakov.homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;

@SpringBootApplication(
	nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class
)
@ComponentScan(
	basePackages = {"ru.otus.kondakov.homework"},
	nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class
)
public class HomeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeworkApplication.class, args);
	}

}
