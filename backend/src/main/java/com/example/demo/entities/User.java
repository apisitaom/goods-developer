package com.example.demo.entities;

import javax.persistence.*;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@Entity
@Table(name="users")
@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id", unique = true)
    private Long id;
    private @NotNull String email;
    private @NotNull String password;
    private String phonenumber;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" )
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    Date datestart;
}