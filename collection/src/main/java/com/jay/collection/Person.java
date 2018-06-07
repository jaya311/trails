package com.jay.collection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person 
{
	@Id
	@Column(name="Person_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pid_gen")
	private int pid;
	
	@Column(name="Person_Name")
	private String pname;
	
	@Column(name="Gender")
	private char pgender;
	
	@ManyToMany(mappedBy="per")
	private List<Mobile> mob = new ArrayList<Mobile>();
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public char getPgender() {
		return pgender;
	}
	public void setPgender(char pgender) {
		this.pgender = pgender;
	}
	public List<Mobile> getMob() {
		return mob;
	}
	public void setMob(List<Mobile> mob) {
		this.mob = mob;
	}
	
	
}
