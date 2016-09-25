package ex08;

import tads.ArrayQueueOfInteger;

public class App_ex08_ArrayQueue {

	public static void main(String[] args) {
		ArrayQueueOfInteger fila = new ArrayQueueOfInteger();

		System.out.println(fila);
		fila.enqueue(5);
		System.out.println(fila);
		fila.enqueue(3);
		System.out.println(fila);
		fila.dequeue();
		System.out.println(fila);
		fila.enqueue(2);
		System.out.println(fila);
		fila.enqueue(8);
		System.out.println(fila);
		fila.dequeue();
		System.out.println(fila);
		fila.dequeue();
		System.out.println(fila);
		fila.enqueue(9);
		System.out.println(fila);
		fila.enqueue(1);
		System.out.println(fila);
		fila.dequeue();
		System.out.println(fila);
		fila.enqueue(7);
		System.out.println(fila);
		fila.enqueue(6);
		System.out.println(fila);
		fila.dequeue();
		System.out.println(fila);
		fila.dequeue();
		System.out.println(fila);
		fila.enqueue(4);
		System.out.println(fila);
		fila.dequeue();
		System.out.println(fila);
		fila.dequeue();
		System.out.println(fila);
	}

}
