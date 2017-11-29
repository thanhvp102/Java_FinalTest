package view;

import java.sql.SQLException;
import java.util.Scanner;

import bus.CandidateBus;
import bus.RecuBus;

public class Main {
public static void main(String[] args) throws SQLException {
	CandidateBus candidateBus=new CandidateBus();
	candidateBus.Show();
	System.out.println("input number !0 1 2 exit input");
	candidateBus.input();
	Scanner sc=new Scanner(System.in);
	System.out.println("Input id");
	int id=Integer.parseInt(sc.nextLine());
	RecuBus re=new RecuBus();
	re.updateRecu(id);
}
}
