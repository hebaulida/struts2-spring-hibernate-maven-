package com.lee.StudentCrm.test;

import org.junit.Test;

import com.lee.StudentCrm.domain.Student;
import com.lee.StudentCrm.service.StudentService;

public class StudentServiceTest extends SpringUtil {
	@Test
	public void StudentServiceTest(){
		StudentService studentService =(StudentService) context.getBean("studentService");
		Student student = new Student();
		student.setName("abc1");
		studentService.saveEntry(student);
	}
}
