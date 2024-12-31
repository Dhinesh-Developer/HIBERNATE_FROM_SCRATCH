package com.hib.pratice;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Project")
public class ProjectEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pId")
	private int pId;
	@Column(name="pName")
	private String pName;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public ProjectEntity(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	@Override
	public String toString() {
		return "ProjectEntity [pId=" + pId + ", pName=" + pName + "]";
	}
	
	public ProjectEntity(String pName) {
		super();
		this.pName = pName;
	}
	public List<EmployeeEntity> getEmployees() {
		return Employees;
	}
	public void setEmployees(List<EmployeeEntity> employees) {
		Employees = employees;
	}
	public ProjectEntity() {
	}
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Employee",joinColumns=@JoinColumn(name="pId"),
	inverseJoinColumns=@JoinColumn(name="eId"))
	private List<EmployeeEntity> Employees;
	public ProjectEntity(int pId, String pName, List<EmployeeEntity> employees) {
		super();
		this.pId = pId;
		this.pName = pName;
		Employees = employees;
	}
	public ProjectEntity(String string, int i) {
		// TODO Auto-generated constructor stub
	}
}
