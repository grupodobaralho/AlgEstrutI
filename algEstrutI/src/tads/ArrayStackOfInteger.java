package tads;

public class ArrayStackOfInteger {
	private Integer data[];
	private int count=0;
	
	public ArrayStackOfInteger(){
		data = new Integer[10];
	}
	
	public ArrayStackOfInteger(int size){
		data = new Integer[size];
	}
	
	//duplica o tamanho da lista quando estiver cheia
	private void aumentaData(){
		Integer aux[]= new Integer[data.length*2]; 
		for(int i=0; i<data.length; i++){
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
	public int pop(){
		if(count==0) throw new IndexOutOfBoundsException("Pilha vazia. Na próxima vez, compre Duracell!");
		count--;
		return data[count];
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
		String aux = "";
		for(int i=0; i<count; i++){
			aux = aux + data[count-1-i] + "\n";
		}
		return aux;
	}
		
}
