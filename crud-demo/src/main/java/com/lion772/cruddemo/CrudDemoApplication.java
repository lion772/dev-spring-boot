package com.lion772.cruddemo;

import com.lion772.cruddemo.DAO.StudentDAO;
import com.lion772.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	// This little snippet of code will be executed after the beans have been loaded
	@Bean // inject StudentDAO
	public CommandLineRunner commandLineRunner(StudentDAO studentDao) {

		//Java lambda expression -> shorthand notation for creating an implementation for CommandLineRunner
		return runner -> {
			createStudent(studentDao);
		};
	}

	private void createStudent(StudentDAO studentDao) {
		//create the student object
		System.out.println("Creating new student object");
		Student theStudent = new Student("Paul", "Doe", "william.steinkedemello@hotmail.com");

		//Save the student object
		System.out.println("Saving the student");
		studentDao.save(theStudent);

		//display id of the saved student
		System.out.println("Saved student. Generated id: " + theStudent.getId());
	}

}
