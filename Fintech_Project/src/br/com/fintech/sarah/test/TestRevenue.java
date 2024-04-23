package br.com.fintech.sarah.test;

import java.util.Calendar;

import br.com.fintech.sarah.dao.RevenueDAO;
import br.com.fintech.sarah.historic.Revenue;

public class TestRevenue {
	public static void main(String[] args) {
		RevenueDAO dao = new RevenueDAO();
		Revenue revenue = new Revenue();
		
		revenue.setName("Ifood");
		revenue.setValue(2.44f);
		revenue.setCategory("gordice");
		revenue.setCreatedAt(Calendar.getInstance());
		revenue.setIdAccount(1);
		
		dao.register(revenue);
	}
}
