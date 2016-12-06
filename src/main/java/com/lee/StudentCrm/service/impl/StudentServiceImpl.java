package com.lee.StudentCrm.service.impl;

import com.lee.StudentCrm.dao.StudentDao;
import com.lee.StudentCrm.dao.base.CommonDao;
import com.lee.StudentCrm.domain.Student;
import com.lee.StudentCrm.service.StudentService;
import com.lee.StudentCrm.service.base.impl.CommonServiceImpl;

public class StudentServiceImpl extends CommonServiceImpl<Student> implements StudentService{
	private StudentDao studentDao;
	public StudentDao getStudentDao() {
		return studentDao;
	}
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public CommonDao getCommonDao() {
		return studentDao;
	}

}
