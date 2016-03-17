/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.daoimpl;

import com.bean.Login;
import com.dao.LoginDao;
import com.db.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DR100623
 */
public class LoginDaoImplementation implements LoginDao {
public int validateUser( Login Login) throws ClassNotFoundException, SQLException{
        int usertype = 0;
        ResultSet rs=null;
        Connection con = DBHelper.connect();
        PreparedStatement psmt = con.prepareStatement("select * from login359166 where userid=? and password=?");
      //String username=Login.getUserName();
      //String password=Login.getPassword();
      //psmt.setString(1,username);
      //psmt.setString(2,password);
         psmt.setString(1, Login.getUserid());
        psmt.setString(2, Login.getPassword());
        System.out.println(Login.getPassword());
        
        try{
        rs = psmt.executeQuery();
        
        if(rs.next()){
            usertype=rs.getInt("usertype");
        }
        else{
            usertype = 0;
        }
        
       
    }catch(Exception e){
    	System.out.println(e);
    }
        return usertype;    
}

@Override
public ArrayList<Login> loginDao(String userid, String password) {
	// TODO Auto-generated method stub
	return null;
}



}
