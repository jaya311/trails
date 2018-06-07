package com.jay.collection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Mobile 
{
	private String mbrand;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "mid_gen")
	private int mid;
	private String model;
	@ManyToMany
	private List<Person> per= new ArrayList<Person>();
	
	public String getMbrand() {
		return mbrand;
	}
	public void setMbrand(String mbrand) {
		this.mbrand = mbrand;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public List<Person> getPer() {
		return per;
	}
	public void setPer(List<Person> per) {
		this.per = per;
	}
	
}
