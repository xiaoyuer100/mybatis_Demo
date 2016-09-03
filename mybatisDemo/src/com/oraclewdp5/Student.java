package com.oraclewdp5;

import java.io.Serializable;

public class Student implements Serializable{

	private Integer id;
	private String name;
	private IDCard idcard;
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
	public IDCard getIdcard() {
		return idcard;
	}
	public void setIdcard(IDCard idcard) {
		this.idcard = idcard;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
