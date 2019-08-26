package com.example.eco_eat;
//import com.example.eco_eat.data0_o;

import java.util.ArrayList;

public class heap {
	public ArrayList<data0_o> Heap = new ArrayList<>();
	
	public heap() {
		Heap.add(new data0_o("min_element", -1111111111));
	}
	
	private int parent(int i) {
		return i/2;
	}
	
	private int left(int i) {
		if (i*2 >= Heap.size()) {
			return 0;
		}
		return i*2;
	}
	
	private int right(int i) {
		if (i*2+1 >= Heap.size()) {
			return 0;
		}
		return i*2+1;
	}
	
	private boolean is_leaf(int i) {
		if (i >= (Heap.size()-1)/2 && i < Heap.size()) {
			return true;
		}
		return false;
	}
	
	private void swap(int l, int r) {
		data0_o tmp;
		tmp = Heap.get(l);
		Heap.set(l, Heap.get(r));
		Heap.set(r, tmp);
	}
	//Sorry for garbage function
	private void heapify(int i) {
		if (!is_leaf(i)) {
			if (Heap.get(i).compare_to(Heap.get(left(i))) ||
				Heap.get(i).compare_to(Heap.get(right(i)))) {
				if (Heap.get(left(i)).compare_to(Heap.get(right(i)))) {
					swap(i, left(i));
					heapify(left(i));
				}
				else {
					swap(i, right(i));
					heapify(right(i));
				}
			}
		}
	}
	
	public void insert(data0_o d) {
		Heap.add(d);
		int c = Heap.size()-1;
		while (!Heap.get(c).compare_to(Heap.get(parent(c)))) {
			swap(c, parent(c));
			c = parent(c);
		}
	}
	
	public String get() {
		return Heap.get(1).name;
	}
}
