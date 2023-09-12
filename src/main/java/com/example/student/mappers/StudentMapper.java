package com.example.student.mappers;

import java.util.List;
import java.util.stream.Collectors;

import com.example.student.dtos.StudentRequest;
import com.example.student.dtos.StudentResponse;
import com.example.student.entities.Student;

public class StudentMapper {
    

public static Student toEntity(StudentRequest request){
        Student student = new Student();
        student.setName(request.name());
        student.setCourse(request.course());
        student.setAddress(request.address());
        student.setPhone(request.phone());
        student.setEmail(request.email());
        
        return student;
    }

public static StudentResponse toDTO(Student student)
{
 return new StudentResponse (student.getId(),
                            student.getName(),
                            student.getCourse(),
                            student.getAddress(),
                            student.getPhone(),
                            student.getEmail()) ;
                         
                        }
       public static List<StudentResponse> toDTOList(List<Student> students) {
        return students.stream()
                .map(StudentMapper::toDTO) 
                .collect(Collectors.toList()); 
}
}