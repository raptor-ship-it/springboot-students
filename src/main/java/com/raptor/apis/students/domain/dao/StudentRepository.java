package com.raptor.apis.students.domain.dao;

import com.raptor.apis.students.domain.dao.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student , Long> {}
