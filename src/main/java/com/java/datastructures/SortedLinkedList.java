package com.java.datastructures;

public class SortedLinkedList<E extends Comparable<E>> {
	public INode<E> head;
	public INode<E> tail;
	public SortedLinkedList() {
		this.head = null;
		this.tail = null;
	}
	/**Usecase 10
	 * Modified Function adds elements to the linked list(head changes)
	 * @param node
	 */
	public void add(INode<E> node) {
		if (head == null || (head.getKey().compareTo(node.getKey())>0)) { 
			node.setNext(head); 
			head = node; 
		} 
		else {
			INode<E> currentNode = head;
			while(currentNode.getNext() != null && (currentNode.getNext().getKey().compareTo(node.getKey()) < 0)) {
				currentNode = currentNode.getNext();
			}
			node.setNext(currentNode.getNext());
			currentNode.setNext(node);
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
	/**
	 * Usecase 4
	 * Function inserts at a specified position in list
	 * @param position
	 * @param node
	 */
	public void insert(int position, INode<E> node) {
		int count = 0;
		INode<E> previousNode = null;
		INode<E> currentNode = head;
		while(count != position) {
			count++;
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}
		previousNode.setNext(node);
		node.setNext(currentNode);
	}
	/**Usecase 5
	 * Function returns the first element in the list
	 * @return
	 */
	public E pop() {
		INode<E> tempNode = head.getNext();
		E key = head.getKey();
		head = tempNode;
		return key;
	}
	/**
	 * Usecase 6
	 * Function pops the last element in the list
	 * @return
	 */
	public E popLast() {
		INode<E> currentNode = head;
		INode<E> previousNode = null;
		while(currentNode.getNext() != null) {
			previousNode = currentNode;
			currentNode = currentNode.getNext();	
		}
		E key = currentNode.getKey();
		currentNode = null;
		previousNode.setNext(null);
		tail = previousNode;
		return key;	
	}
	/**
	 * Usecase 7
	 * Function searches for an item in list
	 * @param item
	 * @return
	 */
	public boolean search(E item) {
		boolean isPresent = false;
		INode<E> tempNode = head;
		while(tempNode.getNext() != null) {
			if(tempNode.getKey().equals(item)) {
				isPresent = true;
			}
			else {
				tempNode = tempNode.getNext();
			}	
		}
		if(tail.getKey().equals(item)) {
			isPresent = true;
		}
		return isPresent;	
	}
	/**
	 * Usecase 9
	 * Function returns index of specific element
	 * @param item
	 * @return
	 */
	public int index(E item) {
		int index = 0;
		int count = 0;
		INode<E> tempNode = head;
		while(tempNode.getNext() != null) {
			if(tempNode.getKey().equals(item)) {
				index = count;
				break;
			}
			else {
				tempNode = tempNode.getNext();
			}
			count++;
		}
		if(tail.getKey().equals(item)) {
			count++;
			index = count;
		}
		return index;
	}
	public void printNodes() {
		INode<E> tempNode = head;
		while(tempNode.getNext() != null) {
			System.out.print(tempNode.getKey() + "->");
			tempNode = tempNode.getNext();
		}	
		System.out.print(tempNode.getKey());
	}
	public boolean isEmpty() {
		boolean empty = false;
		if(head == null ) {
			empty = true;
		}
		return empty;
	}
	public void remove(INode<E> node) {
		boolean removed = false;
		INode<E> currentNode = head.getNext();
		INode<E> previousNode = head;
		if(head.equals(node) && head != null) {
			this.pop();
		}
		else if(tail.equals(node)) {
			this.popLast();	
		}
		else {
			do {
				if(currentNode.getKey().equals(node.getKey())) {
					previousNode.setNext(currentNode.getNext());
					removed = true;
				}
				previousNode = currentNode;
				currentNode = currentNode.getNext();
			}while(!removed);
		}
	}
	/**
	 * Usecase 9
	 * Function returns the size of list
	 * @return
	 */
	public int size() {
		int count = 0;
		INode<E> node = head;
		while(node.getNext() != null) {
			count++;
			node = node.getNext();
		}
		if(node.equals(tail)) {
			count++;
		}
		return count;
	}
	public static void main(String[] args)
	{
		SortedLinkedList<Integer> list = new SortedLinkedList<Integer>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyNode<Integer> fourthNode = new MyNode<Integer>(40);
		list.add(firstNode);
		list.printNodes();
		System.out.println();
		list.add(thirdNode);
		list.printNodes();
		System.out.println();
		list.add(fourthNode);
		list.printNodes();
		System.out.println();
		list.add(secondNode);
		list.printNodes();
	}
}

