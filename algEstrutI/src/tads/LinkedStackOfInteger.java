package tads;

public class LinkedStackOfInteger {
	
	private Node head;
	private Node tail;
	private int count;	
	
	class Node{
		Integer element;
		Node next;
		public Node(Integer element){
			this.element = element;
			this.next = null;
		}
	}
	
	public LinkedStackOfInteger(){
		head = null;
		tail = null;
		count = 0;
	}
	
	public LinkedStackOfInteger(Integer element){
		this.head = new Node(element);
		this.tail = this.head;
		this.count = 0;
	}
	
	public void push(Integer element){
		Node n = new Node(element);
		if(count==0){
			head = n;
			tail=head;
		}
		else{		
			Node aux = tail;
			tail=n;
			aux.next = tail;
		}
	}
		
}
