package model;

import java.util.Scanner;

public class Intern_candidate extends Candidate{
	private String major,semester,university;
	public Intern_candidate() {
	}
	public Intern_candidate(String firstName, String lastName, String birthDate,
			String address, String phone, String email,int candidateType,
			String major, String semester, String university) {
		super(firstName, lastName, birthDate, address, phone, email,candidateType);
		this.major = major;
		this.semester = semester;
		this.university = university;
	}
	@Override
	public void inpuṭ̣̣̣̣̣̣̣̣̣̣() {
		// TODO Auto-generated method stub
		super.inpuṭ̣̣̣̣̣̣̣̣̣̣();
		Scanner sc=new Scanner(System.in);
		System.out.println("Input major");
		setMajor(sc.nextLine());
		System.out.println("Input semester");
		setSemester(sc.nextLine());
		System.out.println("Input university");
		setUniversity(sc.nextLine());
	}
	@Override
	public String toString() {
		return "Intern_candidate ["+super.toString()+"+major=" + major + ", semester=" + semester
				+ ", university=" + university + "]";
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}
	
}
