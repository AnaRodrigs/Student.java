package com.example.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.dtos.StudentRequest;
import com.example.student.dtos.StudentResponse;
import com.example.student.entities.Student;
import com.example.student.mappers.StudentMapper;
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

public void deleteStudentById(long id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Student not found ");
        }

    }

    public StudentResponse save(StudentRequest student) {
        var entity= this.repository.save(StudentMapper.toEntity(student));
        return StudentMapper.toDTO(entity);
    }

    
    public void update( long id, Student student) {
        
    try {
        var updateStudent= this.repository.getReferenceById(id);
        updateStudent.setName(student.getName());
        updateStudent.setCourse(student.getCourse());
        updateStudent.setAddress(student.getAddress());
        updateStudent.setPhone(student.getPhone());
        updateStudent.setEmail(student.getEmail());

        this.repository.save(updateStudent);
    }
   catch(EntityNotFoundException e){
    throw new EntityNotFoundException("Student not found");
   }
} }
