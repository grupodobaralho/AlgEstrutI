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
		return lista.get(lista.size()-1);		
	}
	
	//retorna o número de elementos da pilha
	public int size(){
		return lista.size();
	}
		
	//retorna true se a pilha estiver vazia, e false caso contrário		
	public boolean isEmpty(){
		return lista.isEmpty();
	}
		
	//esvazia a pilha
	public void clear(){
		lista.clear();
	}
	
	@Override
	public String toString(){
		return lista.toString();
		
	}
}
