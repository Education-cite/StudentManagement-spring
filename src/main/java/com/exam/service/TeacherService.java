package com.exam.service;

import java.util.List;


import com.exam.model.Teacher;

public interface TeacherService {
	
	public Teacher addTeacher(Teacher teacher);
	public Teacher updateTeacher(Teacher teacher);
	public void deleteTeacher(Long Teacherid);
	public List<Teacher> getTeachers();
	public Teacher getTeacher(Long Teacherid);
	

}
