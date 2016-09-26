package ex02;

import java.util.Random;

/*Considerando a classe ListArrayOfInteger apresentada, mostre como seria a 
 *implementação dos métodos addFirst e removeFirst para esta classe.
 */

public class App_ex02 {

	public static void main(String[] args) {	
		
		
		
		
		
		
		
		/*
		Integer[] data = new Integer[10];
		int count = 0;	
		
		Random rand = new Random();	
		
		for(int i=0; i<data.length; i++){
			data[i] = rand.nextInt(10);
			count++;
		}
		for(int i=0; i<data.length; i++){
			System.out.println(data[i]);
		}
		
		addFirst(data, count, 5);		
		System.out.println("Elemento retornado: "+ removeFirst(data, count));
	}
	
	private static Integer[] aumentaData(Integer[] data){
		Integer[] nData = new Integer[data.length*2];
		for(int i=0; i<data.length; i++){
			nData[i] = data[i];		
		}
		return nData;		
	}
	
	//o static e os parâmetros "data e count" foram incluíds somente para possibilitar teste
	public static void addFirst(Integer[] data, int count, Integer element){
		if(count==data.length)
			data = aumentaData(data);
		for(int i=count; i>=0; i--){
			data[i+1] = data[i];			
		}
		data[0] = element;
		count++;
		
		/////////////Printando para testar:
		System.out.println("após addFirst: ");
		for(int i=0; i<data.length; i++){
			System.out.println(data[i]);
		}		
	}
	
	//o static e os parâmetros "data e count" foram incluíds somente para possibilitar teste
	public static Integer removeFirst(Integer[] data, int count){		
		if(count==0)
			throw new IndexOutOfBoundsException("Cannot removeFirst, List is empty.");	
		Integer element = data[0];
		for(int i=0; i<count-1; i++){			
			data[i] = data[i+1];
		}
		count--;
		
		/////////////Printando para testar:
		System.out.println("após removeFirst: ");
		for(int i=0; i<data.length; i++){
			System.out.println(data[i]);
		}	
		return element;
		*/
		
	}
}
