package com.raptor.apis.students.service;


import com.raptor.apis.students.domain.dao.StudentRepository;
import com.raptor.apis.students.domain.dao.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentService() {
        super();
    }

    public List<Student> getAllStudents() {
        List<Student> allStudents = null;

        /* --- retrieve all students --- */
        final Iterable<Student> students = studentRepository.findAll();
        if ( students != null ) {
            allStudents = new ArrayList<>(20);
            students.forEach( allStudents :: add);
        }

        return allStudents;
    }

}


