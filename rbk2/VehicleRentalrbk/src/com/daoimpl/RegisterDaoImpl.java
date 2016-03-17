package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dao.RegisterDao;
import com.db.DBHelper;

public class RegisterDaoImpl implements RegisterDao {

	int row;
	@Override
	public int registerDao(String custid, String password, String fname,
			String lname, String phone, String email, String address) {
		// TODO Auto-generated method stub
		Connection con=null;
		
		try {
			con=DBHelper.connect();
			
			String sql="insert into customer359166 values(?,?,?,?,?,?,?)";
			String sql2="insert into login359166 values(?,?,2)";
			//String sql3=""
			
			PreparedStatement ps=con.prepareStatement(sql);
			PreparedStatement ps2=con.prepareStatement(sql2);
			
			ps.setString(1, custid);
			ps.setString(2, password);
			ps.setString(3, fname);
			ps.setString(4, lname);
			ps.setString(5, phone);
			ps.setString(6, email);
			ps.setString(7, address);
			
			ps2.setString(1, custid);
			ps2.setString(2,password);
			
			row=ps.executeUpdate();
			
			ps2.executeUpdate();
			
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
