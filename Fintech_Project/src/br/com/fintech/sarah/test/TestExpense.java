package br.com.fintech.sarah.test;

import java.util.Calendar;

import br.com.fintech.sarah.dao.ExpenseDAO;
import br.com.fintech.sarah.historic.Expense;

public class TestExpense {
	public static void main(String[] args) {
//		ExpenseDAO dao = new ExpenseDAO();
//		Expense expense = new Expense();
//		
//		expense.setName("Ifood");
//		expense.setValue(2.44f);
//		expense.setCategory("gordice");
//		expense.setCreatedAt(Calendar.getInstance());
//		expense.setIdAccount(1);
//		
//		dao.register(expense);		
		 ExpenseDAO dao = new ExpenseDAO();
	        
	        // Cadastrar pelo menos 5 despesas
	        for (int i = 0; i < 5; i++) {
	            Expense expense = new Expense();
	            expense.setName("Despesa " + (i + 1));
	            expense.setValue((float) (Math.random() * 100)); // Valor aleatório entre 0 e 100
	            expense.setCategory("Categoria " + (i + 1));
	            expense.setCreatedAt(Calendar.getInstance());
	            expense.setIdAccount(1);
	            
	            dao.register(expense);
	        }
	}
}
