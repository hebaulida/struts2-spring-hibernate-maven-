package com.lee.StudentCrm.dao.base;

import java.io.Serializable;
import java.util.List;

public interface CommonDao<T> {
	public List<T> findAllEntry();
	public void saveEntry(T t);
	public void updateEntry(T t);
	public void deleteEntry(Serializable id);
	public T getEntryByID(Serializable id);
}
