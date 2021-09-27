package com.example.Security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.Security.entity.project;
@Repository
public interface RoleRepository extends JpaRepository<project, Integer>{

}
