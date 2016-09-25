package tads;

public class App {

	public static void main(String[] args) {
		
		int prints=0;
		LinkedListOfInteger listaEncadeada = new LinkedListOfInteger(99);
		
		listaEncadeada.add(6);
		listaEncadeada.add(17);
		listaEncadeada.add(22);
		listaEncadeada.add(8);
				
		
		for(int i=0;i<listaEncadeada.size();i++){
			System.out.println(listaEncadeada.get(i));			
		}
		System.out.println("Fim da impressão" + prints);
		prints++;
	
		listaEncadeada.addByIndex(27,3);
		/*
		for(int i=0;i<listaEncadeada.size();i++){
			System.out.println(listaEncadeada.get(i));
		}	
		System.out.println("Fim da impressão");
		
		listaEncadeada.add(4,18);
		
		*/
		listaEncadeada.remove(6);
		listaEncadeada.remove(99);
		listaEncadeada.remove(8);
		
		for(int i=0;i<listaEncadeada.size();i++){
			System.out.println(listaEncadeada.get(i));
		}	
		System.out.println("Fim da impressão" + prints);
		prints++;
		
		System.out.println(listaEncadeada.get(0));
		System.out.println(listaEncadeada.get(listaEncadeada.size()-1));
		
		listaEncadeada.add(78);
		listaEncadeada.addByIndex(24,2);
		listaEncadeada.addByIndex(88,0);
		
		for(int i=0;i<listaEncadeada.size();i++){
			System.out.println(listaEncadeada.get(i));
		}	
		System.out.println("Fim da impressão" + prints);
		prints++;
		
		
		
	}
}
		
	
		
		




