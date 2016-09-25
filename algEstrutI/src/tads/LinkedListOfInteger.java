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
		Node aux = head;
		for(int i=0;i<index;i++){
			aux = aux.next;
		}
		return aux.element;
	}
	
	//Troca o valor da posição index por outro e retorna o valor antigo
	public Integer set(int index, Integer element){
		if(index<0 || index>=count) throw new IndexOutOfBoundsException("Index inválido");
		Node aux = head;
		for(int i=0;i<index;i++){
			aux = aux.next;
		}
		Integer n = aux.element;
		aux.element=element;
		return n;	
	}
	
	//Remove um elemento do vetor e reposiciona os demais retornando true se o valor foi encontrado
	public boolean remove(Integer element){
		if(head.element==element){
			head = head.next;
			count--;
			return true;
		}		
		Node aux1 = head;
		Node aux2 = head.next;
		for(int i=1;i<count;i++){
			if(aux2.element==element){
				aux1.next=aux2.next;
				count--;
				return true;
			}
			aux1 = aux1.next;
			aux2 = aux2.next;
		}		
		return false;
	}
	
	//Remove um elemento do vetor pelo índice e retorna o elemento que estava lá
	public Integer removeByIndex(int index){
		if(index<0 || index <=count) throw new IndexOutOfBoundsException("Index inálido");
		Integer numero;
		if(index==0){
			numero=head.element;
			head=head.next;
			return numero;
		}
		Node aux1 = head;
		Node aux2 = head.next;
		for(int i=1; i<index;i++){			
			aux1=aux1.next;
			aux2=aux2.next;
		}
		numero = aux2.element;
		aux1.next=aux2.next;
		return numero;
	}
	
	//Retorna o número de elementos armazenados na lista
	public int size(){
		return count;
	}
	
	//Retorna true se a lista contém o elemento
	public boolean contains(Integer element){
		if(head.element==element) return true;
		if(tail.element==element) return true;
		Node aux=head.next;
		for(int i=0;i<count;i++){
			if(aux.element==element) return true;
			aux=aux.next;
		}
		return false;
	}
	
	//indexOf(e): retorna a posição onde o elemento está na lista
	public int indexOf(Integer e){
		int pos = 0;
		Node aux=head;
		for(;pos<count && aux.element!=pos;pos++)
			aux=aux.next;
		return pos;
	}
	
	//remove todos os elementos da lista
	public void clear(){
		head=null;
	}
}

