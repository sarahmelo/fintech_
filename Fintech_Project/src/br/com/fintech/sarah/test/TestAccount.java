package br.com.fintech.sarah.test;

import java.util.Calendar;

import br.com.fintech.sarah.account.Account;
import br.com.fintech.sarah.dao.AccountDAO;

public class TestAccount {
	public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();
		Account account = new Account();
		
		account.setEmail("sarinhaa@mailinator.com");
		account.setPassword("123@sms");
		account.setCreatedAt(Calendar.getInstance());
		account.setIdUser(1);
		
		dao.registerAccount(account);		
	}
}
