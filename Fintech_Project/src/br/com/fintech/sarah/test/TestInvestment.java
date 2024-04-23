package br.com.fintech.sarah.test;

import java.util.Calendar;

import br.com.fintech.sarah.dao.CoinInvestmentDAO;
import br.com.fintech.sarah.investment.Investment;

public class TestInvestment {
	public static void main(String[] args) {
		CoinInvestmentDAO dao = new CoinInvestmentDAO();
		Investment investment = new Investment();
		
		investment.setName("Batatinha 123");
		investment.setQuantityPurchased(2.22f);
		investment.setQuota(3.0f);
		investment.setCreatedAt(Calendar.getInstance());
		investment.setIdAccount(1);
		
		dao.registerCoinInvestiment(investment);
	}
}
