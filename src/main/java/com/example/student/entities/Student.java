package com.example.student.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table(name= "TBL_STUDENT")
public class Student implements Serializable{ 

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (id ^ (id >>> 32));
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Student other = (Student) obj;
    if (id != other.id)
        return false;
    return true;
}
@Column(length = 1024, nullable = false, name = "name")
private String name;



private String curso;
private String email;
private String address;
private int phone;



public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getCurso() {
    return curso;
}
public void setCurso(String curso) {
    this.curso = curso ;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
public int getPhone() {
    return phone;
}
public void setPhone(int phone) {
    this.phone = phone;
}

}
