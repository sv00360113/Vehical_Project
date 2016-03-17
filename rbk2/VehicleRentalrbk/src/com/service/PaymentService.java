package com.service;

import java.util.ArrayList;

import com.bean.Payment;

public interface PaymentService {

	public ArrayList<Payment> payment(String vid);
}
