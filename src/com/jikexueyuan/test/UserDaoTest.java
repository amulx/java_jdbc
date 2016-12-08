package com.jikexueyuan.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.jikexueyuan.dao.UserDao;
import com.jikexueyuan.dao.impl.UserDaoImpl;
import com.jikexueyuan.entity.User;
import com.jikexueyuan.util.ConnectionFactory;

public class UserDaoTest {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = ConnectionFactory.getInstance().makeConnection();
			conn.setAutoCommit(false);
			
			UserDao userDao = new UserDaoImpl();
			User tom = new User();
			tom.setName("Tom");
			tom.setPassword("123456");
			tom.setEmail("tom@gmail.com");
			userDao.save(conn, tom);
			conn.commit();
			System.out.println("插入成功");
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

}
