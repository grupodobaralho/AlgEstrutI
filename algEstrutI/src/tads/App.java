package tads;

public class App {

	public static void main(String[] args) {
		
		int prints=0;
		LinkedListOfInteger listaEncadeada = new LinkedListOfInteger();
		
		listaEncadeada.add(6);
		listaEncadeada.add(17);
		listaEncadeada.add(22);
		listaEncadeada.add(8);
		
		System.out.println(listaEncadeada);
		System.out.println("Fim da impressão" + prints + "\n\n");
		prints++;
	
		/*
		System.out.println(listaEncadeada);
		System.out.println("Fim da impressão");
		
		listaEncadeada.add(4,18);
		*/
		
		listaEncadeada.addByIndex(0,27);
		listaEncadeada.remove(6);
		listaEncadeada.remove(99);
		listaEncadeada.remove(8);
		
		System.out.println(listaEncadeada);
		System.out.println("Fim da impressão" + prints + "\n\n");
		prints++;
		
		
		listaEncadeada.add(78);
		listaEncadeada.addByIndex(2,24);
		listaEncadeada.addByIndex(0,88);
		
		System.out.println(listaEncadeada);
		System.out.println("Fim da impressão" + prints + "\n\n");
		prints++;		
	}
}
		
	
		
		




