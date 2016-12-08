package com.jikexueyuan.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jikexueyuan.dao.UserDao;
import com.jikexueyuan.entity.User;

public class UserDaoImpl implements UserDao {
	/**
	 * 保存用户信息
	 */
	@Override
	public void save(Connection conn, User user) throws SQLException {
		PreparedStatement ps = conn.prepareCall("INSERT into tbl_user(name,password,email) values (?,?,?)");
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getEmail());
		ps.execute();
	}

	@Override
	public void update(Connection conn, Long id, User user) throws SQLException {
		// TODO Auto-generated method stub
		String updateSql = "UPDATE tbl_user set name = ?,password = ?, email = ? where id = ?";
		PreparedStatement ps = conn.prepareStatement(updateSql);
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getEmail());
		ps.setLong(4, id);
		ps.execute();
	}

	@Override
	public void delete(Connection conn, User user) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("DELETE from tbl_user where id = ?");
		ps.setLong(1, user.getId());
		ps.execute();
	}

}
