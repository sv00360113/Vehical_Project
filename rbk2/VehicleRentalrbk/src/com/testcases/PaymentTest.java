package com.testcases;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;




import com.bean.Payment;
import com.bean.Vehicle;
import com.daoimpl.PaymentDaoImpl;


public class PaymentTest 
{

@Test
public void viewPayment() throws ClassNotFoundException, SQLException
{
Payment p=new Payment();


PaymentDaoImpl cdi=new PaymentDaoImpl();
String vid="2";
ArrayList<Payment> al=cdi.paymentDao(vid);
Iterator itr=al.iterator();
/*while(itr.hasNext())
{

	
assertNotNull(al);

}*/
p=al.get(0);
assertEquals("1", p.getPayid());
System.out.println("successfull");
}
}