package com.example.Security.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Security.entity.student;
import com.example.Security.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentrepo;
	
	public void insert(student s) {
		studentrepo.save(s);
	}
	public List<student> getAll(){
		return studentrepo.findAll();
	}
	public Optional<student> findByStudentId(Integer id) {
		Optional<student> findById = studentrepo.findById(id);
		return findById;
	}
	

}
