package com.raptor.apis.students.expose;


import com.raptor.apis.students.domain.dao.entity.Student;
import com.raptor.apis.students.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/school")
public class StudentController {

    /** -- member variables -- */
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentController.class);


    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/students" , produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<List<Student>> getStudents() {
        final ResponseEntity<List<Student>> responseEntity = new
                ResponseEntity<>(studentService.getAllStudents() , HttpStatus.OK);

        return responseEntity;
    }

    @GetMapping(path = "{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getStudent(@PathVariable("id") final String studentId ) {
        final Student student = studentService.getStudent(studentId);

        System.out.println("Student Id - " + studentId);

        ResponseEntity<?> responseEntity;
        if ( student == null ) {
            responseEntity = new ResponseEntity<>("student not found." , HttpStatus.NOT_FOUND);
        } else {
            responseEntity = new ResponseEntity<>(student , HttpStatus.OK);
        }

        return responseEntity;
    }
}