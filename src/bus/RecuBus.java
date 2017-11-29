package bus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.CadidateDao;
import dao.RecruitmentDao;
import util.ConnectionUtil;
import util.SqlQuery;

public class RecuBus {
	public void updateRecu(int id) throws SQLException {
		String fC = null;
		CadidateDao cadidateDao = new CadidateDao();
		ResultSet rs = cadidateDao.select_type(id);
		while (rs.next()) {
			fC = rs.getString(1);
		}
		if (fC.equals("0")) {
			fC = "A";
		} else if (fC.equals("1")) {
			fC = "B";
		} else if (fC.equals("2")) {
			fC = "C";
		}
		fType(fC);
		RecruitmentDao recruitmentDao=new RecruitmentDao();
		recruitmentDao.show();
	}

	public void fType(String fC) throws SQLException {

		Connection conn = DriverManager.getConnection(ConnectionUtil.dbUrl);
		PreparedStatement pre = conn
				.prepareStatement(SqlQuery.UPDATE_CADIDATE_RECU);
		pre.setString(1, fC);
		int i = pre.executeUpdate();
		if (i > 0) {
			System.out.println("Update success");
		}else
		System.out.println("Update fail");

	}

}
