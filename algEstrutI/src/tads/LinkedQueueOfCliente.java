package tads;

public class LinkedQueueOfCliente{
	private Node head;
	private Node tail;
	private int count;
	private int countIdoso;
	
	private class Node{
		public Cliente cliente;
		public Node next;
		
		public Node(Cliente cliente){
			this.cliente = cliente;
			next = null;			
		}
	}
	
	public LinkedQueueOfCliente(){
		head = null;
		tail = null;
		count = 0;
		countIdoso = 0;
	}
	
	public void enqueue(Cliente cliente){
		Node aux = new Node(cliente);
		if(count==0)
			head = aux;
		else 
			tail.next = aux;		
		tail = aux;
		count++;
		if(cliente instanceof Idoso)
			countIdoso++;
	}	
		
	public Cliente dequeue(int id){
		Cliente aux;
		
		if(countIdoso==0){
			aux = dequeueNormal();			
		}
		else{
			if(id<6)
				aux = dequeuePreferencial();
			else{
				aux = dequeueNormal();
				if(verificaIdoso(aux))
					countIdoso--;
			}			
		}
		return aux;
	}
	
	private Cliente dequeueNormal() {
		Node aux = head;
		head = head.next;
		count--;		
		return aux.cliente;
	}		
	
	private Cliente dequeuePreferencial() {
		Cliente aux; 		
		Cliente idoso = null;
		boolean procurando = true;
		int pos = size();
		for(int i=0;i<pos;i++){
			if(procurando){
				aux = dequeueNormal();
				if(verificaIdoso(aux)){
					procurando = false;
					idoso = aux;
				}
				else enqueue(aux);
			}
			else {				
				aux = dequeueNormal();
				if(verificaIdoso(aux))
					countIdoso--;
				enqueue(aux);				
			}		
		}
		countIdoso--;
		return idoso;		
	}
	
	private boolean verificaIdoso(Cliente cliente){
		return cliente instanceof Idoso;
	}
	
	public Cliente head() throws IndexOutOfBoundsException{
		if(count==0) 
			throw new IndexOutOfBoundsException("Não há cliente esperando.");
		return head.cliente;
	}
	
	public int size(){
		return count;
	}
	
	public boolean isEmpty(){
		return count==0;		
	}
	
	public void clear(){
		count=0;
	}	
	
	@Override
	public String toString(){
		if(isEmpty())
			return "Fila vazia";
		else{
			String aux="Fila contém " + count + " clientes, sendo " 
						+ countIdoso + " idoso(s).\n";
			Node n=head;			
			for(int i=0;i<size();i++){
				aux+=n.cliente.toString() + "\n";
				n=n.next;
			}			 
		return aux;
		}
	}
}
