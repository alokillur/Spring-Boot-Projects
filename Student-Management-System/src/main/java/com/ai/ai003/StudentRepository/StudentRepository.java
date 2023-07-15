package com.ai.ai003.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ai.ai003.StudentEntity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
