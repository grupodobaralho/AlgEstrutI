package tads;

public class App {

	public static void main(String[] args) {
		
		LinkedListOfInteger listaEncadeada = new LinkedListOfInteger(99);
		
		listaEncadeada.add(6);
		listaEncadeada.add(17);
		listaEncadeada.add(22);
		listaEncadeada.add(8);
				
		for(int i=0;i<listaEncadeada.size();i++){
			System.out.println(listaEncadeada.get(i));			
		}
		System.out.println("Fim da impressão");
	
		listaEncadeada.addByIndex(27,3);
		
		for(int i=0;i<listaEncadeada.size();i++){
			System.out.println(listaEncadeada.get(i));
		}	
		System.out.println("Fim da impressão");
		
		listaEncadeada.add(4,18);
		for(int i=0;i<listaEncadeada.size();i++){
			System.out.println(listaEncadeada.get(i));
		}	
		System.out.println("Fim da impressão");
	}
}
		
	
		
		




