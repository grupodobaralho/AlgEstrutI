package tads;

public class ArrayStackOfInteger {
	private Integer data[];
	private int top;
	private int count=0;
	
	public ArrayStackOfInteger(int size){
		data = new Integer[size];
	}
	
	//duplica o tamanho da lista quando estiver cheia
	public void aumentaData(){
		Integer aux[]= new Integer[data.length*2]; 
		for(Integer i : data){
			aux[i] = data[i];
		}
		data = aux;
	}
	
	//insere o elemento e no topo da pilha
	public void push(Integer e){		
		if(count==data.length){
			aumentaData();
		}
		data[count]=e;
		count++;
	}
	
	//remove e retorna o elemento do topo da pilha, e dá erro se a pilha estiver vazia
	public void pop(){
		if(count==0) throw new IndexOutOfBoundsException("Pilha vazia. Na próxima vez, compre Duracell!");
		count--;
	}
	
	//retorna, mas não remove, o elemento do topo da pilha, e dá erro se a pilha estiver vazia
	public Integer top(){
		if(count==0) throw new IndexOutOfBoundsException("Pilha vazia. Na próxima vez, compre Duracell!");
		return data[count-1];		
	}
	
	//retorna o número de elementos da pilha
	public int size(){
		return count;
	}
		
	//retorna true se a pilha estiver vazia, e false caso contrário		
	public boolean isEmpty(){
		return count==0;
	}
		
	//esvazia a pilha
	public void clear(){
		count=0;
	}
	
	@Override
	public String toString(){
		String aux ="";
		for(Integer i : data){
			aux = aux + data[i] + "\n";
		}
		return aux;
	}
		
}
