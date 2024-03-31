
/*Implementing the operations of queue using package and interface.*/

package queue;

import queue.ArrayQueue;

public class ArrayQueue implements Queue{
	
	    private int[] arr;
	    private int front;
	    private int rear;
	    private int capacity;
	    private int size;
	    
	    public ArrayQueue(int capacity) {
	        this.capacity = capacity;
	        arr = new int[capacity];
	        front = 0;
	        rear = -1;
	        size = 0;
	    }


	@Override
	public void enqueue(int item) {
		 if (isFull()) {
	            System.out.println("Queue is full. Cannot enqueue item: " + item);
	            return;
	        }
	        rear = (rear + 1) % capacity;
	        arr[rear] = item;
	        size++;
		
	}

	@Override
	public int dequeue() {
		if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // or throw an exception
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
	}

	@Override
	public int peek() {
		if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // or throw an exception
        }
        return arr[front];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public boolean isFull() {
		return size == capacity;
	}

}
