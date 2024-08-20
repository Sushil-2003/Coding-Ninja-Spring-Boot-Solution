package com.sushil11.student.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushil11.student.dal.StudentDAL;
import com.sushil11.student.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentDAL studentDAL;
	
	@Transactional
	public void save(Student student) {
		studentDAL.save(student);
	}
}
