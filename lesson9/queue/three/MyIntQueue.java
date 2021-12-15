package lesson9.queue.three;

public class MyIntQueue {

	private final int ARRAY_SIZE = 10;
	private int[] arr;
	private int front;
	private int rear;

	public MyIntQueue() {

		arr = new int[ARRAY_SIZE];
		front = -1;
		rear = -1;

	}

	boolean isEmpty() {

		return (rear - front) == 0  && arr[rear] == 0 ? true : false;

	}

	void enqueue(int data) {
		
		if(front == -1)
			front = 0;

		if ((rear + 1) == arr.length)
			resize();
		arr[++rear] = data;

	}

	int dequeue() {
		
		if(!(this.isEmpty())) {
			
			int result = arr[front];
			arr[front] = 0;  
			front++;
			return result;
			
		}
		return 0;

	}

	int peek() {

		if (!(this.isEmpty()))
			return arr[front];

		return 0;
	}

	int size() {

		if(rear - front == 0 && arr[front] != 0)
			return 1;
		
		return rear - front;
	}

	private void resize() {
		
		if(rear == front && arr[front] == 0) {
			front = rear = -1;
			return;
		}
			

		System.out.println("resizing");
		int len = arr.length;
		int newlen = 2 * len;
		int[] temp = new int[newlen];
		System.arraycopy(arr, 0, temp, 0, len);
		arr = temp;

	}
	
	
	public static void main(String[] args) {
		
		MyIntQueue queue = new MyIntQueue();
		for(int i = 1; i <= 20; i++) {
			System.out.println("queueing element to queue..." + i);
			queue.enqueue(i);
		}
		for(int i = 3; i < 20 ; i+=3) {
			System.out.println("dequeueing element from queue..." +queue.dequeue());
		}
		
		System.out.println("Element in front of the Queue is  " + queue.peek());
		System.out.println("The Queue contains " +queue.size() + " elements");
		
	}

}
