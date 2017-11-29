package model;

import java.util.Scanner;

public class Experience_Candidate extends Candidate {
	private int expYear;
	private String proSkill;
	public Experience_Candidate() {
	}
	public Experience_Candidate(String firstName, String lastName,
			String birthDate, String address, String phone, String email,int candidateType,
			 int expYear, String proSkill) {
		super(firstName, lastName, birthDate, address, phone, email,candidateType);
		this.expYear = expYear;
		this.proSkill = proSkill;
	}
	public int getExpYear() {
		return expYear;
	}
	public void setExpYear(int expYear) {
			this.expYear = expYear;
	
		
	}
	public String getProSkill() {
		return proSkill;
	}
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	@Override
	public void inpuṭ̣̣̣̣̣̣̣̣̣̣() {
		// TODO Auto-generated method stub
		super.inpuṭ̣̣̣̣̣̣̣̣̣̣();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("Input experience year");
			setExpYear(Integer.parseInt(sc.nextLine()));
			if(getExpYear()>0&&getExpYear()<100){
				break;
			}else{
				System.out.println("Input again");
			}
		}
		System.out.println("Input pro skill");
		setProSkill(sc.nextLine());
	
	}
	@Override
	public String toString() {
		return "Experience_Candicate ["+super.toString()+"+expYear=" + expYear + ", proSkill="
				+ proSkill + "]";
	}
	
	
}
