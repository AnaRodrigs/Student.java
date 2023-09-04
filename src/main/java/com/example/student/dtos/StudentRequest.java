package com.example.student.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record StudentRequest (
    @NotBlank(message = "Nome não pode ser em branco")
    String nome,

    @NotBlank(message = "Curso não pode ser em branco")
    String curso,

    @NotBlank(message = "Endereço não pode ser em branco")
    String endereco,

    @Min (value = 0, message = "O valor mínimo para o preço é zero")
    int telefone,

     @NotBlank(message = "email não pode ser em branco")
     String email
)
{
    
}
