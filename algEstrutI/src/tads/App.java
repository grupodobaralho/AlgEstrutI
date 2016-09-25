package tads;

public class App {

	public static void main(String[] args) {
		
		int prints=0;
		LinkedListOfInteger listaEncadeada = new LinkedListOfInteger(99);
		
		listaEncadeada.add(6);
		listaEncadeada.add(17);
		listaEncadeada.add(22);
		listaEncadeada.add(8);
		
		System.out.println(listaEncadeada);
		System.out.println("Fim da impressão" + prints);
		prints++;
	
		listaEncadeada.addByIndex(27,3);
		/*
		System.out.println(listaEncadeada);
		System.out.println("Fim da impressão");
		
		listaEncadeada.add(4,18);
		*/
		
		
		listaEncadeada.remove(6);
		listaEncadeada.remove(99);
		listaEncadeada.remove(8);
		
		System.out.println(listaEncadeada);
		System.out.println("Fim da impressão" + prints);
		prints++;
		
		
		listaEncadeada.add(78);
		listaEncadeada.addByIndex(24,2);
		listaEncadeada.addByIndex(88,0);
		
		System.out.println(listaEncadeada);
		System.out.println("Fim da impressão" + prints);
		prints++;		
	}
}
		
	
		
		




