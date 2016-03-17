package com.testcases;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import com.bean.Login;
import com.daoimpl.LoginDaoImpl;
import com.daoimpl.LoginDaoImplementation;

public class LoginTest 
{
String userid="01";
String password="spoo";

@Test
public void validate() throws ClassNotFoundException, SQLException
{
Login l=new Login();
l.setUserid(userid);
l.setPassword(password);

LoginDaoImplementation ldi=new LoginDaoImplementation();

int usertype=ldi.validateUser(l);
assertEquals(2,usertype);

System.out.println("successfull");
}
}
