package com.sushil11.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sushil11.student.entity.Student;
import com.sushil11.student.service.StudentService;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StudentApplication.class, args);
		StudentService studentService =  context.getBean(StudentService.class);
		Student student = new Student("sushil", "HETC");
		studentService.save(student);
	}

}
