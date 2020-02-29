package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

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

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" )
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    Date datestart;
}