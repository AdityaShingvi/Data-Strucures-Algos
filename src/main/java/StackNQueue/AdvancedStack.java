package main.java.StackNQueue;

//Implement a stack such that getMinimum() should be O(1)
public class AdvancedStack {
	private MyStack elemStack = new MyStack(5);
	private MyStack minStack = new MyStack(5);
	
	
	public void push(int data){
		elemStack.push(data);
		if(minStack.isEmpty() || minStack.top() >= data){
				minStack.push(data);
		}
		else{
			minStack.push(minStack.top());
		}
	}
	
	public int pop(){
				minStack.pop();
				return elemStack.pop();
	}
	
	public int getMinimum(){
		return minStack.top();
	}
	
	public boolean isEmpty(){
		return elemStack.isEmpty();
	}

	public static void main(String[] args){
		AdvancedStack stack = new AdvancedStack();
		
		stack.push(10);
		stack.push(50);
		stack.push(5);
		stack.push(100);
		stack.push(5);
		
		System.out.println(stack.getMinimum());
		stack.pop();
		System.out.println(stack.getMinimum());
		stack.pop();
		System.out.println(stack.getMinimum());
		stack.pop();
		System.out.println(stack.getMinimum());
	}
	
}
