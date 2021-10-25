package com.bridgelabz.LinkedList.stack;

import com.bridgelabz.LinkedList.LinkedList;
import com.bridgelabz.LinkedList.Node;

public class Stack {
	 private Node top;
	    private LinkedList linkedList;

	    public Stack() {
	        this.linkedList = new LinkedList();
	    }

	    public void push() {
	        linkedList.push(70);
	        linkedList.push(30);
	        linkedList.push(56);
	        linkedList.print();
	    }

	}
	  