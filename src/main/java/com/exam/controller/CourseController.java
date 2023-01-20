package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.model.Course;
import com.exam.service.CourseService;

@RestController
@RequestMapping("/course")
@CrossOrigin("*")
public class CourseController {
	
	
	@Autowired
	private CourseService courseService;
	
	
	
	@PostMapping("/")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addcourse(course);
	}
	
	
	@PutMapping("/")
	public Course updateCourse(@RequestBody Course course) {
		
		return this.courseService.updatecourse(course);
		
	}
	
	
	@GetMapping("/getcourse/{cid}")
	public Course getCourse(@PathVariable("cid") Long cid) {
		return this.courseService.getcourse(cid);
	}
	
	
	@GetMapping("/getallcourse")
	public List<Course> getAllCourse(){
		return this.courseService.getallcourse();
	}
	
	
	@DeleteMapping("/deletecourse/{cid}")
	public void deleteCourse(@PathVariable("cid") Long cid) {
		 this.courseService.deletecourse(cid);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
