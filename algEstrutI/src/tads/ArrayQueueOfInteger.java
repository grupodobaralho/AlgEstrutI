package tads;

public class ArrayQueueOfInteger {	
	
	private Integer[] data;
	private int count;
	
	public ArrayQueueOfInteger(){
		data = new Integer[10];
		count = 0;
	}
	
	public ArrayQueueOfInteger(int size){
		data = new Integer[size];
		count = 0;
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
	public void enqueue(Integer element){
		if(count==data.length)
			aumentaData();
		data[count]=element;			
	}
	
	public Integer dequeue(){
		if(count==0)
			throw new IndexOutOfBoundsException("The Queue is empty");
		Integer aux = data[0];
		for(int i=0; i<count-1; i++){
			data[i]=data[i+1];			
		}
		return aux;
	}
	
	public int size(){
		return count;
	}
	
	public boolean isEmpty(){
		if(count==0)return true;
		else return false;
	}
	
	public void clear(){
		count = 0;
	}
	
	public Integer head(){
		if(count==0)
			throw new IndexOutOfBoundsException("The Queue is empty");
		else return data[0];
			
	}
		
}
