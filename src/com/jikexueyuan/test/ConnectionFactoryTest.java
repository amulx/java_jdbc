package com.jikexueyuan.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.jikexueyuan.util.ConnectionFactory;

public class ConnectionFactoryTest {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory cf = ConnectionFactory.getInstance();
		Connection conn = cf.makeConnection();
		System.out.println(conn.getAutoCommit());
	}

}
