package br.com.fintech.sarah.account;

import java.util.Calendar;

import br.com.fintech.sarah.coin.Coin;
import br.com.fintech.sarah.historic.Debit;
import br.com.fintech.sarah.historic.Revenue;
import br.com.fintech.sarah.historic.Expense;
import br.com.fintech.sarah.historic.Historic;

public class Account {
	private int id;
	private Calendar createdAt;
	private Calendar deletedAt;
	private String email;
	private String password;
	private int idUser;
	protected Historic<Debit> debitHistoric = new Historic<Debit>();
	protected Historic<Revenue> deposittHistoric = new Historic<Revenue>();
	protected Historic<Expense> expenseHistoric = new Historic<Expense>();
	protected Historic<Coin> historicCriptoCoin = new Historic<Coin>();

	public Account() {
		//
	}
	
	public <T> Historic<T> getHistoric(Historic<T> historic) {
		return null;
	}
	
	public void login(String token) { }
	
	public void logout() { }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Calendar createdAt) {
		this.createdAt = createdAt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Calendar getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(Calendar deletedAt) {
		this.deletedAt = deletedAt;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
}
