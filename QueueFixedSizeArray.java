 

public class QueueFixedSizeArray {

		private static final int CAPACITY = 5;
	private Integer[] list;
	private int size = 0;
	private int head = 0;
	private int tail = 0;

	public QueueFixedSizeArray() {
		list = new Integer[CAPACITY];
	}

	public void enqueue(int value) {
		if (tail == CAPACITY) {
			System.err.println("Queue is full can't add new elements");
		} else {
			if (null == list[tail]) {
				list[tail] = value;
				tail++;
				size++;

				if (tail == CAPACITY) {
					tail = 0;
				}
			}

		}
	}

	public int getSize() {
		return size;
	}

	public void dequeue() {
		if (head == -1 || head >= list.length) {
			System.err.println("Queue is already empty");
		} else {
			if (null != list[head]) {
				size--;
				list[head] = null;
				head++;
				if (head == list.length) {
					head = 0;
				}
			}
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
		queueFixedSizeArray.enqueue(6);
		queueFixedSizeArray.enqueue(7);
		queueFixedSizeArray.dequeue();
		queueFixedSizeArray.dequeue();

	}

}
