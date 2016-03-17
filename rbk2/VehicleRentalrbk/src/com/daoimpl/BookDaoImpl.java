package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.dao.BookDao;
import com.db.DBHelper;

public class BookDaoImpl implements BookDao {

	@Override
	public int bookDao(String userid, String vid, String days, String fromdate,
			String todate,int distance,int amount) {
		// TODO Auto-generated method stub
		Connection con=null;
		int row=0;
		int rows=0;
		//String date="DD-MON-RR";
		
		try {
			con=DBHelper.connect();
			String sql="insert into vehiclerental1359166 values(?,?,seq_bookid.NEXTVAL,?,?,?,?,?)";
			String sql2="update vehicle2359166 set availability=availability-1 where vid=?";
			String sql3="select availability  from vehicle2359166 where vid=?";
			
			//String sql="insert into vehiclerental359166 values(?,?,?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(sql);
			PreparedStatement ps2=con.prepareStatement(sql2);
			PreparedStatement ps3=con.prepareStatement(sql3);
			
			ps.setString(1, userid);
			ps.setString(2,vid);
			ps.setString(3,days);
			ps.setString(4,fromdate);
			ps.setString(5,todate);
			ps.setInt(6, distance);
			ps.setInt(7, amount);
			
			ps2.setString(1, vid);
			ps3.setString(1, vid);
			//ps.setString(6,todate);
			//ps.setString(7,date);
			ResultSet rs=ps3.executeQuery();
			if(rs.next())
			{
				int ava=rs.getInt(1);
				if(ava>0)
				{
					row=ps.executeUpdate();
					if(row>0)
					{
						rows=ps2.executeUpdate();
					}
				}
				
				else
				{
					row=0;
				}

				
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
		
		return row;
	}

}
