package tads;

public class LinkedListOfInteger {
	private Node head;
	private Node tail;
	private int count;
	
	
	private class Node {
		public Integer element;
		public Node next;
		
		public Node(Integer element){
			this.element = element;
			next = null;			
		}
	}	
	
	public LinkedListOfInteger(Integer element){
		this.head = new Node(element);
		this.tail = this.head;
		count++;
	}
	
	//Adiciona elemento no final
	public void add(Integer element){
		Node n = new Node(element);
		if(count==0)head = n;
		else tail.next = n;
		tail = n;
		count++;		
	}
	
	public void addByIndex(Integer element, int index){
		if(index>=count) throw new IndexOutOfBoundsException("Index inválido");
		Node n = new Node(element);
		Node aux = head;
		if(index==0){
			n.next=head;
			head=n;
			count++;
			return;
		}		
		for(int i=1;i<index;i++){
			aux = aux.next;
		}		
		n.next=aux.next;
		aux.next=n;
		count++;
	}

		
	//Adiciona elemento no index informado
	public void add(int index, Integer element){
		Node ele = new Node(element);		
		if(index<0 || index>=count)
			throw new IndexOutOfBoundsException("Invalid Index");	
		Node aux = head;
		Node n = head.next;
		if(index == 0){
			head = ele;
			ele.next = aux;
			if(count==1) 
				tail=null;
				count++;
			return;
		}
		for(int i=1; i<index; i++){
			aux = aux.next;
			n = n.next;
		}
		aux.next = ele;
		if(n==tail){
			tail = ele;
		}
		else ele.next = n;
		count++;
	}
		
	//Retorna o valor na posição do index informado
	public Integer get(int index){
		if(index<0 || index >=count)
			throw new IndexOutOfBoundsException("Invalid Index");			
		if(index==count-1)
			return tail.element;
		Node aux = head;
		for(int i=0; i<index; i++){		
			aux = aux.next;
		}
		return aux.element;
	}
	
	//Troca o valor da posição index por outro e retorna o valor antigo
	public Integer set(int index, Integer element){
		if(index<0 || index>=count)
			throw new IndexOutOfBoundsException("Invalid Index");
		Integer aux;
		if(index==0){
			aux = head.element;
			head.element=element;	
			return aux;
		}
		if(index==count-1){
			aux = tail.element;
			tail.element=element;	
			return aux;			
		}
			
		Node n = head;
		for(int i=1; i<index; i++){
			n = n.next;			
		}	
		aux = n.element;
		n.element = element;
		return aux;
		
	}
	
	//Remove um elemento do vetor e reposiciona os demais retornando true se o valor foi encontrado
	public boolean remove(Integer element){
		if(count==0) return false;
		if(head.element==element){
			head = head.next;
			if(count==1)
				tail=null;
			count--;
			return true;
		}
		Node ant = head;
		Node n = head.next;
		for(int i=1; i<count; i++){
			if(n.element==element){
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
	
	//Remove um elemento do vetor pelo índice e retorna o elemento que estava lá
	public Integer removeByIndex(int index){
		if(index<0 || index>=count)
			throw new IndexOutOfBoundsException("Invalid Index");		
		if(index==0){
			Integer aux = head.element;
			head = head.next;
			if(count==1)
				tail=null;	
			count--;			
			return aux;
		}
		Node ant = head;
		Node n = head.next;
		for(int i=1; i<index; i++){			
			ant = ant.next;
			n = n.next;					
		}
		ant.next = n.next;
		if(n==tail)
			tail=ant;
		count--;
		return n.element;			
	}
	
	//Retorna o número de elementos armazenados na lista
	public int size(){
		return count;
	}
	
	//Retorna true se a lista contém o elemento
	public boolean contains(Integer e){		
		Node n = head;
		for(int i=0; i<count; i++){
			if(n.element==e)				
				return true;
			n = n.next;
		}
		return false;	
	}
	
	//retorna a posição onde o elemento está na lista
	public int indexOf(Integer e){		
		Node n = head;
		for(int i=0; i<count; i++){			
			if(n.element==e)
				return i;
			n = n.next;
		}
		return -1;
	}
	
	//remove todos os elementos da lista
	public void clear(){
		count = 0;
		head = null;
		tail = null;
	}
		
	public boolean isEmpty(){
		if(count==0)return true;
		else return false;
	}
}

