package com.example.eco_eat;

public class data0_o {
	String name;
	double carbon_emition_per_gramm;
	public data0_o(String n, double d) {
		name = n;
		carbon_emition_per_gramm = d;
	}
	public boolean compare_to(data0_o d) {
		if (carbon_emition_per_gramm < d.carbon_emition_per_gramm) {
			return false;
		}
		return true;
	}
}
