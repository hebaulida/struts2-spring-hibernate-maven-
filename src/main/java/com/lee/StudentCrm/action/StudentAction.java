
package com.lee.StudentCrm.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.context.ApplicationContext;

import com.lee.StudentCrm.domain.Student;
import com.lee.StudentCrm.service.StudentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudentAction extends ActionSupport implements ModelDriven<Student>{
	private Student model = new Student();
	public Student getModel() {
		return this.model;
	}
	
	private StudentService studentService;
	public StudentService getStudentService() {
		return studentService;
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	public String saveStudent(){
		Student student = new Student();
		BeanUtils.copyProperties(this.getModel(), student);
		this.studentService.saveEntry(student);
		return "action2action";
	}
	
	public String getStudentById(){
		
		return "action2action";
	}
	
	public String updateStudentUI(){
		Student student = this.studentService.getEntryByID(this.model.getSid());
		ActionContext.getContext().getValueStack().push(student);
		
		return "updateStudentUI";
	}
	
	public String updateStudent(){
		Student student = this.studentService.getEntryByID(getModel().getSid());
		BeanUtils.copyProperties(this.getModel(), student);
		this.studentService.updateEntry(student);
		return "action2action";
	}
	
	public String delStudent(){
		
		this.studentService.deleteEntry(getModel().getSid());
		return "action2action";
	}
	
	public String showStudent(){
		List<Student> students = this.studentService.findAllEntry();
		ActionContext.getContext().put("students", students);
		return "list";
	}
	
	public String addUI(){
		return "addUI";
	}
	
	
	public String map(){
		Student student = new Student();
		student.setName("a");
		student.setAge(1);
		Map<String, Student> map = new HashMap<String, Student>();
		map.put("map", student);
		ActionContext.getContext().put("map", map);
		
		return "list";
	}
	
	public String listMap(){
		List<Map<String, Student>> list = new ArrayList<Map<String,Student>>();
		Student student = new Student();
		student.setName("aaa");
		student.setAge(12);
		Student student1 = new Student();
		student1.setName("bbb");
		student1.setAge(13);
		Map<String, Student> map = new HashMap<String, Student>();
		map.put("map", student);
		map.put("map1", student1);
		Map<String, Student> map1 = new HashMap<String, Student>();
		map1.put("map", student);
		map1.put("map1", student1);
		list.add(map);
		list.add(map1);
		ActionContext.getContext().put("list", list);
		return "list";
	}
	public String mapList(){
		Map<String, List<Student>> map = new HashMap<String, List<Student>>();
		
		Student student = new Student();
		student.setName("a");
		student.setAge(1);
		List<Student> list = new ArrayList<Student>();
		list.add(student);
		map.put("list", list);
		ActionContext.getContext().put("map", map);
		
		return "list";
	}
	public String listMapList(){
		List<Map<String, List<Student>>> list = new ArrayList<Map<String,List<Student>>>();
		Map<String, List<Student>> map = new HashMap<String, List<Student>>();
		List<Student> students = new ArrayList<Student>();
		Student student = new Student();
		student.setName("abc");
		student.setAge(123);
		students.add(student);
		map.put("map", students);
		list.add(map);
		ActionContext.getContext().put("list", list);
		return "list";
	}


}
