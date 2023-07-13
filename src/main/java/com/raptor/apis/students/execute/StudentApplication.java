package com.raptor.apis.students.execute;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan("com")
@EnableJpaRepositories("com.raptor.apis.students.domain.dao")
@EntityScan("com.raptor.apis.students.domain.dao.entity")
public class StudentApplication {

    public static void main ( final String ...a) {
       SpringApplication.run(StudentApplication.class);
    }

}
