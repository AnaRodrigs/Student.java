package com.example.student.dtos;

public record StudentResponse (
 long id,
 String name,
 String curso,
 String address,
 int phone,
 String email
)
{
    
}
