package main.java.StackNQueue;

public class MyStack {

	private int top;
	private int capacity;
	private int elem[];
	
	public MyStack(int capacity){
		top = -1;
		this.capacity = capacity;
		elem = new int[capacity];
	}
	
	public boolean isFull(){
		return(top == capacity-1);
	}
	
	public boolean isEmpty(){
		return (top == -1); 
	}
	
	public void push(int num){
		if(isFull())
			System.out.println("Stack Full...");
		else {
			elem[++top] = num;
		}
	}
	
	public int pop(){
		int pop;
		if(isEmpty()){
			System.out.println("Stack Empty...");
			pop = -1;
		}
		else{
			pop = elem[top--];
		}
		return pop;
	}
	
	public void printStack(){
		System.out.println();
		int top1= top;
		while (top1 != -1){
			System.out.print(elem[top1--] + " ");
		}
	}
	
	public void deleteStack(){
		top = -1;
	}
	
	public int top(){
		return (top != -1 ? elem[top] : 0);
	}
	
	public void dynamicPush(int data){
		if(isFull())
			doubleStack();
			elem[++top] = data;
	}
	
	public void doubleStack(){
		int newArray[] = new int[capacity*2];
		System.arraycopy(elem, 0, newArray, 0, capacity);
		capacity = capacity * 2;
		elem = newArray;
	}
	
	//reverse  a stack only using push n pop
	public void reverseStack(MyStack stack){
		if(stack.isEmpty()) return;
		int data = stack.pop();
		reverseStack(stack);
		insertAtBottom(stack,data);
	}
	
	private void insertAtBottom(MyStack stack, int data) {
		if(stack.isEmpty()){
			stack.push(data);
			return;
		}
			int temp = stack.pop();
			insertAtBottom(stack, data);
			stack.push(temp);
		
	}
	
}
