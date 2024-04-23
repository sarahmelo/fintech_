package br.com.fintech.sarah.coin;

import java.util.ArrayList;

public class CriptoCoin extends Coin {
	protected Object data;
	
	CriptoCoin(	
		String name,
		int id,
		double price,
		ArrayList<Double> historicPrice,
		Object data
	) {
		super(name, id, price, historicPrice);
		this.data = data;
	}
}
