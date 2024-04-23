package br.com.fintech.sarah.utils;

public abstract class AbstractHistoric<T> {
	public abstract void createItem(T item);
	
	public abstract void removeItem(int index);
	
	public abstract void editItem(T item);
	
	public abstract void getItem(T item);
}
