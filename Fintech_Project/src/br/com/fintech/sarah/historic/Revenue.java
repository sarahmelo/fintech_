package br.com.fintech.sarah.historic;

import java.util.Calendar;

public class Revenue {
	private int id;
	private String name;
	private float value;
	private String category;
	private Calendar createdAt;
	private Calendar deletedAt;
	private int idAccount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Calendar getDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(Calendar deletedAt) {
		this.deletedAt = deletedAt;
	}
	public Calendar getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Calendar createdAt) {
		this.createdAt = createdAt;
	}
	public int getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}
}
