package com.example.student.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student.entities.Student;

public interface ProductRepository extends JpaRepository<Student, Long>  {
    
}
