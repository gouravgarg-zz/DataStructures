 

public class QueueFixedSizeArray {

	private static final int CAPACITY = 5;
	private Integer[] list;
	private int size = 0;
	private int head = -1;
	private int tail = -1;

	public QueueFixedSizeArray() {
		list = new Integer[CAPACITY];
	}

	public void enqueue(int value) {
		if (size == CAPACITY) {
			System.err.println("Queue is full.");
		} else {
			tail++;
			list[tail] = value;
			size++;
			if (tail == 0) {
				head = 0;
			}
		}
	}

	public void dequeue() {
		if (head == -1 || head>=list.length) {
			System.err.println("Queue is empty");
		} else {
			size--;
			list[head] = null;
			head++;
		}
	}

	public static void main(String... args) {
		QueueFixedSizeArray queueFixedSizeArray = new QueueFixedSizeArray();
		queueFixedSizeArray.enqueue(1);
		queueFixedSizeArray.enqueue(2);
		queueFixedSizeArray.enqueue(3);
		queueFixedSizeArray.enqueue(4);
		queueFixedSizeArray.enqueue(5);
		queueFixedSizeArray.enqueue(6);
		queueFixedSizeArray.enqueue(7);
		queueFixedSizeArray.dequeue();
		queueFixedSizeArray.dequeue();
		queueFixedSizeArray.dequeue();
		queueFixedSizeArray.dequeue();
		queueFixedSizeArray.dequeue();
		queueFixedSizeArray.dequeue();
		queueFixedSizeArray.dequeue();
		
	}

}
