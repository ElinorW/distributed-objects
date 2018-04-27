package com.example.studentproject.domain;

import org.hibernate.sql.Update;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull(groups=Update.class)
    private Long id;
    private String firstName;
    private String surname;

    public Student() {
      //means you can create a student without a first name and a surname...
      //if you change it to protected, then you cant
    }

    public Student(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }
    // create constructor to hold all this fields /\
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return surname;
    }

    public void setLastname(String surname) {
        this.surname = surname;
    }

    public interface Update {
    }
}
