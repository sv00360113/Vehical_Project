package com.serviceimpl;

import java.util.ArrayList;

import com.bean.Vehicle;
import com.daoimpl.ModifyDaoImpl;
import com.service.modifyService;

public class modifyServiceImpl implements modifyService {

	@Override
	public ArrayList<Vehicle> modify(String vid) {
		// TODO Auto-generated method stub
		ModifyDaoImpl mod=new ModifyDaoImpl();
		return mod.modify(vid);
	}

}
