package com.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.model.Course;

public interface CourseRepo extends JpaRepository<Course, Long>{

}
