package com.oraclewdp5;

import java.io.Serializable;

public class IDCard implements Serializable{

	private Integer id;
	private Integer no;
	
	private Student Student;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public Student getStudent() {
		return Student;
	}
	public void setStudent(Student student) {
		Student = student;
	}
	@Override
	public String toString() {
		return "IDCard [id=" + id + ", no=" + no + ", Student=" + Student + "]";
	}
}
