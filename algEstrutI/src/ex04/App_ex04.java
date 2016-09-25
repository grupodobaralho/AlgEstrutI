package ex04;

import tads.LinkedListOfInteger;

/*Considerando a classe LinkedListOfInteger trabalhada em aula, mostre como seria 
 * a implementa��o de um m�todo int[] toArray() para esta classe. Este m�todo retorna 
 * um arranjo contendo todos os elementos da lista (do primeiro ao �ltimo) e n�o pode
 * usar o m�todo get() j� implementado.
 */

//Israel:
public class App_ex04 {

	public static void main(String[] args) {
		LinkedListOfInteger linkedL = new LinkedListOfInteger();	
		linkedL.add(1);
		linkedL.add(2);
		linkedL.add(3);
		linkedL.add(4);
		
		int[] array = linkedL.toArray();
		
		System.out.println("Printando a Lista: ");
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
		
		
	}
	
	//m�todo inclu�do na classe LinkedListOfInteger:	
	/*
	   public int[] toArray(){
		if(count==0)
			throw new IndexOutOfBoundsException("The list is empty");
		int[] array = new int[count];
		Node aux = head;
		for(int i=0; i<count; i++){
			array[i] = aux.element;
			aux = aux.next;
		}
		return array;
	}
	 */

}
