package model;

import java.text.ParseException;
import java.util.Scanner;

import util.Validate;

abstract class Candidate {
	private String firstName, lastName, birthDate, address, phone, email;
	private int candidateType;
	public Candidate() {
	}

	public Candidate(String firstName, String lastName, String birthDate,
			String address, String phone, String email,int candidateType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.candidateType=candidateType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getCandidateType() {
		return candidateType;
	}

	public void setCandidateType(int candidateType) {
		this.candidateType = candidateType;
	}

	/**
	 * input candicate
	 * 
	 * @throws ParseException
	 */
	public void inpuṭ̣̣̣̣̣̣̣̣̣̣() {
		Scanner sc = new Scanner(System.in);
		Validate v = new Validate();
		System.out.println("Input first name");
		setFirstName(sc.nextLine());
		System.out.println("Input last name");
		setLastName(sc.nextLine());
		while(true){
			System.out.println("Input birth date ");
			setBirthDate(sc.nextLine());
			if(getBirthDate().length()==4){
				break;
			}
		}
		
		System.out.println("Input address");
		setAddress(sc.nextLine());
		while (true) {
			System.out.println("Input phone");
			setPhone(sc.nextLine());
			if (v.vPhone(getPhone()) && getPhone().length() > 6) {
				break;
			} else
				System.out.println("Input phone again ");
		}

		while (true) {
			System.out.println("Input email");
			setEmail(sc.nextLine());
			if (v.vEmail(getEmail())) {
				break;
			} else
				System.out.println("Input email again ");
		}

	}
	
	@Override
	public String toString() {
		return "Candicate [firstName=" + firstName + ", lastName=" + lastName
				+ ", birthDate=" + birthDate + ", address=" + address + ", phone="
				+ phone + ", email=" + email +"candidate type "+candidateType+ "]";
	}

}
