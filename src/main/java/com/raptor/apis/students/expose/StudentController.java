package com.raptor.apis.students.expose;


import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/school")
public class StudentController {


    @GetMapping(path = "/students" , produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity getStudents() {
        return null;
    }

}
