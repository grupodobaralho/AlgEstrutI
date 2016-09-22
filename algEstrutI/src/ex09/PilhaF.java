package ex09;

import tads.LinkedQueueOfInteger;

/*
9. Apresente a implementa��o de um TAD pilha que usa duas filas.
Diga tamb�m qual � o tempo de execu��o das opera��es push e pop.
*/

//Solu��o otimizada que utiliza apenas uma fila
public class PilhaF {
	private LinkedQueueOfInteger fila;
	
	//Construtor
	PilhaF() {
		fila = new LinkedQueueOfInteger();
	}
	
	//M�todos b�sicos de Pilha
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
