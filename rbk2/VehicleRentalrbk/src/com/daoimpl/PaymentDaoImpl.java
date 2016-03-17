package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Payment;
import com.dao.PaymentDao;
import com.db.DBHelper;

public class PaymentDaoImpl implements PaymentDao {

	@Override
	public ArrayList<Payment> paymentDao(String vid) {
		// TODO Auto-generated method stub
		ArrayList<Payment> ar=new ArrayList<Payment>();
		Connection con=null;
		String pid=null;
		try {
			con=DBHelper.connect();
			
			String sql="select * from vehicle2359166 where vid=?";
			String sql2="Select * from payment359166 where payment_id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			PreparedStatement ps2=con.prepareStatement(sql2);
			ps.setString(1, vid);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				pid=rs.getString(15);
			}
			ps2.setString(1, pid);
		
			ResultSet rs2=ps2.executeQuery();
			while(rs2.next())
			{
				Payment p=new Payment();
				p.setPayid(rs2.getString(1));
				p.setRate(rs2.getString(2));
				p.setPermitCost(rs2.getString(3));
				p.setDriverCharge(rs2.getString(4));
				
				ar.add(p);
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
