package com.testcases;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;




import com.bean.VehicleRental;
import com.daoimpl.ListBookingdaoImpl;


public class TestBookingList 
{

@Test
public void viewBookingList() throws ClassNotFoundException, SQLException
{
VehicleRental vr=new VehicleRental();

ListBookingdaoImpl lbdi=new ListBookingdaoImpl();

ArrayList<VehicleRental> al=lbdi.listBooking();
Iterator itr=al.iterator();
/*while(itr.hasNext())
{

	
assertNotNull(al);

}*/
vr=al.get(0);
assertEquals(149, vr.getBookId());
System.out.println("successfull");
}
}