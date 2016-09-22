package tads;

public class LinkedQueueOfInteger {
	class Node {
		public int element;
		public Node next;
		
		public Node(int e) {
			element = e;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	private int count;
	
	public LinkedQueueOfInteger() {
		head = null;
		tail = null;
		count = 0;
	}
	
	public void enqueue(int e){
		Node n = new Node(e);
		if(count == 0) {
			head = n;
		} else {
			tail.next = n;
		}
		tail = n;
		count++;
	}
	
	public int dequeue() {
		if(count == 0) 
			throw new IndexOutOfBoundsException("Cannot dequeue, queue is empty.");
		
		int aux = head.element;
		head = head.next;
		count--;
		return aux;
	}
	
	public int head() {
		if(count == 0) 
			throw new IndexOutOfBoundsException("Cannot dequeue, queue is empty.");
		
		return head.element;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return count==0;		
	}
	
	public void clear() {
		count = 0;
	}
	
	//toString
	public String toString() {
		String aux = "";
		Node n = head;
		for(int i=0; i<count; i++) {
			aux += (n.element + "\n");
			n = n.next;
		}
		return aux;
	}
}
