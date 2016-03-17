package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Vehicle;
import com.dao.modifyDao;
import com.db.DBHelper;

public class ModifyDaoImpl implements modifyDao {

	@Override
	public ArrayList<Vehicle> modify(String vid) {
		// TODO Auto-generated method stub
		Connection con=null;
		ArrayList<Vehicle> ar=new ArrayList<Vehicle>();
		int i=0;
		try {
			con=DBHelper.connect();
			String sql="select * from vehicle2359166 where vid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, vid);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
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
			else
			{
				i=0;
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
