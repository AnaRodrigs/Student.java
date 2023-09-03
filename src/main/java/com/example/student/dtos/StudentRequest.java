package com.example.student.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record StudentRequest (
    @NotBlank(message = "Nome não pode ser em branco")
    String name,

    @NotBlank(message = "Nome não pode ser em branco")
    String curso,

    @Min (value = 8, message = "O número do telefone não pode ser assim")
    int telefone


)
{
    
}
