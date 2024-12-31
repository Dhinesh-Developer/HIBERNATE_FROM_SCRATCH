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
@Table(name="Employee")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="eId")
	private int eId;
	@Column(name="eName")
	private String eName;
	@Column(name="eDept")
	private String eDept;
	
	public EmployeeEntity() {
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteDept() {
		return eDept;
	}

	public void seteDept(String eDept) {
		this.eDept = eDept;
	}

	public EmployeeEntity(int eId, String eName, String eDept) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eDept = eDept;
	}

	public EmployeeEntity(String eName, String eDept) {
		super();
		this.eName = eName;
		this.eDept = eDept;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [eId=" + eId + ", eName=" + eName + ", eDept=" + eDept + "]";
	}
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Project",joinColumns=@JoinColumn(name="eId"),
	inverseJoinColumns=@JoinColumn(name="pId"))
	private List<ProjectEntity> projects;

	public EmployeeEntity(int eId, String eName, String eDept, List<ProjectEntity> projects) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eDept = eDept;
		this.projects = projects;
	}

	public List<ProjectEntity> getProjects() {
		return projects;
	}

	public void setProjects(List<ProjectEntity> projects) {
		this.projects = projects;
	}

}
