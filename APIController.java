package com.UserAPI;

import java.util.Scanner;

import com.List.LinkedList;
import com.Queue.Queue;
import com.Stack.Stack;

public class APIController 
{

	public static void run() {
		Scanner sc = new Scanner(System.in);

//		LinkedList llx = new LinkedList();

		String cases = "";
		String inCases = "";
		boolean abc = true;
		while (abc) {
			System.out.println("\n1.LinkedList\t2.Queue\n3.Stack\t\t4.Exit\nSelect Operation: ");
			int op1 = sc.nextInt();
			int input;
//		
			boolean back = true;
			switch (op1) {
			case 1:
				cases = "LinkedList";
				LinkedList ll = new LinkedList();
				while (back) {
					System.out.print(
							"\n1. add()\t\t2. addStart()\t\t3. addAt()\n4.deleteAt()\t\t5.deleteAll()\t\t6.show()\n7.size()\t\t8.isEmpty()\t\t0.Back to Main Menu\nSelect Operation: ");
					int op2 = sc.nextInt();
					switch (op2) {
					case 1:
						inCases = " insert()";
						System.out.print("Enter  the value = ");
						ll.insert(sc.nextInt());
						break;
					case 2:
						inCases = " insertStart()";
						System.out.print("Enter value = ");
						ll.insertAtStart(sc.nextInt());
						break;
					case 3:
						inCases = " insertAt()";
						System.out.print("Index no: ");
						int val = sc.nextInt();
						System.out.print("Value: ");
						int index = sc.nextInt();
						ll.insertAt(val, index);
						break;
					case 4:
						inCases = " deleteAt()";
						System.out.print("index no = ");
						ll.deleteAt(sc.nextInt());
						break;
					case 5:
						inCases = " deleteAll()";
						ll.deleteAll(); // something went wrong in the method
						System.out.print("Data Deleted");
						break;
					case 6:
						inCases = " show()";
						ll.show();
						break;
					case 7:
						inCases = "size()";
						System.out.println(ll.size());
						break;
					case 8:
						inCases = "isEmpty";
						System.out.println(ll.isEmpty());
						break;
					case 0:
						back = false;
						break;
					default:
						System.out.println("In LinkedList NO Such Option Found!");
					}
				}
				break;
			case 2:
				cases = "Queue";
				Queue que = new Queue();
				while (back) {
					System.out.print(
							"\n1.enQue()\t\t2.deQue()\t\t3.show()\n4.size()\t\t5.isEmpty()\t\t0.Back to Main Menu\nSelect Operation:");
					int op3 = sc.nextInt();

					switch (op3) {
					case 1:
						inCases = " enqueue()";
						System.out.print("Enter value = ");
						input = sc.nextInt();
						que.enqueue(input);
						break;
					case 2:
						inCases = " dequeue()";
						que.dequeue(); // something went wrong in that method following the loop
						break;
					case 3:
						inCases = " show()";
						que.show();
						break;
					case 4:
						inCases = "size()";
						System.out.println(que.size());
						break;
					case 5:
						inCases = "isEmpty()";
						System.out.println(que.isEmpty());
						break;
					case 0:
						back = false;
						break;
					default:
						System.out.println("In Queue NO Such Option Found!");
					}
				}
				break;
			case 3:
				cases = "Stack";
				Stack st = new Stack();
				while (back) {
					System.out.print(
							"\n1.push()\t\t2.pop()\t\t\t3.fatch()\n4.show()\t\t5.size()\t\t6.isEmpty()\n7.capacity()\t\t8.pick()\t\t0.Back to Main Menu\nSelect Operation: ");
//					System.out.print("Select Option: ");
					int op4 = sc.nextInt();
					switch (op4) {
					case 1:
						inCases = " push()";
						System.out.print("Enter value = ");
						input = sc.nextInt();
						st.push(input);
						break;
					case 2:
						inCases = " pop()";
						st.pop();
						break;
					case 3:
						inCases = " fatch()";
						st.fatch();
						break;
					case 4:
						inCases = " show()";
						st.show();
						break;
					case 5:
						inCases = " size()";
						System.out.println(st.size());
						break;
					case 6:
						inCases = " isEmpty()";
						System.out.println(st.isEmpty());
						break;
					case 7:
						inCases = " capacity()";
						System.out.println(st.capacity());
						break;
					case 8:
						inCases = " pick()";
						System.out.print("Enter value: ");
						System.out.println(st.pick(sc.nextInt()));
						break;
					case 0:
						back = false;
						break;
					}
				}
				break;
			default:
				cases = "Option Not Found!";
				inCases = "Null";
				abc = false;
				break;
			}
		}
		System.err.println("You operation on '" + cases + "' class using '" + inCases + "' method");
		sc.close();
	}

}
