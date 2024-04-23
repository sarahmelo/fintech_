package br.com.fintech.sarah.investment;

import java.util.Calendar;

public class Investment {
	private int id;
	private String name;
	private Float quota;
	private Float quantityPurchased;
	private Calendar createdAt;
	private Calendar deltedAt;
	private int idAccount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getQuota() {
		return quota;
	}
	public void setQuota(Float quota) {
		this.quota = quota;
	}
	public Float getQuantityPurchased() {
		return quantityPurchased;
	}
	public void setQuantityPurchased(Float quantityPurchased) {
		this.quantityPurchased = quantityPurchased;
	}
	public Calendar getDeltedAt() {
		return deltedAt;
	}
	public void setDeltedAt(Calendar deltedAt) {
		this.deltedAt = deltedAt;
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
