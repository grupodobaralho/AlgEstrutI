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
	
	public LinkedListOfInteger() {
		count = 0;
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
	
	public void addByIndex(int index, Integer element){
		if(index<0 || index>count) throw new IndexOutOfBoundsException("Index inv�lido");
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
	
	//Retorna o valor na posi��o do index informado
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
	
	//Troca o valor da posi��o index por outro e retorna o valor antigo
	public Integer set(int index, Integer element){
		if(index<0 || index>=count) throw new IndexOutOfBoundsException("Index inv�lido");
		Integer aux;
		if(index==count-1){
			aux = tail.element;
			tail.element=element;	
			return aux;			
		}
		/* Desnecess�rio verificar head em separado neste caso. Se index=0, o for que percorre
		   toda a lista n�o chega a inicializar, desde de que seu i comece em 0, e n�o em 1.  
		if(index==0){
			aux = head.element;
			head.element=element;	
			return aux;
		}
		*/
		
		Node n = head;
		for(int i=0;i<index;i++){ //mudei i de 1 para 0, cf. coment�rio acima
			n = n.next;
		}
		aux = n.element;
		n.element=element;
		return aux;	
					
	}
	
	//Remove um elemento do vetor e reposiciona os demais retornando true se o valor foi encontrado
	public boolean remove(Integer element){
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
	
	//Remove um elemento do vetor pelo �ndice e retorna o elemento que estava l�
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
	
	//Retorna o n�mero de elementos armazenados na lista
	public int size(){
		return count;
	}
	
	//Retorna true se a lista cont�m o elemento

	public boolean contains(Integer e){		
		//if(tail.element==e) return true; //verificar tail.element antes de come�ar para otimizar.
		//Campo de c�digo comentado porque ir� gerar um exception se o tail n�o
		//tiver sido inicializado (Israel)
		Node n = head;
		for(int i=0; i<count; i++){
			if(n.element==e)				
				return true;
			n = n.next;
		}
		return false;
	}
		
	//retorna a posi��o onde o elemento est� na lista
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
		return count==0;
	}
	
	public int[] toArray(){
		if(count==0)
			throw new IndexOutOfBoundsException("The list is empty");
		int[] array = new int[count];
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
			aux += (n.element + "\n");
			n = n.next;
		}
		return aux;
	}

}
