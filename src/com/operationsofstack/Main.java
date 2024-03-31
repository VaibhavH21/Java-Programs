package com.operationsofstack;



public class Main {
	
	public static void main(String[] args) {
        Stack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peek: " + stack.peek()); // Should print 30
        System.out.println("Pop: " + stack.pop());   // Should print 30

        stack.push(40);
        stack.push(50);
        stack.push(60); // This will overflow the stack

        System.out.println("Is Empty? " + stack.isEmpty()); // Should print false
        System.out.println("Is Full? " + stack.isFull());   // Should print true
    }

}
