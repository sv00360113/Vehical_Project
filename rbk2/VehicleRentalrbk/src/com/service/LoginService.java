package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Login;

public interface LoginService {

	public ArrayList<Login>loginService(String userid,String password);
	
}
