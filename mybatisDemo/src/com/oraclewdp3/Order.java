package com.oraclewdp3;

import java.io.Serializable;

public class Order implements Serializable{
	private Integer id;
	private String no;
	private Integer price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", no=" + no + ", price=" + price + "]";
	}
	Order(){}
	public Order(Integer id, String no, Integer price) {
		this.id = id;
		this.no = no;
		this.price = price;
	}
	
}
