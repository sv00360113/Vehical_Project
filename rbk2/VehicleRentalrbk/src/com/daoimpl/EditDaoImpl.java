package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dao.EditDao;
import com.db.DBHelper;

public class EditDaoImpl implements EditDao {

	@Override
	public int edit(String vid, String name, String chassy, String regno,
			String permit, String vtype, String clss, String htype,
			String fueltype, String man, String vendor, String ins, int seat,
			int ava, String payment) {
		// TODO Auto-generated method stub
		Connection con=null;
		int row=0;
		try {
			con=DBHelper.connect();
			
			String sql="update vehicle2359166 set vehicle_name=?,chassyno=?,regno=?,permit=?,vtype=?,class=?,htype=?,fueltype=?,manufacture=?,vendor=?,insurance_no=?,seats=?,availability=?,payment_id=? where vid=?";
			
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(15,vid);
			ps.setString(1, name);
			ps.setString(2, chassy);
			ps.setString(3, regno);
			ps.setString(4, permit);
			ps.setString(5, vtype);
			ps.setString(6, clss);
			ps.setString(7, htype);
			ps.setString(8, fueltype);
			ps.setString(9, man);
			ps.setString(10, vendor);
			ps.setString(11, ins);
			ps.setInt(12, seat);
			ps.setInt(13, ava);
			ps.setString(14, payment);
			
			 row=ps.executeUpdate();
			
			
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
		return row;
	}

}
