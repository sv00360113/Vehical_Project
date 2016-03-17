package com.serviceimpl;

import java.util.ArrayList;

import com.bean.Customer;
import com.daoimpl.CustomerlistDaoImpl;
import com.service.CustomerlistService;

public class CustomerlistServiceImpl implements CustomerlistService {

	@Override
	public ArrayList<Customer> listCustomer() {
		// TODO Auto-generated method stub
		CustomerlistDaoImpl cust=new CustomerlistDaoImpl();
		return cust.listCustomer();
	}

}
