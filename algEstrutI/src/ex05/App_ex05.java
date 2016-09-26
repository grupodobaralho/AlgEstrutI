package ex05;

/*O SetTAD modela um conjunto, que � uma estrutura que armazena uma cole��o de elementos que n�o aceita elementos repetidos. Os m�todos do TAD conjunto para n�meros inteiros s�o apresentados a seguir. Escreva uma implementa��o para a classe Set que utilize estruturas encadeadas.
class Set
	//Retorna false se v ja pertence ao conjunto
	boolean insere(Integer valor)
	// Retorna true se v pertence ao conjunto
	boolean pertence(Integer valor)
	// Retorna true se removeu v do conjunto
	boolean retira(Integer valor)
	// Retorna a intersec��o de s com o conjunto corrente
	Set interseccao(Set s)
 * 
 */

//Israel: 
public class App_ex05 {

	public static void main(String[] args) {
		Set set = new Set();
		
		System.out.println("--Inserindo valores em set1:");
		set.insere(1);
		set.insere(2);
		set.insere(3);
		set.insere(4);
		System.out.println(set);
		
		System.out.println("--Verificando se 2 e 5 pertencem:");
		if(set.pertence(2))
			System.out.println("2 pertence");	
		else System.out.println("2 N�o pertence");			
		if(set.pertence(5))
			System.out.println("5 pertence");	
		else System.out.println("5 N�o pertence");		
		
		System.out.println("--Retirando Valores 1 e 5 de set1:");
		set.retira(1);
		set.retira(5);
		System.out.println(set);		
		
		
		System.out.println("--Criando Set2: ");
		Set set2 = new Set();
		set2.insere(6);
		set2.insere(1);
		set2.insere(2);	
		System.out.println(set2);
		
		System.out.println("--Intersec��o de set1 e set2: ");
		Set set3 = set.interseccao(set2);
		System.out.println(set3);	
	}

}
