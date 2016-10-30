package ex06;

public class LinkedListOfSignInt {
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
	
	public LinkedListOfSignInt() {
		count = 0;
	}
		
	//Adiciona elemento no final
	public void add(Integer element) {
		Node n = new Node(element);
		if(count==0)
			head = n;
		else {
			Node aux = head;
			if(element < 0) {
				for(int i=0; i<count; i++) {
					if(aux.nextNeg == null)
						aux.nextNeg = n;
					aux = aux.next;
				}
			}
			else
				for(int i=0; i<count; i++) {
					if(aux.nextPos == null)
						aux.nextPos = n;
					aux = aux.next;
				}
			tail.next = n;
		}
		tail = n;
		count++;		
	}
	
	public String soPositivos() {
		String soPositivos = "";
		Node aux = head;
		for(int i=0; i<count; i++) {
			if (aux.element >= 0)
				break;
			aux = aux.next;
		}
		
		do {
			soPositivos += aux.element + "\n";
			aux = aux.nextPos;
		} while (aux != null);
		
		return soPositivos;
	}
	
	public String soNegativos() {
		String soNegativos = "";
		Node aux = head;
		for(int i=0; i<count; i++) {
			if (aux.element < 0)
				break;
			aux = aux.next;
		}
		
		do {
			soNegativos += aux.element + "\n";
			aux = aux.nextNeg;
		} while (aux != null);
		
		return soNegativos;
	}
	
	public int size() {
		return count;
	}
	
	//apenas para testes na classe App
	public Node getNode(int index) {
		if(index<0 || index >=count)
			throw new IndexOutOfBoundsException("Invalid Index");			
		if(index==count-1)
			return tail;
		Node aux = head;
		for(int i=0; i<index; i++){		
			aux = aux.next;
		}
		return aux;
	}
}