package com.serviceimpl;

import java.util.ArrayList;

import com.bean.Vehicle;
import com.daoimpl.ListAllDaoImpl;
import com.service.ListAvailable;

public class ListAvailableImpl implements ListAvailable {

	@Override
	public ArrayList<Vehicle> listAll() {
		// TODO Auto-generated method stub
		ListAllDaoImpl lad=new ListAllDaoImpl();
		return lad.listAllAvailable();
	}

}
