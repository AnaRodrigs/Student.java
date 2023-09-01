package com.example.student.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>  {
    
}
