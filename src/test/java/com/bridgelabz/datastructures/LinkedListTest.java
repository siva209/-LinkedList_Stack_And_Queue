package com.bridgelabz.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.datastructures.MyLinkedList;
import com.java.datastructures.MyNode;

public class LinkedListTest {

	@Test
	public void givenValuePresentInLinkedList_shouldReturnTrue() {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		list.add(firstNode);
		list.append(secondNode);
		list.append(thirdNode);
		assertEquals(true,list.search(30));
	}
}
