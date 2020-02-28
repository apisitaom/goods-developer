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
public class Address {
    @Id
    @GeneratedValue
    private Long addressId;
    private String subdistrict;
    private String district;
    private String province;
    private String postcode;
    private String address;
    private String phone;
}