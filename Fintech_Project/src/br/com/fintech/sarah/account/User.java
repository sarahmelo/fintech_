package br.com.fintech.sarah.account;

import java.util.Calendar;

public class User {
	private String name;
	private Calendar birthdate;
	private String gender;
	private String cpf;
	
	public User() {
		//
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Calendar date) {
		this.birthdate = date;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
