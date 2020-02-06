package com.example.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.data.annotation.CreatedDate;

import javax.validation.constraints.Min;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@Entity
// @JsonIgnoreProperties(
//         value = {"createdAt", "updatedAt"},
//         allowGetters = true
// )
@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class Seller {

    @Id
    @GeneratedValue
    @Column(name = "id", unique = true)
    private Long id;
    private String sellername;
    private @NotNull String email;
    private @NotNull String password;
    private @NotNull String phonenumber;
    private 
            @Positive 
            @Min(value = 12) int age;
    private String address;
    private String promtpay;
    private String facebook;
    private String line;
    private String detail;
    private Boolean status;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" )
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    Date datestart;

    // @Temporal(TemporalType.TIMESTAMP)
    // @Column(name = "updated_at", nullable = false)
    // @LastModifiedDate
    // private Date updatedAt;

    public void setStatue(Boolean status) {
        this.status = true;
    }

}