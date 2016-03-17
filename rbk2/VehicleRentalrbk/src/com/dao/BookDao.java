package com.dao;

import java.sql.ResultSet;
import java.util.Date;

public interface BookDao {

	public int bookDao(String userid,String vid,String days,String fromdate,String todate,int distance,int amount);
}
