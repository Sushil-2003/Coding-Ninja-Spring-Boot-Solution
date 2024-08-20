package com.example.website.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.example.website.domain.StudentUser;

@Repository
@Scope("singleton")
public class StudentUserDAO implements DAO<StudentUser> {

	private List<StudentUser> studentUserList = new ArrayList<StudentUser>();
	
	@Override
	public Optional<StudentUser> get(Integer id) {
		if(!studentUserList.isEmpty()) {
			return Optional.of(studentUserList.get(id));
		}
		return Optional.empty();
	}

	@Override
	public int save(StudentUser student) {
		int userId = studentUserList.size();
		student.setId(userId);
		studentUserList.add(student);
		System.out.println("Student saved" + userId);
		return userId;
	}

}
