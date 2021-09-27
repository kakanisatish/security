package com.example.Security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.Security.entity.student;
@Repository
public interface StudentRepo extends JpaRepository<student,Integer> {
	public abstract student findByFirstname(String username);
}
