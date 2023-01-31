package com.Queue;

public class Queue {
// FIFO
	private int length = 3;
	private int queue[] = new int[length], front = 0, rear = 0, size = 0;

	public void enqueue(int data) {
		Shrink();
		queue[rear] = data;
//		System.out.println(rear);
		rear = (rear + 1) % length;
		size++;
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.print("Queue is Empty.\n");
		} else {
			int data = queue[front];
			front = (front + 1) % 5;
			size--;
			reduce();
			System.out.println(data);
		}
	}

	public void show() {
		if (isEmpty())
			System.out.print("Queue is Empty.");
		else
			for (int i = 0; i < size; i++) {
//				System.out.print(queue[(front + i) % 5] + " ");
				System.out.print(queue[i] + " ");
			}
		System.out.println();
	}

	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	public int size() {
		return rear;
	}

	private void Shrink() {
		if (size + 1 == length) {
			length = length * 2;
			int dequex[] = new int[length];
			System.arraycopy(queue, 0, dequex, 0, size);
			queue = dequex;
		}
	}

	private void reduce() {
		if (size <= (length / 2) / 2) {
			length /= 2;
			int dequex[] = new int[length];
			System.arraycopy(queue, 0, dequex, 0, size);
			queue = dequex;
		}

	}
}
