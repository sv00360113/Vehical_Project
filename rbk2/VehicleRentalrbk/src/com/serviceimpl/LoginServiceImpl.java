package com.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.bean.Login;
import com.daoimpl.LoginDaoImpl;
import com.service.LoginService;

public class LoginServiceImpl implements LoginService {

	@Override
	public ArrayList<Login> loginService(String userid, String password) {
		// TODO Auto-generated method stub
		
		LoginDaoImpl ldi=new LoginDaoImpl();
		return ldi.loginDao(userid, password);
	}

}
