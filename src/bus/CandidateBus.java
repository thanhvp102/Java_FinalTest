package bus;

import java.sql.SQLException;
import java.util.Scanner;

import model.Experience_Candidate;
import model.Fresher_Candidate;
import model.Intern_candidate;
import dao.CadidateDao;

public class CandidateBus {
	public void Show() throws SQLException {
		CadidateDao cadidateDao = new CadidateDao();
		cadidateDao.show();
	}

	public void input() throws SQLException {
		CadidateDao cadidateDao = new CadidateDao();
		Scanner sc = new Scanner(System.in);
		System.out
		.println("Input 0:experience candidate 1:fresher candidate 2:intern candidate");
		while (!sc.hasNextInt()) {
			System.out
					.println("Input 0:experience candidate 1:fresher candidate 2:intern candidate");
			sc.next();
		}
		int choose = Integer.parseInt(sc.nextLine());

		switch (choose) {
		case 0:
			System.out.println("Input experience candidate--------------------");
			Experience_Candidate ec = new Experience_Candidate();
			ec.inpuṭ̣̣̣̣̣̣̣̣̣̣();
			ec.setCandidateType(0);
			cadidateDao.insertEC(ec);
			break;
		case 1:
			System.out.println("Input fresher candidate--------------------");
			Fresher_Candidate fc = new Fresher_Candidate();
			fc.inpuṭ̣̣̣̣̣̣̣̣̣̣();
			fc.setCandidateType(1);
			cadidateDao.insertFC(fc);
			break;
		case 2:
			System.out.println("Input intern candidate--------------------");
			Intern_candidate ic = new Intern_candidate();
			ic.inpuṭ̣̣̣̣̣̣̣̣̣̣();
			ic.setCandidateType(2);
			cadidateDao.insertIC(ic);
			break;
		default:
			break;

		}
		cadidateDao.show();

	}
}
