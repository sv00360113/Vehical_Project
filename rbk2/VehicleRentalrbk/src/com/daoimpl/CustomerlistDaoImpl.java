package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Customer;
import com.dao.CustomerlistDao;
import com.db.DBHelper;

public class CustomerlistDaoImpl implements CustomerlistDao {

	@Override
	public ArrayList<Customer> listCustomer() {
		// TODO Auto-generated method stub
		ArrayList<Customer> ar=new ArrayList<Customer>();
		Connection con=null;
		try {
			con=DBHelper.connect();
			String sql="select * from customer359166";
			
			PreparedStatement ps=con.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				Customer c=new Customer();
				c.setcId(rs.getString(1));
				c.setFname(rs.getString(3));
				c.setLname(rs.getString(4));
				c.setPhone(rs.getString(5));
				c.setEmail(rs.getString(6));
				c.setAddress(rs.getString(7));
				ar.add(c);
				
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
