package com.serviceimpl;

import java.util.ArrayList;

import com.bean.VehicleRental;
import com.daoimpl.ListAllDaoImpl;
import com.daoimpl.ListBookingdaoImpl;

import com.service.ListBookingService;

public class ListBookingServiceImpl implements ListBookingService {

	@Override
	public ArrayList<VehicleRental> listAll() {
		// TODO Auto-generated method stub
		ListBookingdaoImpl l=new ListBookingdaoImpl();
		return l.listBooking();

	}

}
