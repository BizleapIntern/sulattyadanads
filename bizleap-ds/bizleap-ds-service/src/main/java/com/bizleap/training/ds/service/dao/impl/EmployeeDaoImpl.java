package com.bizleap.training.ds.service.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bizleap.commons.domain.Company;
import com.bizleap.commons.domain.Employee;
import com.bizleap.commons.domain.exception.ServiceUnavailableException;
import com.bizleap.training.ds.service.dao.EmployeeDao;

@Repository
public class EmployeeDaoImpl extends AbstractDaoImpl<Employee,String> implements EmployeeDao {
	
	protected EmployeeDaoImpl() {
		super(Employee.class);
	}

	@Override
	public void save(Employee employee) throws ServiceUnavailableException {
		// TODO Auto-generated method stub
		saveOrUpdate(employee);
		
	}
 
//	@Override
//	public List findByString(String queryString, String data) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List findByStringInteger(String queryString, String data, int data1) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List findByString(String queryString) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List findByString(String queryString, String data, String data1) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List findByIntegerString(String queryString, Integer data, String data1) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public long getCount(String queryString) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public List getAll(String queryString) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List getAll(String queryString, int pageNumber) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
