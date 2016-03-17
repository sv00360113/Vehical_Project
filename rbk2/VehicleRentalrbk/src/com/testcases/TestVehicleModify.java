package com.testcases;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;




import com.bean.Vehicle;
import com.daoimpl.ListAllDaoImpl;



public class TestVehicleModify 
{

@Test
public void viewPayment() throws ClassNotFoundException, SQLException
{
Vehicle v=new Vehicle();


ListAllDaoImpl mdi=new ListAllDaoImpl();

ArrayList<Vehicle> al=mdi.listAllAvailable();
Iterator itr=al.iterator();
/*while(itr.hasNext())
{

	
assertNotNull(al);

}*/
v=al.get(0);
assertEquals("discover", v.getVehicleName());
System.out.println("successfull");
}
}
