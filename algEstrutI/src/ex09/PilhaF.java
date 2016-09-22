package ex09;

import tads.LinkedQueueOfInteger;

/*
9. Apresente a implementação de um TAD pilha que usa duas filas.
Diga também qual é o tempo de execução das operações push e pop.
*/

//Solução otimizada que utiliza apenas uma fila
public class PilhaF {
	private LinkedQueueOfInteger fila;
	
	//Construtor
	PilhaF() {
		fila = new LinkedQueueOfInteger();
	}
	
	//Métodos básicos de Pilha
	// O(1)
	void push(int i) {
		fila.enqueue(i);
	}
	
	// O(n)
	int pop() {
		int aux = fila.size();
		for(int i=0; i<aux-1; i++)
			fila.enqueue(fila.dequeue());
		return fila.dequeue();
	}
	
	int top() {
		int aux = pop();
		push(aux);
		return aux;
	}
	
	int size() {
		return fila.size();
	}
	
	boolean isEmpty() {
		return fila.isEmpty();
	}
	
	void clear() {
		fila.clear();
	}
	
	//toString
	@Override
	public String toString() {
		return fila.toString();
	}
}
