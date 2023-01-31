package com.List;

public class LinkedList {

	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
//		System.out.println("Start(node): "+"Data: "+node.data+" ,Address: "+node.next);
		node.next = null;
		if (head == null) {
			head = node;
		} else {

			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
////		System.err.println("End(node): "+"Data: "+node.data+" ,Address: "+node.next);
//		System.err.println("End(head): "+"Data: "+head.data+" ,Address: "+head.next);
	}

	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		try {
			Node n = head;
			if (index == 0) {
				insertAtStart(data);
			} else {
				for (int i = 1; i < index; i++) {
					n = n.next;
				}
			}
			node.next = n.next;
			n.next = node;
		} catch (Exception e) {
			System.out.println("no such index found!");
		}
	}

	public void deleteAt(int index) {
		if (isEmpty()) {
			System.err.println("List is Empty.");
		} else {
			try {
//		Node node = new Node();
				if (index == 0) {
					head = head.next;
				} else {
					Node n = head;
					Node n1 = null;
					for (int i = 0; i < index - 1; i++) {
						n = n.next;
					}
					n1 = n.next;
					n.next = n1.next;
					n1 = null;
				}
			} catch (Exception e) {
				System.out.print("No index no found ");
				System.err.println("Check size of the list");
			}
		}
	}

	public void deleteAll() {
		if (isEmpty())
			System.err.println("List is Empty.\n");
		else {
			Node node = new Node();
			Node n = head;
			for (int i = 0;; i++) {
				if (n.next != null) {
					break;
				} else {
					System.out.println(node.data);
					deleteAt(i);
				}
			}
		}
	}

	public void show() {
		if (isEmpty()) {
			System.err.println("List is Empty.\n");
		} else {
			Node node = head;
			while (node.next != null) {
//			System.err.println(node.data+" "+node.next);
				System.out.print(node.data + ", ");
				node = node.next;
			}
//			System.out.print(node.data);
			System.out.println();
		}
	}

	public boolean isEmpty() {
		if (head != null)
			return false;
		else
			return true;
	}

	public int size() {
		Node node = head;
		int k = 1;
		if (isEmpty()) {
			return 0;
		} else {
			while (node.next != null) {
				node = node.next;
				k++;
			}
			return k;
		}
	}
}
