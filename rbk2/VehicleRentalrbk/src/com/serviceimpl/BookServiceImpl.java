package com.serviceimpl;

import java.util.Date;

import com.daoimpl.BookDaoImpl;
import com.service.BookService;

public class BookServiceImpl implements BookService {

	@Override
	public int bookVehicle(String userid, String vid, String days,
			String fromdate, String todate,int distance,int amount) {
		// TODO Auto-generated method stub
		BookDaoImpl bdi=new BookDaoImpl();
		return bdi.bookDao(userid, vid, days, fromdate, todate,distance,amount);
	}

}
