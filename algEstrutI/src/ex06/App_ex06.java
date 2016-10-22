package ex06;

public class App_ex06 {

	public static void main(String[] args) {
		LinkedListOfSignInt listaComSinal = new LinkedListOfSignInt();
		
		listaComSinal.add(-1);
		listaComSinal.add(0);
		listaComSinal.add(1);
		listaComSinal.add(-2);
		listaComSinal.add(2);
		listaComSinal.add(3);
		listaComSinal.add(-3);
		listaComSinal.add(-4);
		listaComSinal.add(-5);
		listaComSinal.add(4);
		listaComSinal.add(5);
		listaComSinal.add(6);
		listaComSinal.add(7);
		listaComSinal.add(8);
		listaComSinal.add(-6);
		listaComSinal.add(-7);
		listaComSinal.add(-8);
		listaComSinal.add(-9);
		listaComSinal.add(-10);
		listaComSinal.add(9);
		
		System.out.println("\nsoNegativos\n" + listaComSinal.soNegativos());
		
		System.out.println("\nsoPositivos\n" + listaComSinal.soPositivos());
		
		System.out.println("listaComSinal.size(): " + listaComSinal.size());		
		

		//Imprime toda a lista até encontrar uma referência nula
		/*for(int i =0; i<listaComSinal.size(); i++) {
			System.out.println("\nlistaComSinal.get("+i+").element\n" + listaComSinal.getNode(i).element +
				"\nlistaComSinal.get("+i+").nextNeg.element\n" + listaComSinal.getNode(i).nextNeg.element +
				"\nlistaComSinal.get("+i+").nextPos.element\n" + listaComSinal.getNode(i).nextPos.element);
		}*/
		
	}

}
