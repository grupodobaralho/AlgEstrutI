package tads;

public class LinkedStackOfInteger {
	
	private Node head;
	private Node tail;
	private int count;	
	
	private class Node{
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
			count++;
		}
		else{		
			Node aux = tail;
			tail=n;
			aux.next = tail;
			count++;
		}
	}
	
	public Integer pop(){
		if(count==0)
			throw new IndexOutOfBoundsException("Cannot pop, stack is empty.");
		Integer aux = tail.element;
		if(count==1){			
			head = null;
			tail = null;
			count = 0;
			return aux;			 
		}		
		Node n = head;
		for(int i=1; i<count-1; i++){
			n = n.next;		
		}
		tail=n;
		count--;
		return aux;		
	}
	
	public int size(){
		return count;
	}
	
	public boolean isEmpty(){
		return count == 0;
	}
	
	public void clear(){
		head = null;
		tail = null;
		count = 0;
	}
	
	public Integer top(){
		if(count==0)
			throw new IndexOutOfBoundsException("There's no top, for stack is empty.");
		return tail.element;
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
