package queue;



public class MainClass {
	
	public static void main(String[] args) {
        Queue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Peek: " + queue.peek()); // Should print 10
        System.out.println("Dequeue: " + queue.dequeue()); // Should print 10

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60); // This will overflow the queue

        System.out.println("Is Empty? " + queue.isEmpty()); // Should print false
        System.out.println("Is Full? " + queue.isFull()); // Should print true
    }

}
