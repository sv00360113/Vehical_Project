package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Vehicle;
import com.bean.VehicleRental;
import com.dao.ListAllDao;
import com.dao.ListBookingDao;
import com.db.DBHelper;

public class ListBookingdaoImpl implements ListBookingDao {

	@Override
	public ArrayList<VehicleRental> listBooking() {
		// TODO Auto-generated method stub
		ArrayList<VehicleRental> ar=new ArrayList<VehicleRental>();
		
		Connection con=null;
		try {
			con=DBHelper.connect();
			
			String sql="select * from vehiclerental1359166";
			
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				VehicleRental v=new VehicleRental();
				
				v.setCustId(rs.getString(1));
				v.setvId(rs.getString(2));
				v.setBookId(rs.getInt(3));
				v.setDays(rs.getString(4));
				v.setFromDate(rs.getString(5));
				v.setToDate(rs.getString(6));
				v.setDistance(rs.getInt(7));
				v.setAmount(rs.getInt(8));
				ar.add(v);
				
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ar;
	}

	

}
