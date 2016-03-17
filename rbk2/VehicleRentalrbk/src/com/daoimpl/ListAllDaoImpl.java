package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Vehicle;
import com.dao.ListAllDao;
import com.db.DBHelper;

public class ListAllDaoImpl implements ListAllDao {

	@Override
	public ArrayList<Vehicle> listAllAvailable() {
		// TODO Auto-generated method stub
		Connection con=null;
		ArrayList<Vehicle> ar=new ArrayList<Vehicle>();
		try {
			con=DBHelper.connect();
			String sql="select * from vehicle2359166";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				Vehicle v=new Vehicle();
				v.setvId(rs.getString(1));
				v.setVehicleName(rs.getString(2));
				v.setChassyNo(rs.getString(3));
				v.setRegNo(rs.getString(4));
				v.setPermit(rs.getString(5));
				v.setvType(rs.getString(6));
				v.setvClass(rs.getString(7));
				v.sethType(rs.getString(8));
				v.setFuelType(rs.getString(9));
				v.setManCompany(rs.getString(10));
				v.setVendor(rs.getString(11));
				v.setInsPolicy(rs.getString(12));
				v.setSeats(rs.getInt(13));
				v.setAvailability(rs.getInt(14));
				v.setPayment_id(rs.getString(15));
				
				
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
