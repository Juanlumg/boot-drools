package com.bankia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Product {

	@Id
	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	// @SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name =
	// "CUST_SEQ")
	private int id;
	@Column()
	private String tipo;
	@Column()
	private int discount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

}