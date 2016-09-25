package ex01;

import java.util.Random;

/* Descreva as alterações necessárias que deveriam ser feitas nos métodos
 * remove e removeByIndex da classe ListArrayOfInteger para que o arranjo 
 * interno de elementos seja reduzido para metade do tamanho toda vez que
 * o número de itens da lista baixar de N/4 (onde N é o número de elementos
 * da lista).
 */

//ISRAEL:
public class App_ex01 {	
	
	public static void main(String[] args) {		
		Integer[] data = new Integer[8];
		int count = 0;	
		
		Random rand = new Random();	
		
		for(int i=0; i<4; i++){
			data[i] = rand.nextInt(10);
			count++;
		}
		for(int i=0; i<data.length; i++){
			System.out.println(data[i]);
		}
		System.out.println("tamanho do vetor: "+data.length);	
		
		removeByIndex(1, data, count); //não deve diminuir
		count--;
		removeByIndex(1, data, count); //deve diminuir
	}
	
	public static Integer removeByIndex(int index, Integer[] data, int count){
		Integer aux = data[index];
		for(int i=index; i<count-1; i++){
			data[i]= data[i+1];
		}
		count--;
		
		
		for(int i=0; i<data.length; i++){
			System.out.println(data[i]);
		}								
		System.out.println("tamanho do vetor: "+data.length);
		if(count<=data.length/4){                              //Isso deve ser incluído
			Integer[] novo = new Integer[data.length/2];       //O resto é para
			for(int i=0; i<count; i++){                        //fazer teste neste
				novo[i]=data[i];                               //exercício.
			}                                                  //
			data=novo;                                         //
			for(int i=0; i<data.length; i++){
				System.out.println(data[i]);
			}
			
			System.out.println("tamanho do vetor: "+data.length);	
		}
		return aux;	
	}
	

}
