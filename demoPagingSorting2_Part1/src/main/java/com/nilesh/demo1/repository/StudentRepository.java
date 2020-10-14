package com.nilesh.demo1.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.nilesh.demo1.model.Student;

public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {

}
