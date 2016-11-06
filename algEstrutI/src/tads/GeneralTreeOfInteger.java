package tads;

public class GeneralTreeOfInteger {	
	
	
	public static final class Node{
		
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

		@Override
		public String toString() {
			return "Node [father=" + father + ", element=" + element + ", subtrees=" + subtrees + "]";
		}			
		
	}
}
