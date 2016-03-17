package com.serviceimpl;

import com.daoimpl.RegisterDaoImpl;
import com.service.RegistrationService;

public class RegisterServiceImpl implements RegistrationService {

	@Override
	public int registrationService(String custid, String password,
			String fname, String lname, String phone, String email,
			String address) {
		// TODO Auto-generated method stub
		RegisterDaoImpl rdi=new RegisterDaoImpl();
		return rdi.registerDao(custid, password, fname, lname, phone, email, address);
	}

}
