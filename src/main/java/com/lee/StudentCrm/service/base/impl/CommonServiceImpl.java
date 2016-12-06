package com.lee.StudentCrm.service.base.impl;

import java.io.Serializable;
import java.util.List;

import com.lee.StudentCrm.dao.base.CommonDao;
import com.lee.StudentCrm.service.base.CommonService;

public class CommonServiceImpl<T> implements CommonService<T> {
	private CommonDao commonDao;
	
	public CommonDao getCommonDao() {
		return commonDao;
	}
	public void setCommonDao(CommonDao commonDao) {
		this.commonDao = commonDao;
	}
	
	public List<T> findAllEntry() {
		return this.commonDao.findAllEntry();
	}
	public void saveEntry(T t) {
		this.commonDao.saveEntry(t);
	}
	public void updateEntry(T t) {
		this.commonDao.updateEntry(t);
	}
	public void deleteEntry(Serializable id) {
		this.commonDao.deleteEntry(id);
	}
	public T getEntryByID(Serializable id) {
		return (T)this.commonDao.getEntryByID(id);
	}
	
	
}
