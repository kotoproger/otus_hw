package ru.otus.kondakov.homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;
import ru.otus.kondakov.homework.configuration.RsaProperties;

@SpringBootApplication(
	nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class
)
@ComponentScan(
	basePackages = {"ru.otus.kondakov.homework"},
	nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class
)
@EnableConfigurationProperties(RsaProperties.class)
public class HomeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeworkApplication.class, args);
	}

}
