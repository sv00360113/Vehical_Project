package com.dao;

public interface RegisterDao {

	
	public int registerDao(String custid, String password,
			String fname, String lname, String phone, String email,
			String address);
}
