package com.example.eco_eat;

public class Node {
	public Data value;
	public Node left;
	public Node right;

	public Node(Data d){
		this.value = d;
		left = null;
		right = null;
	}
}
