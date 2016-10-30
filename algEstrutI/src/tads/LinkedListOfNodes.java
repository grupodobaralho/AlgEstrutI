package tads;

public class LinkedListOfNodes {
	private Node head;
	private Node tail;
	private int count;
	
	private class Node {
		public Node element;
		public Node next;
		
		public Node(Node element){
			this.element = element;
			next = null;			
		}
	}
	
	public LinkedListOfNodes() {
		count = 0;
	}
	
	public LinkedListOfNodes(Node element){
		this.head = new Node(element);
		this.tail = this.head;
		count++;
	}
	
	//Adiciona elemento no final
	public void add(Node element){
		Node n = new Node(element);
		if(count==0)head = n;
		else tail.next = n;
		tail = n;
		count++;		
	}
	
	public void addByIndex(int index, Node element){
		if(index<0 || index>count) throw new IndexOutOfBoundsException("Index inválido");
		Node n = new Node(element);
		if (count==0) add(element);
		else{
			if(index==0){
				n.next=head;
				head=n;
			}
			else {
				Node aux = head;
				for(int i=1; i<index; i++){
					aux = aux.next;
				}		
				n.next=aux.next;
				aux.next=n;
			}
			count++;
		}
	}
	
	//Retorna o valor na posição do index informado
	public Node get(int index){
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
	public Node set(int index, Node element){
		if(index<0 || index>=count) throw new IndexOutOfBoundsException("Index inválido");
		Node aux;
		if(index==count-1){
			aux = tail.element;
			tail.element=element;	
			return aux;			
		}
		/* Desnecessário verificar head em separado neste caso. Se index=0, o for que percorre
		   toda a lista não chega a inicializar, desde de que seu i comece em 0, e não em 1.  
		if(index==0){
			aux = head.element;
			head.element=element;	
			return aux;
		}
		*/
		
		Node n = head;
		for(int i=0;i<index;i++){ //mudei i de 1 para 0, cf. comentário acima
			n = n.next;
		}
		aux = n.element;
		n.element=element;
		return aux;	
					
	}
	
	//Remove um elemento do vetor e reposiciona os demais retornando true se o valor foi encontrado
	public boolean remove(Node element){
		if(count==0) return false;
		if(head.element==element){
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
	public Node removeByIndex(int index){
		if(index<0 || index>=count)
			throw new IndexOutOfBoundsException("Invalid Index");		
		if(index==0){
			Node aux = head.element;
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

	public boolean contains(Node e){		
		//if(tail.element==e) return true; //verificar tail.element antes de começar para otimizar.
		//Campo de código comentado porque irá gerar um exception se o tail não
		//tiver sido inicializado (Israel)
		Node n = head;
		for(int i=0; i<count; i++){
			if(n.element==e)				
				return true;
			n = n.next;
		}
		return false;
	}
		
	//retorna a posição onde o elemento está na lista
	public int indexOf(Node e){		
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
		return count==0;
	}
	
	public Node[] toArray(){
		if(count==0)
			throw new IndexOutOfBoundsException("The list is empty");
		Node[] array = new Node[count];
		Node aux = head;
		for(int i=0; i<count; i++){
			array[i] = aux.element;
			aux = aux.next;
		}
		return array;
	}

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
