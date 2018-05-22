package com.bizleap.training.ds.service.dao.impl;

import org.springframework.stereotype.Repository;

import com.bizleap.commons.domain.Company;
import com.bizleap.commons.domain.Employee;
import com.bizleap.commons.domain.exception.ServiceUnavailableException;
import com.bizleap.training.ds.service.dao.CompanyDao;

@Repository
public class CompanyDaoImpl extends AbstractDaoImpl<Company,String> implements CompanyDao {

	protected CompanyDaoImpl() {
		super(Company.class);
	}

	@Override
	public void save(Company company) throws ServiceUnavailableException {
		// TODO Auto-generated method stub
		saveOrUpdate(company);

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
