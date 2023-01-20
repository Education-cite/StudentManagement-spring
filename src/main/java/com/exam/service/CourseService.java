package com.exam.service;

import java.util.List;

import com.exam.model.Course;

public interface CourseService {
	
	
	public Course addcourse(Course course);
	public Course updatecourse(Course course);
	public List<Course> getallcourse();
	public Course getcourse( Long courseid);
	public void deletecourse(Long courseid);
	
	

}
