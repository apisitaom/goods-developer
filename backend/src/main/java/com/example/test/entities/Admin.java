package com.example.test.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.*;
@Entity
@Data
public class Admin {
    @Id@GeneratedValue
    private Long id;
    public String email;
    public String password;
}