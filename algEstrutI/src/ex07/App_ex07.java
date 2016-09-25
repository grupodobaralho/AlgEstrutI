package ex07;

import tads.ArrayStackOfInteger;

public class App_ex07 {

	public static void main(String[] args) {
		ArrayStackOfInteger pilha = new ArrayStackOfInteger(1);
		
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
