package ex03;

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
