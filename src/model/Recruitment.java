package model;

public class Recruitment {
	private int recuitmentCode;
	private int position;
	private String recuitmentPackage;
	public String getRecuitmentPackage() {
		return recuitmentPackage;
	}
	public void setRecuitmentPackage(String recuitmentPackage) {
		this.recuitmentPackage = recuitmentPackage;
	}
	public int getRecuitmentCode() {
		return recuitmentCode;
	}
	public void setRecuitmentCode(int recuitmentCode) {
		this.recuitmentCode = recuitmentCode;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public Recruitment(int recuitmentCode, int position, String recuitmentPackage) {
		super();
		this.recuitmentCode = recuitmentCode;
		this.position = position;
		this.recuitmentPackage = recuitmentPackage;
	}
	
}
