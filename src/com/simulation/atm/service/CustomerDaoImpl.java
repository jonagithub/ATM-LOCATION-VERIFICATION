package com.simulation.atm.service; 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;
import com.simulation.atm.db.DB;
import com.simulation.atm.model.Customer;

public class CustomerDaoImpl implements CustomerDao{
		Connection con = null;
		public CustomerDaoImpl() {
			con = DB.getDbcon();
		}
		
	@Override
	public boolean addCustomer(Customer c) {
		String sql = "insert into customer(accountnumber,name,address,numberoftransaction)values(?,?,?,?)";
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, c.getAccountnumber());
			pstm.setString(2, c.getName());
			pstm.setString(3, c.getAddress());
			pstm.setInt(4, c.getNumberoftransaction());
			pstm.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Customer> getAllInfo(String address) {
		String sql = "select * from customer where address = '"+address+"' ";
		
		List<Customer> slist = new ArrayList<>();
		try {
			Statement stm=(Statement) con.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next())
			{
				Customer c= new Customer();
				c.setAccountnumber(rs.getInt("accountnumber"));
				c.setName(rs.getString("name"));
				c.setAddress(rs.getString("address"));
				c.setNumberoftransaction(rs.getInt("numberoftransaction"));
				slist.add(c);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return slist ;
	}

	@Override
	public Customer countCustomer(String address) {
		Customer c = new Customer();
		String sql = "select address, count(*) from customer group by address having address = '"+address+"'";
		try {
			Statement stm  = (Statement) con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if(rs.next()) {
				c.setCount(rs.getInt("count(*)"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return c;
	}

	@Override
	public Customer totaltransaction(String address) {
		Customer c =new Customer();
		String sql = "select address,sum(numberoftransaction) as total from customer group by address having address='"+address+"'";
		try {
			Statement stm = (Statement) con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if(rs.next()) {
				c.setNumberoftransaction(rs.getInt("total"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
		
	}

	@Override
	public List<Customer> getAllInfo() {
		String sql = "select * from customer";
		List<Customer> slist = new ArrayList<>();
		Statement stm;
		try {
			stm = (Statement) con.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next())
			{
				Customer c= new Customer();
				c.setAccountnumber(rs.getInt("accountnumber"));
				c.setName(rs.getString("name"));
				c.setAddress(rs.getString("address"));
				c.setNumberoftransaction(rs.getInt("numberoftransaction"));
				slist.add(c);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return slist;
	}

}
