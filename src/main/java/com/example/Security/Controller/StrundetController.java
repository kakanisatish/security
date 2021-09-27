package com.example.Security.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.Security.entity.student;
import com.example.Security.service.StudentService;

@RestController
@RequestMapping("/student")
public class StrundetController {
	@Autowired
	private StudentService studentservice;
	@PostMapping("/insert")
	public ResponseEntity<student> insert(@RequestBody student s){

		studentservice.insert(s);
		return new ResponseEntity<student>(s,HttpStatus.CREATED);
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<student>> getAll(){
		List<student> students = studentservice.getAll();
		return new ResponseEntity<List<student>>(students,HttpStatus.OK);
	}
	@GetMapping("/findByStudentId/{id}")
	public ResponseEntity<Optional<student>> findByStudentId(@PathVariable Integer id){
		Optional<student> Student = studentservice.findByStudentId(id);
		return new ResponseEntity<Optional<student>>(HttpStatus.OK);
	}
	

}
