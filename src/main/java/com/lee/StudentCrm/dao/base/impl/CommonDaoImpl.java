package com.lee.StudentCrm.dao.base.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.lee.StudentCrm.dao.base.CommonDao;

public class CommonDaoImpl<T> implements CommonDao<T>{
	private Class classt;
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public CommonDaoImpl(){
		ParameterizedType type = (ParameterizedType)this.getClass().getGenericSuperclass();
		this.classt = (Class)type.getActualTypeArguments()[0];
	}

	public List<T> findAllEntry() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from "+this.classt.getName());
	}

	public void saveEntry(T t) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(t);
	}

	public void updateEntry(T t) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(t);
	}

	public void deleteEntry(Serializable id) {
		// TODO Auto-generated method stub
		T t = (T)this.hibernateTemplate.get(this.classt, id);
		this.hibernateTemplate.delete(t);;
	}

	public T getEntryByID(Serializable id) {
		// TODO Auto-generated method stub
		return (T)this.hibernateTemplate.get(this.classt, id);
	}

}
