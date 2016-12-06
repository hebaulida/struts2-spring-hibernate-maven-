package com.lee.StudentCrm.test;

import org.junit.Test;

import com.lee.StudentCrm.domain.Student;
import com.lee.StudentCrm.service.StudentService;

public class StudentTest extends SpringUtil {
	@Test
	public void saveTest(){
		StudentService studentService = (StudentService)context.getBean("studentService");
		Student student = new Student();
		student.setName("赵钱孙李1");
		student.setAge(11);
		studentService.saveEntry(student);
	}
	
	@Test
	public void StudentActionTest(){
		context.getBean("studentAction");
	}
}
