package com.shakil.model;

import com.shakil.enums.UserRole;
import lombok.*;

import javax.persistence.Entity;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User extends BaseModel{

    @NotNull(message = "name cannot be null")
    @Size(min = 4, max = 10, message
            = "Name must be between 4 and 10 characters")
    private String username;
    private UserRole role;
    private String age;
    private String email;
    private String password;
    private Date dateOfBirth;
    private String gender;
    private String address;
    private Attachment userImage;


}