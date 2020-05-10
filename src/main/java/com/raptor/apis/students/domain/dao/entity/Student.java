package com.raptor.apis.students.domain.dao.entity;


import javax.persistence.*;

@Entity
@Table( name = "STUDENTS")
public class Student {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;


    public Student() {
        super();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
