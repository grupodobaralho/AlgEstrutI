package tads;

public class LinkedQueueOfInteger {
	private Node head;
	private Node tail;
	private int count;
	
	private class Node {
		public Integer element;
		public Node next;
		
		public Node(Integer e) {
			element = e;
			next = null;
		}
	}
	
	public LinkedQueueOfInteger() {
		head = null;
		tail = null;
		count = 0;
	}
	
	public void enqueue(Integer e){
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
		Integer aux = head.element;
		head = head.next;
		count--;
		return aux;
	}
	
	public int head() {
		if(count == 0) 
			throw new IndexOutOfBoundsException("Cannot show head, queue is empty.");
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
	@Override
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