package com.example.usermanagementapp.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "user-tbl")
public class User {
    @Id
     private Integer userId;
    private String userName;
    private String dateOfBirth;
    private String email;
    private String phoneNumber;
    private String date;
    private String   time;

}
