package model;

import java.util.Scanner;

public class Fresher_Candidate extends Candidate {
	private String graduationDate,education;
	private int graduationRank;
	public Fresher_Candidate() {
	}
	public Fresher_Candidate(String firstName, String lastName, String birthDate,
			String address, String phone, String email,int candidateType,
			String graduationDate, int graduationRank, String education) {
		super(firstName, lastName, birthDate, address, phone, email,candidateType);
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
	}

	public String getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}

	

	public int getGraduationRank() {
		return graduationRank;
	}
	public void setGraduationRank(int graduationRank) {
		this.graduationRank = graduationRank;
	}
	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
	@Override
	public void inpuṭ̣̣̣̣̣̣̣̣̣̣() {
		// TODO Auto-generated method stub
		super.inpuṭ̣̣̣̣̣̣̣̣̣̣();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("Input graduation date ");
			setGraduationDate(sc.nextLine());
			if(getGraduationDate().length()==4){
				break;
			}
		}
	
		System.out.println("Input graduation rank 0:Excellent 1:Good 2:Fair 3:Poor");
		while(!sc.hasNextInt()) {
			System.out.println("Input graduation rank 0:Excellent 1:Good 2:Fair 3:Poor");
			sc.next();
		}
		setGraduationRank(Integer.parseInt(sc.nextLine()));
		System.out.println("Input education");
		setEducation(sc.nextLine());;
	}
	public String fSetGraduationRank(){
		String fGraduationRank=null;
		if(getGraduationRank()==0){
			fGraduationRank="Exellent";
		}else if(getGraduationRank()==1){
			fGraduationRank="Good";
		}else if(getGraduationRank()==2){
			fGraduationRank="Fair";
		}else if(getGraduationRank()==4){
			fGraduationRank="Poor";
		}
		return fGraduationRank;
	}
	@Override
	public String toString() {
		return "Fresher_Candicate ["+super.toString()+"+graduationDate=" + graduationDate
				+ ", graduationRank=" + fSetGraduationRank() + ", education=" + education
				+ "]";
	}
	
	
}
