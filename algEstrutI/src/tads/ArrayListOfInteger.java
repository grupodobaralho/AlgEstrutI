package tads;

public class ArrayListOfInteger {
	
	private Integer[] data;
	private int count;
	
	public ArrayListOfInteger(){
		data = new Integer[10];
		count =0;
	}
	
	public ArrayListOfInteger(int size){
		data = new Integer[size];
		count =0;
	}
	
	//duplica o tamanho do Vetor
	private void aumentaData(){
		Integer[] nData = new Integer[data.length*2];
		for(int i=0; i<data.length; i++){
			nData[i] = data[i];		
		}
		this.data = nData;		
	}
	
	//Adiciona elemento no final
	public void add(Integer element){
		if(count==data.length)
			aumentaData();
		data[count] = element;
		count++; //incrementa o contador
	}
	
	//Adiciona elemento no index informado
	public void addByIndex(int index, Integer element){
		if(index<0 || index>=count)
			throw new IndexOutOfBoundsException("Invalid Index");
		if(count==data.length)
			aumentaData();
		for(int i=count; i>index; i--)
			data[i] = data[i-1];
		data[index] = element;
		count++;
	}
	
	//Retorna o valor na posição do index informado
	public Integer get(int index){
		if(index<0 || index>=count) // adicionei igualdade na segunda parte. O vetor só está prenchido até o index count-1
			throw new IndexOutOfBoundsException("Invalid Index");		
		return data[index];
	}
	
	//Troca o valor da posição index por outro e retorna o valor antigo
	public Integer set(int index, Integer element){
		if(index<0 || index>=count) //idem anterior
			throw new IndexOutOfBoundsException("Invalid Index");
		Integer aux = data[index];
		data[index] = element;
		return aux;			
	}
	
	//Remove um elemento do vetor e reposiciona os demais retornando true se o valor foi encontrado
	public boolean remove(Integer element){		
		for(int i=0; i<count; i++){
			if(data[i]==element){
				for(int j=i; j<count-1; j++){
					data[j]=data[j+1];					
				}
				count--;
				return true;
			}
		}
		return false;
	}
	
	//Remove um elemento do vetor pelo índice e retorna o elemento que estava lá
	public Integer removeByIndex(int index){
		Integer aux = data[index];
		for(int i=index; i<count-1; i++){
			data[i]= data[i+1];
		}
		count--;
		return aux;	
	}
	
	//Retorna o número de elementos armazenados na lista
	public int size(){
		return count;
	}
	
	//Retorna true se a lista contém o elemento
	public boolean contains(Integer e){
		for(int i=0; i<count; i++){
			if(data[i]==e){
				return true;
			}
		}
		return false;
	}
	
	//indexOf(e): retorna a posição onde o elemento está na lista
	public int indexOf(Integer e){
		for(int i=0; i<count; i++){
			if(data[i]==e){
				return i;
			}
		}
		return -1; //não achou
	}
	
	//remove todos os elementos da lista
	public void clear(){
		count=0;
	}
	
	/* int[] subList(int fromIndex, int toIndex), que retorna um arranjo com os elementos da lista original 
	 * entre fromIndex (inclusivo) e toIndex (exclusivo).
	 */
	public Integer[] subList(int fromIndex, int toIndex){
		if(fromIndex<0 || toIndex>=count) throw new IndexOutOfBoundsException("Invalid Index");
		Integer []aux = new Integer[toIndex-fromIndex+1];
		for(int i = fromIndex, j=0; i<=toIndex;i++, j++){
			aux[j]=data[i];
		}
		return aux;
	}
	
	/*void reverse(), que inverte o conteúdo da lista.*/
	public void reverse(){
		Integer aux[]= new Integer[size()];
		for(int i=0, j=count-1; i<count; i++, j--){
			aux[i] = data[j];
		}
			data = aux;
	}
		
	/*
	 *  int contaOcorrencias(int element)
	 * conta o número de ocorrências do elemento passado como parâmetro na lista, retornando este valor */
	public int contaOcorrências(int element){
		int ocorrencias = 0;
		for(int i : data){
			if(data[i]==element) ocorrencias++;
		}
		return ocorrencias;
	}
	
	public boolean isEmpty(){
		return count==0;
	}

	//toString
	@Override
	public String toString() {
		String aux = "";
		for(int i=0; i<count; i++) {
			aux += (data[i] + "\n");
		}
		return aux;
	}

}
