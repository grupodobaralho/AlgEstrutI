package tads;

public class ArrayStackOfInteger {
	private ArrayListOfInteger lista;
	private int top;
	private int count=0;
	
	public ArrayStackOfInteger(int size){
		lista = new ArrayListOfInteger(size);
	}
	
	//insere o elemento e no topo da pilha
	public void push(Integer e){		
		lista.add(e);
		count++;
	}
	
	//remove e retorna o elemento do topo da pilha, e dá erro se a pilha estiver vazia
	public void pop(){
		if(lista.size()<=0) throw new IndexOutOfBoundsException("Pilha vazia");
		lista.removeByIndex(lista.size()-1);		
	}
	
	//retorna, mas não remove, o elemento do topo da pilha, e dá erro se a pilha estiver vazia
	public Integer top(){
		if(lista.size()<=0) throw new IndexOutOfBoundsException("Pilha vazia");
		
		return count;
		
	}
	
	/*
	//retorna o número de elementos da pilha
	size():
		
	//retorna true se a pilha estiver vazia, e false caso contrário
		
	isEmpty():
		
	//esvazia a pilha
	clear(): 
	*/
}
