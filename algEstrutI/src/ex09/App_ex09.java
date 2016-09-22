package ex09;

public class App_ex09 {

	public static void main(String[] args) {
		PilhaF p = new PilhaF();
		
		//inicializando a pilha
		p.push(3);
		p.push(5);
		p.push(8);
		p.push(2);
		System.out.println("Pilha inicial:\n" + p);
		System.out.println("size: " + p.size());
		System.out.println("isEmpty: " + p.isEmpty());
		System.out.println("top: " + p.top());
		System.out.println("pop: " + p.pop());
		
		System.out.println("\n\nPilha após o pop:\n" + p);
		System.out.println("size: " + p.size());
		System.out.println("isEmpty: " + p.isEmpty());
		System.out.println("top: " + p.top());
		
		System.out.println("\n\nclear...");
		p.clear();
		System.out.println("size: " + p.size());
		System.out.println("isEmpty: " + p.isEmpty());
		//Mostra a exceção definida na classe LinkedQueueOfInteger
		//System.out.println("top: " + p.top());
	}

}
