package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name="projectcompetitors")
public class ProjectCompetitors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int competitorid;
	private String competitorname;
	private String picurl;
	public ProjectCompetitors(int competitorid, String competitorname, String picurl) {
		super();
		this.competitorid = competitorid;
		this.competitorname = competitorname;
		this.picurl = picurl;
	}
	public ProjectCompetitors() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCompetitorid() {
		return competitorid;
	}
	public void setCompetitorid(int competitorid) {
		this.competitorid = competitorid;
	}
	public String getCompetitorname() {
		return competitorname;
	}
	public void setCompetitorname(String competitorname) {
		this.competitorname = competitorname;
	}
	public String getPicurl() {
		return picurl;
	}
	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}
}
