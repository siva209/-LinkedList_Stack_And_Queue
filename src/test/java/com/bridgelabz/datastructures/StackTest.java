package com.bridgelabz.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.datastructures.MyNode;
import com.java.stackdatastructures.Stack;

public class StackTest {

	/**
	 * Usecase1
	 */
	@Test
	public void givenStack_WhenReturnPeak_ShouldPassTheResult() {
		Stack<Integer> stack = new Stack();
		MyNode<Integer> myFirstNode = new MyNode(70);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(56);
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		Integer peek = stack.peek();
		stack.printStack();
		assertEquals(peek, myThirdNode.key);
	}

	/**
	 * Usecase2
	 */
	@Test
	public void givenStack_WhenDeleteTopElement_ShouldPassTheResult() {
		Stack<Integer> stack = new Stack();
		MyNode<Integer> myFirstNode = new MyNode(70);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(56);
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		stack.pop();
		assertEquals(2, stack.size());
	}
}

