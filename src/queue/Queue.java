package queue;

public interface Queue {
	
	void enqueue(int item);
    int dequeue();
    int peek();
    boolean isEmpty();
    boolean isFull();

}
