package com.exam.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.Course;
import com.exam.repo.CourseRepo;
import com.exam.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	
	
	@Autowired
	private CourseRepo courseRepo;

	@Override
	public Course addcourse(Course course) {

		return this.courseRepo.save(course);
	}

	@Override
	public Course updatecourse(Course course) {

		return this.courseRepo.save(course);
	}

	@Override
	public List<Course> getallcourse() {

		return this.courseRepo.findAll();
	}

	@Override
	public Course getcourse(Long courseid) {

		return this.courseRepo.findById(courseid).get();
	}

	@Override
	public void deletecourse(Long courseid) {
		Course course = new Course();
		course.setCid(courseid);
		this.courseRepo.delete(course);
		
	}
	
	
	

}
