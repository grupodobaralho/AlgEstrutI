package ex10;

import tads.LinkedStackOfInteger;

/*
 * Apresente a implementação de um TAD fila que usa duas pilhas. 
 * Diga também qual é o tempo de execução das operações enqueue e dequeue.
 */

//Israel:
public class FilaDuasPilhas {
	
	LinkedStackOfInteger pilha1;
	LinkedStackOfInteger pilha2;
	
	public FilaDuasPilhas(){
		pilha1 = new LinkedStackOfInteger();
		pilha2 = new LinkedStackOfInteger();
	}
	
	public void enqueue(Integer element){
		pilha1.push(element);
	}
	
	public Integer dequeue(){		
		if(pilha1.isEmpty())
			throw new IndexOutOfBoundsException("Cannot dequeue, queue is empty");
		while(!pilha1.isEmpty()){
			pilha2.push(pilha1.pop());
		}
		Integer aux = pilha2.pop();
		while(!pilha2.isEmpty()){
			pilha1.push(pilha2.pop());
		}
		return aux;
	}
	
	public int size(){
		return pilha1.size();
	}
	
	public boolean isEmpty(){
		return pilha1.isEmpty();		
	}
	
	public void clear(){
		pilha1.clear();
	}
	
	public Integer head(){
		if(pilha1.isEmpty())
			throw new IndexOutOfBoundsException("Cannot head, queue is empty");
		while(!pilha1.isEmpty()){
			pilha2.push(pilha1.pop());
		}
		Integer aux = pilha2.pop();
		pilha1.push(aux);
		while(!pilha2.isEmpty()){
			pilha1.push(pilha2.pop());
		}
		return aux;		
	}
	
	

}
