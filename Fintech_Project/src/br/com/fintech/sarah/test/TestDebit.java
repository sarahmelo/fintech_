package br.com.fintech.sarah.test;

import java.util.Calendar;

import br.com.fintech.sarah.dao.DebitDAO;
import br.com.fintech.sarah.historic.Debit;

public class TestDebit {
	public static void main(String[] args) {
		DebitDAO dao = new DebitDAO();
		Debit debit = new Debit();
		
		debit.setName("Ifood");
		debit.setValue(2.44f);
		debit.setCategory("gordice");
		debit.setCreatedAt(Calendar.getInstance());
		debit.setIdAccount(1);
		
		dao.register(debit);
	}
}
