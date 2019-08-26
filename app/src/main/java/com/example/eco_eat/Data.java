package com.example.eco_eat;
import java.util.ArrayList;

public class Data {
    public String product_name;
    public ArrayList<String> category = new ArrayList<>();
    public ArrayList<String> real_category = new ArrayList<>();
    public String key;
    public String quantity;
    public Data(String k, String q, String p){
        product_name = p;
        key = k;
        quantity = q;
    }
    public Data add_c(String s){
        category.add(s);
        return this;
    }
    public Data add_rc(String s){
        real_category.add(s);
        return this;
    }
    public boolean compare_to(Data d) {
    	if (key.compareTo(d.key) > 0) {
    		return true;
    	}
    	return false;
    }
    public boolean equal_to(Data d){
    	if (key.equals(d.key)) {
    		return true;
    	}
    	return false;
    }
}
