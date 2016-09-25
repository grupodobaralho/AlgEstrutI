package ex07;

import tads.LinkedStackOfInteger;

public class App_ex07_LinkedStack {

	public static void main(String[] args) {
		LinkedStackOfInteger pilha = new LinkedStackOfInteger();
		
		System.out.println(pilha);
		pilha.push(5);
		System.out.println(pilha);
		pilha.push(3);
		System.out.println(pilha);
		pilha.pop();
		System.out.println(pilha);
		pilha.push(2);
		System.out.println(pilha);
		pilha.push(8);
		System.out.println(pilha);
		pilha.pop();
		System.out.println(pilha);
		pilha.pop();
		System.out.println(pilha);
		pilha.push(9);
		System.out.println(pilha);
		pilha.push(1);
		System.out.println(pilha);
		pilha.pop();
		System.out.println(pilha);
		pilha.push(7);
		System.out.println(pilha);
		pilha.push(6);
		System.out.println(pilha);
		pilha.pop();
		System.out.println(pilha);
		pilha.pop();
		System.out.println(pilha);
		pilha.push(4);
		System.out.println(pilha);
		pilha.pop();
		System.out.println(pilha);
		pilha.pop();
		System.out.println(pilha);
	}

}
