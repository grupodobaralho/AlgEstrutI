package ex06;

import ex06.LinkedListOfSignInt.Node;

public class LinkedListOfSignIntIsra {
	private Node head;
	private Node tail;
	private int count;
		
	public class Node {
		public Integer element;
		public Node next;
		public Node nextPos;
		public Node nextNeg;
			
		public Node(Integer element){
			this.element = element;
			next = null;			
		}
	}
	
	public LinkedListOfSignIntIsra() {
		count = 0;
	}
	
	public void add(Integer element){
		Node n = new Node(element);
		if(count==0)
			head = n;
		else{
			Node aux = head;
			if(element < 0) {
				for(int i=0; i<count; i++){
					if(aux.nextNeg==null)
						aux.nextNeg = n;
					aux = aux.next;
				}
			}
			else
				for(int i=0; i<count; i++){
					if(aux.nextPos == null)
						aux.nextPos = n;
				}
			tail.next = n;			
		}
		tail = n;		
		count++;		
	}
	
	public String soPositivos(){
		String positivos = "";
		Node aux = head;
		for(int i=0; i<count; i++){
			if(aux.element>0)
				break;
			aux = aux.next;			
		}
		
		do {
			positivos = positivos + aux.element + "\n";
			aux = aux.nextPos;
		}while(aux!=null);
		
		return positivos;			
	}
	
	public String soNegativos(){
		String negativos = "";
		Node aux = head;
		for(int i=0; i<count; i++){
			if(aux.element<0)
				break;
			aux = aux.next;
		}
		
		do{
			negativos = negativos + aux.element + "\n";
			aux = aux.nextNeg;
		}while(aux != null);
		
		return negativos;		
	}

}
