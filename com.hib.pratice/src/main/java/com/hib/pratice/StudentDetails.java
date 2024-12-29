package com.hib.pratice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentDetails")
public class StudentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sdId")
	private int sdId;
	@Column(name="sdName")
	private String sdName;
	@Column(name="sdArea")
	private String sdArea;
	
	public StudentDetails() {
	}

	public int getSdId() {
		return sdId;
	}

	public void setSdId(int sdId) {
		this.sdId = sdId;
	}

	public String getSdName() {
		return sdName;
	}

	public void setSdName(String sdName) {
		this.sdName = sdName;
	}

	public String getSdArea() {
		return sdArea;
	}

	public void setSdArea(String sdArea) {
		this.sdArea = sdArea;
	}

	public StudentDetails(int sdId, String sdName, String sdArea) {
		super();
		this.sdId = sdId;
		this.sdName = sdName;
		this.sdArea = sdArea;
	}

	public StudentDetails(String sdName, String sdArea) {
		super();
		this.sdName = sdName;
		this.sdArea = sdArea;
	}

	@Override
	public String toString() {
		return "StudentDetails [sdId=" + sdId + ", sdName=" + sdName + ", sdArea=" + sdArea + "]";
	}
	
	
}
