package com.exam.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.model.Teacher;
import com.exam.service.TeacherService;

@RestController
@RequestMapping("/teacher")
@CrossOrigin("*")
public class TeacherController {
	
	
	TeacherService teacherService;
	
	
	@PostMapping("/")
	public Teacher addTeacher(@RequestBody Teacher teacher) {
		return this.teacherService.addTeacher(teacher);	
		
	}
	
	

	@PutMapping("/")
	public Teacher updateTeacher(@RequestBody Teacher teacher) {
		return this.teacherService.updateTeacher(teacher);	
		
	}
	
	@GetMapping("/teacher")
	public List<Teacher> getTeachers(){
		return this.teacherService.getTeachers();
		
		
	}
	
	@GetMapping("/{tid}")
	public Teacher getstudentById(@PathVariable("tid") Long tid) {
		return this.teacherService.getTeacher(tid);
	}
	
	
	
	@DeleteMapping("/{tid}")
	public void deleteTeacher(@PathVariable("tid") Long tid) {
		this.teacherService.deleteTeacher(tid);
	}
	
	

	
}
