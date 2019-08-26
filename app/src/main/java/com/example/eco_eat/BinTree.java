package com.example.eco_eat;

import java.util.ArrayList;

public class BinTree {
	public Node root;

	public Node build_tree(ArrayList <Data> arr, int l, int r) {
		if (l > r) {
			return null;
		}
		int mid = (l+r)/2;
		Node node = new Node(arr.get(mid));
		node.left = build_tree(arr, l, mid-1);
		node.right = build_tree(arr, mid+1, r);
		return node;
	}

	private  Node addRecursive(Node current, Data value){
		if (current == null){
			return new Node(value);
		}
		if (value.compare_to(current.value)){
			current.right = addRecursive(current.right, value);
		}
		else{
			current.left = addRecursive(current.left, value);
		}
		return current;
	}

	public void add(Data value){
		root = addRecursive(root, value);
	}
	private  Data containsNodeRecursive(Node current, Data value) {
		if (current == null){
			return new Data("no result", "very", "sad");
		}
		if (value.equal_to(current.value)){
			return current.value;
		}
		return current.value.compare_to(value) ? containsNodeRecursive(current.left, value) : containsNodeRecursive(current.right, value);
	}

	public Data containsNode(Data value) {
	    return containsNodeRecursive(root, value);
	}
}
