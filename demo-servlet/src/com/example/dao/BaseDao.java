package com.example.dao;

import com.example.bean.User;

import java.sql.*;

public class BaseDao {
	// Oracle 数据库链接信息
	private String username = "scott";
	private String password = "thinkpad";
	private String url = "jdbc:oracle:thin:@192.168.3.222:1521:orcl";
	private String driver = "oracle.jdbc.driver.OracleDriver";

	// JDBC操作中的对象
	private Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	private Connection getConn() {
		try {
			Class.forName(this.driver);
			this.conn = DriverManager.getConnection(this.url, this.username, this.password);
			if (this.conn != null) {
				System.out.println("数据库连接成功");
			} else {
				System.out.println("数据库连接失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.conn;
	}

	private void closeAll() {
		try {
			if (ps != null) {
				ps.close();
			}
			if (rs != null) {
				rs.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public User queryDB(String name, int num) {
		User user = null;
		Connection connection = this.getConn();
		String querySQL = "select JOB, SAL from SCOTT.EMP where ENAME='" + name + "' and EMPNO=" + num;
		try {
			ps = connection.prepareStatement(querySQL);
			rs = ps.executeQuery();
			while (rs.next()) {
				String jobName = rs.getString("JOB");
				String sal = rs.getString("SAL");
				user = new User(name, num, jobName, sal);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll();
		}
		return user;
	}
}