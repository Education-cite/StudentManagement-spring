package com.exam.impl;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.Teacher;
import com.exam.repo.TeacherRepo;
import com.exam.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{
	
	@Autowired
	TeacherRepo teacherRepo;

	@Override
	public Teacher addTeacher(Teacher teacher) {

		return this.teacherRepo.save(teacher);
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {

		return this.teacherRepo.save(teacher);
	}

	@Override
	public void deleteTeacher(Long Teacherid) {
		Teacher teacher=new Teacher();
		teacher.settId(Teacherid);
		this.teacherRepo.deleteById(Teacherid);
		
	}

	@Override
	public List<Teacher> getTeachers() {

		return   this.teacherRepo.findAll();
	}

	@Override
	public Teacher getTeacher(Long Teacherid) {

		return this.teacherRepo.findById(Teacherid).get();
	}
	
	
	
	
	
	
	

}
