package br.com.fintech.sarah.historic;

import java.util.ArrayList;

import br.com.fintech.sarah.utils.AbstractHistoric;

public class Historic<T> extends AbstractHistoric<T> {
	public ArrayList<T> list = new ArrayList<T>();
	
	public Historic() {
		//
	}
	
	@Override
	public void createItem(T item) {
		this.list.add(item);
	}
	
	@Override
	public void removeItem(int index) {
		this.list.remove(index);
	}
	
	@Override
	public void editItem(T item) {
		this.list.add(this.list.indexOf(item), item); 
	}
	
	@Override
	public void getItem(T item) {
		this.list.indexOf(item);
	}
}
