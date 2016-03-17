package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.Login;
import com.dao.LoginDao;
import com.db.DBHelper;

public class LoginDaoImpl implements LoginDao {
	
	@Override
	public ArrayList<Login> loginDao(String userid,String password) {
		// TODO Auto-generated method stub
		Connection con=null;
		ArrayList<Login> ar=new ArrayList<Login>();
		
		try {
			con=DBHelper.connect();
			
			String sql="select * from login359166 where userid=? and password=?";
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,userid);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				Login l=new Login();
				l.setUserid(rs.getString(1));
				l.setPassword(rs.getString(2));
				l.setUsertype(rs.getInt(3));
				ar.add(l);
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
