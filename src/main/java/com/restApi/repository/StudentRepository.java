package com.restApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restApi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
