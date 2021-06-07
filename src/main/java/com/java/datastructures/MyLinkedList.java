package com.java.datastructures;

public class MyLinkedList<E> {
	public INode<E> head;
	public INode<E> tail;
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	/**Usecase 2
	 * Function adds elements to the linked list(head changes)
	 * @param node
	 */
	public void add(INode<E> node) {
		if(head == null) {
			head = node;
			tail = node;
		}
		else {
			INode<E> tempNode = head;
			tempNode = head;
			head = node;
			head.setNext(tempNode);	
		}
	}
	/**
	 * Usecase 3
	 * Function appends elements to the head(tail changes)
	 * @param node
	 */
	public void append(INode<E> node) {
		if(head == null) {
			head = node;
			tail = node;
		}
		else {
			INode<E> tempNode = tail;
			tempNode.setNext(node);
			tail = node;
		}
	}
	public void printNodes() {
		INode<E> tempNode = head;
		while(tempNode.getNext() != null) {
			System.out.print(tempNode.getKey() + "->");
			tempNode = tempNode.getNext();
		}	
		System.out.print(tempNode.getKey());
	}
	public static void main(String[] args)
	{
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		list.append(firstNode);
		list.append(secondNode);
		list.append(thirdNode);
		list.printNodes();
	}
}
