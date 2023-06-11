package com.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.model.Student;
import com.exam.model.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Long>{




}
