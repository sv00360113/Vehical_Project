package com.serviceimpl;

import com.daoimpl.EditDaoImpl;
import com.service.EditSevice;

public class EditServiceImpl implements EditSevice {

	@Override
	public int editService(String vid, String name, String chassy,
			String regno, String permit, String vtype, String clss,
			String htype, String fueltype, String man, String vendor,
			String ins, int seat, int ava, String payment) {
		// TODO Auto-generated method stub
		EditDaoImpl edit1=new EditDaoImpl();
		return edit1.edit(vid, name, chassy, regno, permit, vtype, clss, htype, fueltype, man, vendor, ins, seat, ava, payment);
	}

}
