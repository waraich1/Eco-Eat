package com.example.eco_eat;


public class classificator {
	heap dataset = new heap();
	String category_name;
	public classificator(String s) {
		category_name = s;
	}
	public classificator insert(String name, String g, String CO2) {
		dataset.insert(new data0_o(name, Double.parseDouble(CO2)/Double.parseDouble(g)));
		return this;
	}
	public String get() {
		return dataset.get();
	}
}
