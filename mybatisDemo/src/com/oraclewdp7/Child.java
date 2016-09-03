package com.oraclewdp7;

import java.io.Serializable;
import java.util.List;

public class Child implements Serializable {
	
	private Integer id;
	private String name;
	
	private List<Group> groups;
	
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
	
	public List<Group> getGroups() {
		return groups;
	}
	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}
	@Override
	public String toString() {
		return "Child [id=" + id + ", name=" + name + "]";
	}
}
