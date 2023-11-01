package com.example.demo;

import com.example.demo.Validation.Age;
import com.example.demo.Validation.UserName;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.UUID;

public class User {
    @NotBlank(message = "First Name cannot be blank")
    @Size(min = 2, message = "First Name is too short")
    private String firstName;
    @NotBlank(message = "Last Name cannot be blank")
    @Size(min = 2, message = "Last Name is too short")
    private String lastName;
    @UserName
    @NotBlank(message = "User Name cannot be blank")
    @Size(min = 7, message = "User Name is too short")
    private String userName;
    @Email(message = "Invalid Email")
    private String email;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past(message = "date of birth must be in the past")
    @Age
    private Date dateOfBirth;
    private String id;

    public User() {
        this.id = UUID.randomUUID().toString();
    }

    public User(String firstName, String lastName, String userName, String email, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
