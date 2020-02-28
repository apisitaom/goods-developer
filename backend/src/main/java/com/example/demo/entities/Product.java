package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class Product {

    @Id
    @GeneratedValue
    private Long productId;
    private String name;
}