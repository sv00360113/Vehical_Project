package com.serviceimpl;

import com.daoimpl.AddDaoImpl;
import com.service.AddService;

public class AddServiceImpl implements AddService {

	@Override
	public int addService(String vid, String name, String chassy, String regno,
			String permit, String vtype, String clss, String htype,
			String fueltype, String man, String vendor, String ins, int seat,
			int ava, String payment) {
		// TODO Auto-generated method stub
		AddDaoImpl add=new AddDaoImpl();
		return add.addDao(vid, name, chassy, regno, permit, vtype, clss, htype, fueltype, man, vendor, ins, seat, ava, payment);
	}

}
