package ex05;

//Israel:

import tads.LinkedListOfInteger;

public class Set{
	
	LinkedListOfInteger lista;
	
	public Set(){
		lista = new LinkedListOfInteger();		
	}
	
	//Retorna false se v ja pertence ao conjunto
	public boolean insere(Integer valor){
		if(lista.contains(valor))
			return false;
		lista.add(valor);
		return true;		
	}
	
	//Retorna true se v pertence ao conjunto
	public boolean pertence(Integer valor){
		return lista.contains(valor);		
	}
	
	//Retorna true se removeu v do conjunto
	public boolean retira(Integer valor){
		return lista.remove(valor);		
	}
	
	//Retorna a intersecção
	public Set interseccao(Set s){
		Set n = new Set();
		for(int i=0; i<lista.size(); i++){
			if(s.pertence(lista.get(i))){
				n.insere(lista.get(i));
			}
		}
		return n;
	}

	@Override
	public String toString() {
		return lista.toString();
	}
		
}