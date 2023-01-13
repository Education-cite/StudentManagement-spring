package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.model.Student;
import com.exam.repo.StudentRepo;

@RestController
@CrossOrigin("*")
public class StudentRestController {
	
	@Autowired
	private StudentRepo  studentRepo;
	
	@PostMapping("/student")
	public Student addstudent(@RequestBody Student student) {
		return this.studentRepo.save(student);
	}
	
	
	@GetMapping("/student")
	public List<Student> getall(){
		return studentRepo.findAll();
		
		
	}
	
	@GetMapping("/student/{sId}")

	public Student getstudentByid(@PathVariable("sId") Long sId) {
		return this.studentRepo.findById(sId).get();
		
	}
	
	
	@DeleteMapping("/student/{sId}")

	public void deletestudentByid(@PathVariable("sId") Long sId) {
		Student student=new Student();
		student.setsId(sId);
		studentRepo.delete(student);
		
	}
	
	
	
	
	
	
	
	
	

}
