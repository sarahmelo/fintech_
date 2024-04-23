package br.com.fintech.sarah.coin;

import java.util.ArrayList;

import br.com.fintech.sarah.utils.AbstractHistoric;

public class Historic<T> extends AbstractHistoric<T> {
	public ArrayList<T> historic = new ArrayList<T>();
		
	public Object getHistoricPriceCoin() {
		return null;
	}
	
	public Historic() {
		//
	}
	
	@Override
	public void createItem(T item) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void editItem(T item) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void removeItem(int index) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void getItem(T item) {
		// TODO Auto-generated method stub
	}
}
