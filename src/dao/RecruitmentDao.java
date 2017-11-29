package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.ConnectionUtil;
import util.SqlQuery;

public class RecruitmentDao {
	
	public void show() throws SQLException {
		Connection conn = DriverManager.getConnection(ConnectionUtil.dbUrl);
		PreparedStatement pre = conn.prepareStatement(SqlQuery.SELECT_RECU);
		ResultSet rs = pre.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getString(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.println(rs.getString(4) + "\t");
			System.out.print("\n");
		}
	}
}
