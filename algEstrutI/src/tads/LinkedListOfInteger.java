package tads;

public class LinkedListOfInteger {
	
	class Node {
		public Integer element;
		public Node next;
		
		public Node(Integer element){
			this.element = element;
			next = null;
			count++; //ao instanciar um nodo, incrementa o contador
		}
	}	
	private Node head = null;
	private Node tail = null;
	private int count = 0;
	
	public LinkedListOfInteger(Integer element){
		this.head = new Node(element);
	}
	
	public void add(Integer element){
		Node n = new Node(element);
		if(count==0)head = n;
		else tail.next = n;
		tail = n;
		//count++;
		//Removi pois ao instanciar um nodo o contador já é incrementado
	}
	
	public void add(Integer element, int index){
		if(index>=count) throw new IndexOutOfBoundsException("Index inválido");
		Node aux = head; 		
		for(int i=0;i<index-2;i++){
			aux = aux.next;
		}
		Node novo = new Node(element);
		novo.next=aux.next;
		aux.next=novo;
	}
	

}
