package main.java.StackNQueue;

import java.util.LinkedList;
import java.util.List;

//You can use the dafault linklist class or this MyLinkedList for implementing stack
//import main.java.LinkedList.MyLinkedList;

public class LLStack {
	List<Integer> headNode = null;
	
	public LLStack(){
		this.headNode = new LinkedList<Integer>();
	}
	
	public boolean isEmpty(){
		return (this.headNode.isEmpty());
	}
	
	public void push(int data){
		
		if(isEmpty()) {
			this.headNode = new LinkedList<Integer>();
			this.headNode.add(0, data);
		}
		else {
			this.headNode.add(0, data);
		}
	}
		
		public int pop(){
			int data = 0;
			if(isEmpty()) {
				System.out.println("Stack underflow .... ");
				return data;
			}
			for(Integer i :this.headNode){
				data = i;
				this.headNode.remove(i);
				break;
			}
			return data;
	}
		
	public int top(){
		int top;
		if (isEmpty()) return -1;
		top = this.headNode.get(0);
		return top;
	}	
	
	public void deleteStack(){
		this.headNode = null;
	}
	
	public void printStack(){
		
		for (Integer i :this.headNode){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		LLStack stack = new LLStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.printStack();
		stack.pop();
		stack.printStack();
		stack.pop();
		stack.pop();
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.pop();
		stack.pop();
		stack.printStack();
		stack.pop();
		stack.pop();
		stack.pop();
		
	}
}
