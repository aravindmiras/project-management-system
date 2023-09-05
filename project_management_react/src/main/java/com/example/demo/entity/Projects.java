package com.example.demo.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name="projects")
public class Projects {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projectid;
	private String projectname;
	private String desci;
	private String domain;
	private String deadline;
	private String target;
	private String logo;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="competitor")
	private List<ProjectCompetitors> competitor;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "task")
	private List<Tasks> task;

	public Projects(int projectid, String projectname, String desci, String domain, String deadline, String target,
			String logo, List<ProjectCompetitors> competitor, List<Tasks> task) {
		super();
		this.projectid = projectid;
		this.projectname = projectname;
		this.desci = desci;
		this.domain = domain;
		this.deadline = deadline;
		this.target = target;
		this.logo = logo;
		this.competitor = competitor;
		this.task = task;
	}

	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProjectid() {
		return projectid;
	}

	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getDesci() {
		return desci;
	}

	public void setDesci(String desci) {
		this.desci = desci;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public List<ProjectCompetitors> getCompetitor() {
		return competitor;
	}

	public void setCompetitor(List<ProjectCompetitors> competitor) {
		this.competitor = competitor;
	}

	public List<Tasks> getTask() {
		return task;
	}

	public void setTask(List<Tasks> task) {
		this.task = task;
	}
}
