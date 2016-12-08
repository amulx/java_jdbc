package com.jikexueyuan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdate {
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void insert(){
		Connection conn = getConnection();
		try {
			String sql = "insert into gift(name,description) values('xinxin','ganzhoulix')";
			Statement st = conn.createStatement();
			int count = st.executeUpdate(sql);
			System.out.println("想用户表插入了"+count+"条记录");
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void update(){
		Connection conn = getConnection();
		try {
			String sql = "update gift set status=1 where name='xinxin'";
			Statement st = conn.createStatement();
			int count = st.executeUpdate(sql);
			System.out.println("更新了gift表"+count+"条数据");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void delete(){
		Connection conn = getConnection();
		try {
			String sql = "delete from gift where name = 'xinxin'";
			Statement st = conn.createStatement();
			int count = st.executeUpdate(sql);
			System.out.println("删除了"+count+"条数据");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		insert();
//		update();
		delete();
	}
}
