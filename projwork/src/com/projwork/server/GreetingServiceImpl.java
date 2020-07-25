package com.projwork.server;

import com.projwork.client.GreetingService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public  class GreetingServiceImpl extends RemoteServiceServlet implements GreetingService {

	Connection con=null;
	Statement st=null;
	
	public void init() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wholesaler","root","");
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		try {
	st=con.createStatement();
		} 
		catch(SQLException e) {
			e.printStackTrace();
		}
		}

	@Override
	public String insertquantity(String product, String quantity, String price) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		String ss="no";
		int k=0;
		init();
		try {
			k=st.executeUpdate("insert into cart(productname,qty,price) values ('"+product+"','"+quantity+"','"+price+"')");
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		if(k!=0)
			
			ss="Submitted";
		return ss;	
	}

	@Override
	public String FetchDove() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		ResultSet rs=null;
		String s1="";
		try {
			rs=st.executeQuery("select * from admin where brand='dove'");
			while(rs.next()) {
				s1=s1+rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+"@";
			}
		}catch(SQLException e) {
		}
		
		return s1;
		
	}

	@Override
	public String FetchLoreal() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		ResultSet rs=null;
		String s1="";
		try {
			rs=st.executeQuery("select * from admin where brand='loreal'");
			while(rs.next()) {
				s1=s1+rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+"@";
			}
		}catch(SQLException e) {
		}
		
		return s1;
		
	}

	@Override
	public String FetchSunsilk() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		ResultSet rs=null;
		String s1="";
		try {
			rs=st.executeQuery("select * from admin where brand='sunsilk'");
			while(rs.next()) {
				s1=s1+rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+"@";
			}
		}catch(SQLException e) {
		}
		
		return s1;
		
	}
	@Override
	public String FetchTreseme() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		ResultSet rs=null;
		String s1="";
		try {
			rs=st.executeQuery("select * from admin where brand='treseme'");
			while(rs.next()) {
				s1=s1+rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+"@";
			}
		}catch(SQLException e) {
		}
		
		return s1;
		
	}

	@Override
	public String fetchgotocart() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		ResultSet rs=null;
		String s1="";
		try {
			rs=st.executeQuery("Select * from cart");
			while(rs.next()) {
				s1=s1+rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+"@";
				
			}
		}
		catch(SQLException e) {
		}
		return s1;
	}

	@Override
	public String insertorder(String name, String address, String city, String state, String phone1, String phone2,
			String email) {
		// TODO Auto-generated method stub
		String s1="no"; 
		int k=0;
		init();
		try {
			k=st.executeUpdate("INSERT INTO orderclient VALUES ('"+name+"','"+address+"','"+city+"','"+state+"','"+phone1+"','"+phone2+"','"+email+"')"); 
			s1="done";
		}catch (SQLException e) {
			s1=e.getMessage();
		}

		if(k!=0)
			s1="yes";

		return s1;
	}

	@Override
	public String Check(String username, String password) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		ResultSet rs=null;
		String s1="Not";
		init();
		try {
			rs=st.executeQuery("select * from login where username= '"+username+"'and password= '"+password+"' ");
			if(rs.next())
			{
				s1="Done";
			}
		}catch (SQLException e) {
			System.out.println("not");
		}
		return s1;
	}

	@Override
	public String insertadmin(String productname, String qty, String price, String brand) {
		// TODO Auto-generated method stub
		String s1="no";
		int k=0;
		init();
		try {
			k=st.executeUpdate("INSERT INTO admin VALUES ('"+productname+"','"+qty+"','"+price+"','"+brand+"')"); 
		
		}catch (SQLException e) {
			e.getMessage();
		}
		if(k!=0)
		{
			s1="yes";
		}
		return s1;
	}

	@Override
	public String clientreqfetch() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		ResultSet rs=null;
		String s1="";
		try{
			rs=st.executeQuery("select * from orderclient JOIN cart");
			while(rs.next())
			{
				s1 = s1+rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getString(5)+","+rs.getString(6)+","+rs.getString(7)+","+rs.getString(8)+","+rs.getString(9)+","+rs.getString(10)+","+rs.getString(11)+","+rs.getString(12)+"&";
			}
		}catch(SQLException e){
		}	
		return s1;
	}

	@Override
	public String billingfetch() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		String s1 = "";
		int i = 0;
		try {
			rs = st.executeQuery("Select * from bill");
			if (rs.next()) {
				s1 = s1 + rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4) + ","
						+ rs.getString(5) + "," + rs.getString(6) + "," + rs.getString(7) + "," + rs.getString(8) + "@";
				i++;
			}
		} catch (SQLException e) {
		}
		return s1;	}

	@Override
	public String insertbill(int discount, int total) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		String ss="Not";
		init();
		int k=0;
		try{
			k=st.executeUpdate("UPDATE `bill` SET `discount`="+discount+",`amount`="+total+" WHERE Orderid=1");
			
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		if(k!=0)
			ss="yes";
		
		return ss;
	}
	}
