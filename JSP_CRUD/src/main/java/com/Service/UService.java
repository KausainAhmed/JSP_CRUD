package com.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Bean.Student;
import com.Dao.StudentDao;

public class UService {
	public static int save(Student u) throws ClassNotFoundException, SQLException {
		int found = 0;

		Connection conn = StudentDao.conn();
		PreparedStatement smt = conn.prepareStatement("insert into Jcrud(id,name,city) values(?,?,?)");
		smt.setString(1, u.getId());
		smt.setString(2, u.getName());
		smt.setString(3, u.getCity());
		found = smt.executeUpdate();
		return found;
	}

	public static int delete(Student u) throws ClassNotFoundException, SQLException {
		Connection conn = StudentDao.conn();
		PreparedStatement ps = conn.prepareStatement("delete from jcrud where id=?");
		ps.setString(1, u.getId());
		ps.executeUpdate();
		return 0;
	}

	public static int update(Student u) throws ClassNotFoundException, SQLException {
		Connection conn = StudentDao.conn();
		PreparedStatement ps = conn.prepareStatement("update from jcrud set name=? , city=? wehere id=?");
		ps.setString(1, u.getId());
		ps.setString(2, u.getName());
		ps.setString(3, u.getCity());
		ps.executeUpdate();
		return 0;
	}
}