package com.lee.StudentCrm.test;


import org.junit.Test;

public class StudentDaoTest extends SpringUtil{
	@Test
	public void StudentDaoTest(){
		context.getBean("sessionFactory");
	}
}
