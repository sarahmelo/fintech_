package br.com.fintech.sarah.coin;

import java.util.ArrayList;

public class Coin {
	protected String name;
	protected int id;
	protected double price;
	protected ArrayList<Double> hitoricPrice;
	
	public Coin(
		String name,
		int id,
		double price,
		ArrayList<Double> historicPrice
	) {
		this.name = name;
		this.id = id;
		this.price = price;
		this.hitoricPrice = historicPrice;
	}
}