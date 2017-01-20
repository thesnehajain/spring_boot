package com.howtodoinjava.demo.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.howtodoinjava.demo.model.Customer;

@Component
public class JdbcCustomerDAO implements CustomerDAO
{
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void insert(Customer customer){
		
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
	
	public Customer findByCustomerId(Long custId){
		
		String sql = "SELECT * FROM app_customer WHERE id = ?";
		
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 2);
			Customer customer = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getString("first_name"));
				
			}
			rs.close();
			ps.close();
			return customer;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
	}
}
