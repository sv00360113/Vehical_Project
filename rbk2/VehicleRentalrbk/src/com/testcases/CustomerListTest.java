package com.testcases;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

import com.bean.Customer;
import com.daoimpl.CustomerlistDaoImpl;


public class CustomerListTest 
{

@Test
public void viewCustomer() throws ClassNotFoundException, SQLException
{
Customer c=new Customer();


CustomerlistDaoImpl cdi=new CustomerlistDaoImpl();

ArrayList<Customer> al=cdi.listCustomer();
Iterator itr=al.iterator();
c=al.get(1);
/*while(itr.hasNext())
{

	
assertNotNull(al);

}*/
assertEquals("mysore", c.getAddress());
System.out.println("successfull");
}
}