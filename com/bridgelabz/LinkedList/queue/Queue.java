package com.bridgelabz.LinkedList.queue;

import com.bridgelabz.LinkedList.LinkedList;
import com.bridgelabz.LinkedList.LinkedListMain;
import com.bridgelabz.LinkedList.Node;

public class Queue {
	private Node top;
	private LinkedList linkedList;
   

    public Queue() {
        this.linkedList = new LinkedList();
    }

    public void enqueue() {
    	  linkedList.append(56);
          linkedList.append(30);
          linkedList.append(70);
          linkedList.print();
    }
}