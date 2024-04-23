package br.com.fintech.sarah.historic;

import java.sql.Timestamp;

public class Item {
	public int id;
	public String name;
	public double value;
	public Timestamp date;
	
	public Item() {}

	public Item(
		int id, 
		String name, 
		double value,
		Timestamp date
	) {
		this.id = id;
		this.name = name;
		this.value = value;
		this.date = date;
	}
}
