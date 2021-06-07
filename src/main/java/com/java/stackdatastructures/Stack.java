package com.java.stackdatastructures;

import java.util.LinkedList;

import com.java.datastructures.INode;
import com.java.datastructures.MyLinkedList;
import com.java.datastructures.MyNode;

public class Stack<E> {
	public MyLinkedList<E> linkedlist;
	public Stack() {
		linkedlist = new MyLinkedList<E>();
	}
	/**
	 * Usecase 1
	 * Function pushes an element on to the stack
	 * @param node
	 */
	public void push(INode<E> node) {
		this.linkedlist.add(node);	
	}
	/**
	 * Usecase 2
	 * Function is used to view the top element of the stack
	 * @return
	 */
	public E peek() {
		E peekElement = this.linkedlist.pop();
		this.linkedlist.add(new MyNode<E>(peekElement));
		return peekElement;
	}
	/**
	 * Usecase 2
	 * Function removes the top of the stack element
	 * 
	 */
	public void pop() {
		if(!(this.linkedlist.isEmpty())) {
			this.linkedlist.pop();
		}
	}
	public void printStack() {
		this.linkedlist.printNodes();
		System.out.println();
	}
	private boolean isEmpty() {
		return this.linkedlist.isEmpty();
	}
	public int size() {
		return this.linkedlist.size();
	}
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		stack.push(thirdNode);
		stack.push(secondNode);
		stack.push(firstNode);
		stack.printStack();
		stack.pop();
		System.out.println(stack.peek()); //Returns the top element of the stack
		System.out.println(stack.size());
	}
}