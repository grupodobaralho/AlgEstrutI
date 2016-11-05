package tads;

public class LinkedListOfNodes {
	private Node head;
	private Node tail;
	private int count;
	
	private class Node {
		public Integer element;
		public Node next;
		
		@SuppressWarnings("unused")
		public Node(){					
		}
	}
	
	public LinkedListOfNodes() {
		count = 0;
	}
	
	public LinkedListOfNodes(Node element){
		this.head = element;
		this.tail = this.head;
		count++;
	}
	
	//Adiciona elemento no final
	public void add(Node element){
		Node n = element;
		if(count==0)head = n;
		else tail.next = n;
		tail = n;
		count++;		
	}
	
	public boolean remove(Node element){
		if(count==0) return false;
		if(head==element){
			head = head.next;	
			if(count==1){
				tail=null;
			}
			count--;
			return true;			
		}
		Node ant = head;
		Node n = head.next;
		for(int i=1; i<count; i++){
			if(n==element){
				ant.next=n.next;
				count--;
				if(n==tail)
					tail=ant;
				return true;
			}
			else{
				ant = ant.next;
				n = n.next;
			}
		}
		return false;
	}
	
	//Retorna o valor na posição do index informado
	public Node get(int index){
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
		//Remove um elemento do vetor e reposiciona os demais retornando true se o valor foi encontrado
	//Remove um elemento do vetor pelo índice e retorna o elemento que estava lá

	//Retorna o número de elementos armazenados na lista
	public int size(){
		return count;
	}
		//Retorna true se a lista contém o elemento

	//retorna a posição onde o elemento está na lista
	//remove todos os elementos da lista

	//toString
	@Override
	public String toString() {
		String aux = "";
		Node n = head;
		for(int i=0; i<count; i++) {
			aux += (n.element.toString() + "\n");
			n = n.next;
		}
		return aux;
	}

}
