package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Experience_Candidate;
import model.Fresher_Candidate;
import model.Intern_candidate;
import util.ConnectionUtil;
import util.SqlQuery;

public class CadidateDao {
	/**
	 * show dbo.Candicadte
	 */
	public ResultSet select_type(int id)throws SQLException{
		Connection conn = DriverManager.getConnection(ConnectionUtil.dbUrl);
		PreparedStatement pre=conn.prepareStatement(SqlQuery.SELECT_TYPE);
		pre.setInt(1,id );
		ResultSet rs=pre.executeQuery();
		return rs;
	}
	public void show() throws SQLException {
		Connection conn = DriverManager.getConnection(ConnectionUtil.dbUrl);
		Statement statement=conn.createStatement();
		ResultSet rs=statement.executeQuery(SqlQuery.SELECT);
		System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s"
				+ "%-10s %-10s %-10s %-10s %-10s %-10s", "Id", "FirstName", "LastName", "Birth",
				"Address", "Phone", "Email", "Exp", "ProSkill", "GraDate", "GraRank", 
				"EduSchool", "Major", "Semester", "University", "Type"));
		while(rs.next()){
			System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s"
					+ "%-10s %-10s %-10s %-10s %-10s %-10s", rs.getInt(1), rs.getString(2), rs.getString(3)
					, rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getString(9)
					, rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14)
					, rs.getString(15), rs.getInt(16)));
		}
	}
	/**
	 * insert Experience_candidate
	 */
	public boolean insertEC(Experience_Candidate ec)throws SQLException {
		Connection conn=DriverManager.getConnection(ConnectionUtil.dbUrl);
		PreparedStatement preparedStatement=conn.prepareStatement(SqlQuery.INSERT_EC);
		preparedStatement.setString(1, ec.getFirstName());
		preparedStatement.setString(2, ec.getLastName());
		preparedStatement.setString(3, ec.getBirthDate());
		preparedStatement.setString(4, ec.getAddress());
		preparedStatement.setString(5, ec.getPhone());
		preparedStatement.setString(6, ec.getEmail());
		preparedStatement.setInt(7,ec.getExpYear());
		preparedStatement.setString(8, ec.getProSkill());
		preparedStatement.setInt(9, ec.getCandidateType());
		preparedStatement.executeUpdate();
		conn.close();
	
		return true;
	}
	/**
	 * insert Fresher_candidate
	 */
	public boolean insertFC(Fresher_Candidate fc)throws SQLException {
		Connection conn=DriverManager.getConnection(ConnectionUtil.dbUrl);
		PreparedStatement preparedStatement=conn.prepareStatement(SqlQuery.INSERT_FC);
		preparedStatement.setString(1, fc.getFirstName());
		preparedStatement.setString(2, fc.getLastName());
		preparedStatement.setString(3, fc.getBirthDate());
		preparedStatement.setString(4, fc.getAddress());
		preparedStatement.setString(5, fc.getPhone());
		preparedStatement.setString(6, fc.getEmail());
		preparedStatement.setString(7,fc.getGraduationDate());
		preparedStatement.setInt(8, fc.getGraduationRank());
		preparedStatement.setString(9, fc.getEducation());	
		preparedStatement.setInt(10, fc.getCandidateType());
		preparedStatement.executeUpdate();
		conn.close();
		return true;
	}
	/**
	 * insert Intern_candidate
	 */
	public boolean insertIC(Intern_candidate ic)throws SQLException {
		Connection conn=DriverManager.getConnection(ConnectionUtil.dbUrl);
		PreparedStatement preparedStatement=conn.prepareStatement(SqlQuery.INSERT_IC);
		preparedStatement.setString(1, ic.getFirstName());
		preparedStatement.setString(2, ic.getLastName());
		preparedStatement.setString(3, ic.getBirthDate());
		preparedStatement.setString(4, ic.getAddress());
		preparedStatement.setString(5, ic.getPhone());
		preparedStatement.setString(6, ic.getEmail());
		preparedStatement.setString(7,ic.getMajor());
		preparedStatement.setString(8, ic.getSemester());
		preparedStatement.setString(9, ic.getUniversity());	
		preparedStatement.setInt(10, ic.getCandidateType());
		preparedStatement.executeUpdate();
		conn.close();
		return true;
	}
}
