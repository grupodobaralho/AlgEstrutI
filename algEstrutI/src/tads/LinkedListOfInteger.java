package tads;

public class LinkedListOfInteger {
	
	class Node {
		public Integer element;
		public Node next;
		
		public Node(Integer element){
			this.element = element;
			next = null;
		}
	}	
	private Node head = null;
	private Node tail = null;
	private int count = 0;
	
	public LinkedListOfInteger(){	
	}
	
	public void add(Integer element){
		Node n = new Node(element);
		if(count==0)head = n;
		else tail.next = n;
		tail = n;
		count++;
	}
	
	
}
