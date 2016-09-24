package tads;

public class ArrayListOfInteger {
	
	private Integer[] data;
	private int count = 0;
	
	public ArrayListOfInteger(int size){
		data = new Integer[size];
	}
	
	//duplica o tamanho do Vetor
	public void aumentaData(){
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
	}
	
	//Adiocona elemento no index informado
	public void add(int index, Integer element){
		if(index<0 || index>count)
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
		if(index<0 || index>count)
			throw new IndexOutOfBoundsException("Invalid Index");
		return data[index];
	}
	
	//Troca o valor da posição index por outro e retorna o valor antigo
	public Integer set(int index, Integer element){
		if(index<0 || index>count)
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
	
	
}
