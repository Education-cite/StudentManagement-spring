package com.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

	Student save(Student student);

}
