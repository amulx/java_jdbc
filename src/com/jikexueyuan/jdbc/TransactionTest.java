package com.jikexueyuan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionTest {
	
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void insertUserData(Connection conn) throws SQLException{
		
		String sql = "insert into gift(name,description) values('xinxin','ganzhoulix')";
		Statement st = conn.createStatement();
		int count = st.executeUpdate(sql);
		System.out.println(count);

	}
	
	public static void insertAddressData(Connection conn) throws SQLException{
		
		String sql = "insert into gift_ll(gift_id,address) values(1,'ganzhoulix','sdsdf')";
		Statement st = conn.createStatement();
		int count = st.executeUpdate(sql);
		System.out.println(count);
		
	}
	
	public static void main(String[] args) {
		Connection conn = null;

		try {
			conn = getConnection();
			conn.setAutoCommit(false);//禁止事务自动提交
			
			insertUserData(conn);
			insertAddressData(conn);
			
			conn.commit();
		} catch (SQLException e) {
			System.out.println("===============捕获到sql异常============");
			e.printStackTrace();
			
			try {
				conn.rollback();
				System.out.println("==============事务回滚成功===================");
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
		}finally{
			try {
				if(conn != null){
					conn.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			
		}
		
	}
}
