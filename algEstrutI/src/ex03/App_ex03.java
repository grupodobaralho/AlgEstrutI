package ex03;

/* Considere que duas instâncias de ListArrayOfInteger foram criadas e inicializadas com 100 valores aleatórios, e apresente o
 * algoritmo necessário para descobrir e mostrar qual o maior valor que está armazenado nas duas listas simultaneamente. No
 * exemplo abaixo, com listas de 5 elementos, o maior valor armazenado nas duas é 07.
 * L1: 04,12,07,30,20
 * L2: 50,07,04,21,33
 */


import java.util.Random;
import tads.ArrayListOfInteger;

public class App_ex03 {

	public static void main(String[] args) {
		ArrayListOfInteger l1 = new ArrayListOfInteger();
		ArrayListOfInteger l2 = new ArrayListOfInteger();
		Random rand = new Random();
		
		for (int i=0; i<100; i++) {
			l1.add(rand.nextInt(100));
			l2.add(rand.nextInt(100));
		}
		
		System.out.println(l1);
		System.out.println(l2);
		
		int aux = -1;
		for(int i=0; i<l1.size(); i++) {
			for(int j=0; j<l2.size(); j++) {
				if(l1.get(i)==l2.get(j)) {
					if(l1.get(i) > aux) {
						aux = l1.get(i);
						break;
					}
				}
			}
		}
		
		System.out.println("\n\nMaior valor que está armazenado nas duas listas simultaneamente:\n" + aux);

	}

}

/*
//Israel: 

import java.util.Random;
import tads.ArrayListOfInteger;


public class App_ex03 {
	
	public static void main(String[] args){
		ArrayListOfInteger lista1 = new ArrayListOfInteger();
		ArrayListOfInteger lista2 = new ArrayListOfInteger();
		
		Random gera = new Random();
		
		for(int i=0; i<100; i++){
			lista1.add(gera.nextInt(100));
			lista2.add(gera.nextInt(100));
		}
		
		Integer maior=-1;
		for(int i=0; i<100; i++){			
			for(int j=0; j<100; j++){
				if(lista1.get(i)== lista2.get(j)){					
					if(maior<lista1.get(i)){
						maior = lista1.get(i);
						break;
					}
				}
			}
		}	
		System.out.println("lista1: \n"+ lista1);
		System.out.println("lista2: \n"+ lista2);
		System.out.println("maior: " + maior);//return maior; 
	}
}	
*/


















