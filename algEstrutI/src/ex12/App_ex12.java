package ex12;

//Israel:
import tads.ArrayStackOfInteger;

public class App_ex12 {

	public static void main(String[] args) {
		ArrayStackOfInteger stack1 = new ArrayStackOfInteger();
		ArrayStackOfInteger stack2 = new ArrayStackOfInteger();
		
		//1 representa J
		//2 representa A
		//3 representa V
		//4 representa A
		
		stack1.push(1);	
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		
		stack2.push(stack1.pop());
		stack2.push(stack1.pop());
		stack2.push(stack1.pop());
		stack2.push(stack1.pop());
		
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		
	}
		
}
