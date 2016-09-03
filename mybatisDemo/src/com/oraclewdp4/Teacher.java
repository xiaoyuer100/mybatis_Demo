package com.oraclewdp4;

import java.io.Serializable;

public class Teacher implements Serializable{
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}
	public Teacher() {
	}
	public Teacher(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
