package com.dao;

import java.util.ArrayList;

import com.bean.Payment;

public interface PaymentDao {

	public ArrayList<Payment> paymentDao(String vid);
	
}
