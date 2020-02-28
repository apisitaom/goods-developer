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
public class Shipping {
    @Id
    @GeneratedValue
    private Long shippingId;
    // ชื่อการส่ง เข่น กำลังส่ง
    private String shipping; 
    private String taxId;
    private Boolean status;
}