package com.raptor.apis.students.expose;


import com.raptor.apis.students.domain.dao.entity.Student;
import com.raptor.apis.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/school")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/students" , produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<List<Student>> getStudents() {
        final ResponseEntity<List<Student>> responseEntity = new
                ResponseEntity<>(studentService.getAllStudents() , HttpStatus.OK);

        return responseEntity;
    }

}