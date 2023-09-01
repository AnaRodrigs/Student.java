package com.example.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.entities.Student;
import com.example.student.repositories.StudentRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class StudentService {  
    
    @Autowired
    private StudentRepository repository; 

    public List<Student> getStudents() {                                       
        return this.repository.findAll();
    }

    public Student getStudent(long id){
        return this.repository.findById(id)
                                .orElseThrow(
                                 ()-> new EntityNotFoundException("Student not found")  
                                  );
 }


}

