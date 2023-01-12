package com.ventas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String surname;
	private Long phoneNum;
	
	public Client(Long id, String name, String surname, Long phoneNum) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.phoneNum = phoneNum;
	}

	public Client(String name, String surname, Long phoneNum) {
		super();
		this.name = name;
		this.surname = surname;
		this.phoneNum = phoneNum;
	}

	public Client() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(Long phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "Client [id_client=" + id + ", name=" + name + "]";
	}
	
	
	
}
