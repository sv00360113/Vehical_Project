package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.bean.Login;

public interface LoginDao {

	public ArrayList<Login> loginDao(String userid,String password);
}
