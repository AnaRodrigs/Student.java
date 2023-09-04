package com.example.student.dtos;

public record StudentResponse (
 long id,
 String nome,
 String curso,
 String endereco,
 int telefone,
 String email
)
{
    
}
