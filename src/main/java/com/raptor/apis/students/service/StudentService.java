package com.raptor.apis.students.service;


import com.raptor.apis.students.domain.dao.StudentRepository;
import com.raptor.apis.students.domain.dao.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    /** -- member variables -- */
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentService.class);

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

            LOGGER.debug("{} student(s) found." , allStudents.size() );
        }

        return allStudents;
    }


    public Student createStudent( final Student student ) {
        final Student __student = this.studentRepository.save(student);
        LOGGER.info("saved student with details {} " ,__student);

        return __student;
    }

    public Student getStudent( final Long studentId ) {
        return studentRepository.findById(studentId).get();
    }

}


