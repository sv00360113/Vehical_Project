package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dao.AddDao;
import com.db.DBHelper;

public class AddDaoImpl implements AddDao {

	@Override
	public int addDao(String vid, String name, String chassy, String regno,
			String permit, String vtype, String clss, String htype,
			String fueltype, String man, String vendor, String ins, int seat,
			int ava, String payment) {
		// TODO Auto-generated method stub
		Connection con=null;
		int row=0;
		try {
			con=DBHelper.connect();
			
			String sql="insert into vehicle2359166 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,vid);
			ps.setString(2, name);
			ps.setString(3, chassy);
			ps.setString(4, regno);
			ps.setString(5, permit);
			ps.setString(6, vtype);
			ps.setString(7, clss);
			ps.setString(8, htype);
			ps.setString(9, fueltype);
			ps.setString(10, man);
			ps.setString(11, vendor);
			ps.setString(12, ins);
			ps.setInt(13, seat);
			ps.setInt(14, ava);
			ps.setString(15, payment);
			
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
