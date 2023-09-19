package com.example.student.dtos;

public record StudentResponse(
        long id,
        String name,
        String course,
        String address,
        String phone,
        String email) {

}
