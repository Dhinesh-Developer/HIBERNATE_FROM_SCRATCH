package com.hib.pratice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sId")
	private int sId;
	@Column(name="sName")
	private String sName;
	@Column(name="sEmail")
	private String sEmail;
	@Column(name="sDesig")
	private String sDesig;
	@Column(name="sSalary")
	private int sSalary;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public String getsDesig() {
		return sDesig;
	}
	public void setsDesig(String sDesig) {
		this.sDesig = sDesig;
	}
	public int getsSalary() {
		return sSalary;
	}
	public StudentEntity(int sId, String sName, String sEmail, String sDesig, int sSalary) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sEmail = sEmail;
		this.sDesig = sDesig;
		this.sSalary = sSalary;
	}
	public void setsSalary(int sSalary) {
		this.sSalary = sSalary;
	}
	public StudentEntity(String sName, String sEmail, String sDesig, int sSalary) {
		super();
		this.sName = sName;
		this.sEmail = sEmail;
		this.sDesig = sDesig;
		this.sSalary = sSalary;
	}
	@Override
	public String toString() {
		return "StudentEntity [sId=" + sId + ", sName=" + sName + ", sEmail=" + sEmail + ", sDesig=" + sDesig
				+ ", sSalary=" + sSalary + "]";
	}
	
	public StudentEntity() {
	}
}
