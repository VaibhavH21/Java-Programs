
/*Implementing the operations of stack using package and interface.*/

package com.operationsofstack;

public class ArrayStack implements Stack {
	   private int[] arr;
	    private int top;
	    private int capacity;

	    public ArrayStack(int capacity) {
	        this.capacity = capacity;
	        arr = new int[capacity];
	        top = -1;
    
	    }

	@Override
	public void push(int item) {
		 if (isFull()) {
	            System.out.println("Stack is full. Cannot push item: " + item);
	            return;
	        }
	        arr[++top] = item;
	}

	@Override
	public int pop() {
		if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // or throw an exception
        }
        return arr[top--];
	}

	@Override
	public int peek() {
		if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // or throw an exception
        }
        return arr[top];
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public boolean isFull() {
		return top == capacity - 1;
	}

}
