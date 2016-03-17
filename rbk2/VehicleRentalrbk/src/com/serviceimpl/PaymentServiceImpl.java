package com.serviceimpl;

import java.util.ArrayList;

import com.bean.Payment;
import com.daoimpl.PaymentDaoImpl;
import com.service.PaymentService;

public class PaymentServiceImpl implements PaymentService {

	@Override
	public ArrayList<Payment> payment(String vid) {
		// TODO Auto-generated method stub
		PaymentDaoImpl dao=new PaymentDaoImpl();
		return dao.paymentDao(vid);
	}

}
