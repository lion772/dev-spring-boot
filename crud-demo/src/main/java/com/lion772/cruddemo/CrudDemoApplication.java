package com.lion772.cruddemo;

import com.lion772.cruddemo.DAO.StudentDAO;
import com.lion772.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

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
			//createStudent(studentDao);
			//createMultipleStudents(studentDao);
			//readStudent(studentDao);
			//queryForStudents(studentDao);
			queryForStudentsByLastname(studentDao);
		};
	}

	private void queryForStudentsByLastname(StudentDAO studentDao) {
		List<Student> studentsToBeFound = studentDao.findByLastName("Steinke");
		for (Student student: studentsToBeFound) {
			System.out.println(student);
		}

	}

	private void queryForStudents(StudentDAO studentDao) {
		// get a list of students
		List<Student> students = studentDao.findAll();
		// display list of students
		for (Student student: students) {
			System.out.println(student);
		}

	}

	private void readStudent(StudentDAO studentDAO) {
		//create student object
		Student tempStudent = new Student("Daffy", "duck", "daffy@gmail.com");

		//save the student object
		studentDAO.save(tempStudent);

		//retrieve student based on the id
		Student student = studentDAO.findById(tempStudent.getId());
		System.out.println( student);


	}

	private void createMultipleStudents(StudentDAO studentDao) {
		Student student1 = new Student("William", "Steinke", "william.steinkedemello@hotmail.com");
		Student student2 = new Student("Franziska", "Steinke", "franziska.steinkedemello@hotmail.com");
		Student student3 = new Student("Arthur", "Steinke", "arthur.steinkedemello@hotmail.com");

		System.out.println("Saving the students ...");
		studentDao.save(student1);
		studentDao.save(student2);
		studentDao.save(student3);
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
