package tads;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GeneralTreeOfInteger {		
	
	private static final class Node{
		
		public Node father;
		public Integer element;
		public ArrayList<Node> subtrees;
		
		public Node(Integer element){
			this.father = null;
			this.element = element;
			subtrees = new ArrayList<>();
		}
		
		public void addSubtree(Node n){
			n.father = this;
			subtrees.add(n);					
		}		
		
		public boolean removeSubtree(Node n){
			n.father = null;
			return subtrees.remove(n);
		}
		
		public Node getSubtree(int i){
			if(i >= 0 && i < subtrees.size()) {
				return subtrees.get(i);
			}
			return null;
		}
		
		public int getSubtreeSize(){
			return subtrees.size();
		}

		@Override
		public String toString() {
			return "Node [father=" + father + ", element=" + element + ", subtrees=" + subtrees + "]";
		}					
	}
	
	private Node root;
	private int count;
	
	//Construtor
	public GeneralTreeOfInteger(){
		root = null;
		count = 0;
	}
	
	//Retorna a referência pro Node que possui element
	private Node searchNodeRef(Integer e){
		return searchNodeRef(e, root);
	}
	
	//método auxiliar recursivo
	private Node searchNodeRef(Integer element, Node target){
		Node n = null;
		if(target != null){
			if(element.equals(target.element)){
				n = target;
			} else {
				int i = 0;
				Node aux = null;
				while(aux == null && i<target.getSubtreeSize()) {
					aux = searchNodeRef(element, target.getSubtree(i));
					i++;
					n = aux;
				}
			}
			return n;
		}
		return null;
	}
	
	
	//insere o elemento e como filho de f
	public boolean add(Integer e, Integer f){
		try{
			searchNodeRef(f).addSubtree(new Node(e));
			count++;
			return true;
		} catch (Exception exc) {
			return false;
		}
	}
	
	//retorna o elemento armazenado na raiz
	public Integer getRoot(){
		if(root != null) {
			return root.element;
		}
		return null;
	}
	
	//cria a raíz, se já existir altera o elemento armazenado na raiz
	public void setRoot(Integer e){
		if(root == null) {
			root = new Node(e);
			count++;
		} else {
			root.element = e;
		}
	}
	
	//retorna o pai do elemento e
	public Integer getParent(Integer e){
		try{
			return searchNodeRef(e).father.element;
		} catch (Exception exc) {
			return null;
		}
	}
	
	//remove o elemento e e seus filhos
	public boolean removeBranch(Integer e){
		try{
			Node n = searchNodeRef(e);
			ArrayList<Integer> lista = new ArrayList<>();
			positionsPosAux(n, lista);
			count = count - lista.size();
			return n.father.removeSubtree(n);
		} catch (Exception exc) {
			return false;
		}
	}
	
	//retorna true se a árvore contém o elemento
	public boolean contains(Integer e){
		try{
			return searchNodeRef(e) != null;
		} catch (Exception exc) {
			return false;
		}
	}
	
	//retorna true se o elemento está armazenado em um nodo interno
	public boolean isInternal(Integer e){
		try{
			return searchNodeRef(e).getSubtreeSize() > 0;
		} catch (Exception exc) {
			return false;
		}
	}
	
	//retorna true se o elemento está armazenado em um nodo externo
	public boolean isExternal(Integer e){
		try{
			return searchNodeRef(e).getSubtreeSize() == 0;
		} catch (Exception exc) {
			return false;
		}
	}
	
	//retorna true se o elemento e está armazenado na raiz
	public boolean isRoot(Integer e){
		try{
			return root.element.equals(e);
		} catch (Exception exc) {
			return false;
		}
	}
	
	//retorna true se a árvore está vazia
	public boolean isEmpty(){
		return count == 0;
	}
	
	//retorna o número de elementos armazenados na árvore
	public int size(){
		return count;
	}
	
	//remove todos os elementos da árvore
	public void clear(){
		root = null;
		count = 0;
	}
	
	
	//retorna uma lista com todos os elementos da árvore na ordem pré-fixada
	public ArrayList<Integer> positionsPre(){
		ArrayList<Integer> lista = new ArrayList<>();
		positionsPreAux(root, lista);
		return lista;
	}
	//método auxiliar pré-fixada
	public void positionsPreAux(Node n, ArrayList<Integer> lista){
		if(n != null){
			lista.add(n.element);
			for(int i=0; i<n.getSubtreeSize(); i++) {
				positionsPreAux(n.getSubtree(i), lista);
			}
		}
	}
	
	
	//retorna uma lista com todos os elementos da árvore na ordem pós-fixada
	public ArrayList<Integer> positionsPos(){
		ArrayList<Integer> lista = new ArrayList<>();
		positionsPosAux(root, lista);
		return lista;
	}
	//método auxiliar pós-fixada
	public void positionsPosAux(Node n, ArrayList<Integer> lista){
		if(n != null){
			for(int i=0; i<n.getSubtreeSize(); i++) {
				positionsPosAux(n.getSubtree(i), lista);
			}
			lista.add(n.element);
		}
	}
		
	//retorna uma lista com todos os elementos da árvore com um caminhamento em largura
	public ArrayList<Integer> positionsWidth(){
		ArrayList<Integer> lista = new ArrayList<>();
		if(root != null){
			Queue<Node> fila = new LinkedList<>();
			Node aux = root;
			fila.offer(aux);
			while(!fila.isEmpty()) {
				aux = fila.poll();
				lista.add(aux.element);
				for(int i=0; i<aux.getSubtreeSize(); i++){
					fila.offer(aux.getSubtree(i));
				}
			}
		}
		return lista;
	}
	
	public ArrayList<Integer> ancestors(Integer e){
		ArrayList<Integer> lista = new ArrayList<>();
		try{
			Node n = searchNodeRef(e);
			while(n != null){
				lista.add(n.element);
				n = n.father;
			}
		} catch (Exception exc) {
			//System.out.println("Mensagem: " + exc);
		}
		return lista;		
	}
}


