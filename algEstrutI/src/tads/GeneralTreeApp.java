package tads;

public class GeneralTreeApp {

	public static void main(String[] args) {
		GeneralTreeOfInteger myTree = new GeneralTreeOfInteger();
		
		//raiz é o 10
		myTree.setRoot(10);
		
		//9, 8 e 7 são filhos do 10
		myTree.add(9, 10);
		myTree.add(8, 10);
		myTree.add(7, 10);
		
		//6, 3 e 0 são filhos do 9
		myTree.add(6, 9);
		myTree.add(3, 9);
		myTree.add(0, 9);

		//5, 4, 2 e 1 são filhos do 8
		myTree.add(5, 8);
		myTree.add(4, 8);
		myTree.add(2, 8);
		myTree.add(1, 8);
		
		//11 é filho do 7
		myTree.add(11, 7);
		
		//12 e 13 são filhos do 11
		myTree.add(12, 11);
		myTree.add(13, 11);
		
		//Prints
		System.out.println("Tamanho após inserções: " + myTree.size());
		System.out.println("\nCaminhamento Pré-Fixado:\n" + myTree.positionsPre());
		System.out.println("\nCaminhamento Pós-Fixado:\n" + myTree.positionsPos());
		System.out.println("\nCaminhamento em Largura:\n" + myTree.positionsWidth());
		
		//remove o branch 7
		myTree.removeBranch(7);
		System.out.println("\n\nTamanho após remoção do branch 7: " + myTree.size());
		System.out.println("\nCaminhamento Pré-Fixado:\n" + myTree.positionsPre());
		System.out.println("\nCaminhamento Pós-Fixado:\n" + myTree.positionsPos());
		System.out.println("\nCaminhamento em Largura:\n" + myTree.positionsWidth());
	}

}
