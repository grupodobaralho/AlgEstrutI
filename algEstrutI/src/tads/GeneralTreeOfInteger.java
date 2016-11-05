package tads;

public class GeneralTreeOfInteger {	
	
	
	class Node{
		public Node father;
		public Integer element;
		public LinkedListOfNodes subtrees;
		
		public Node(Integer element){
			this.father = null;
			this.element = element;
			subtrees = new LinkedListOfNodes();
		}
		
		public void addSubtree(Node n){
			n.father = this;
			subtrees.add(n);					
		}		
		
		public boolean removeSubtree(Node n){
			n.father = null;
			return subtrees.remove(n);
		}	
		
		public String toString(){
			
		}
	}
}
