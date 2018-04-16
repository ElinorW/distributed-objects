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
    private String lastName;

    public Student() {
      //means you can create a student without a first name and a surname...
      //if you change it to protected, then you cant
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // create constructor to hold all this fields /\
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return firstName;
    }

    public void setFirst_name(String first_name) {
        this.firstName = firstName;
    }

    public String getLast_name() {
        return lastName;
    }

    public void setLast_name(String last_name) {
        this.lastName = lastName;
    }

    public interface Update {
    }
}
