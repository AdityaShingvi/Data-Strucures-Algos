package main.java.StackNQueue;

public class StackDemo {

	public static void main(String[] args) {

		MyStack stack = new MyStack(10);
		stack.push(5);
		stack.push(8);
		stack.push(2);
		stack.push(9);
		//stack.dynamicPush(3);
		stack.push(91);
		stack.push(92);
		stack.push(93);
		stack.push(94);
		
//		stack.printStack();
		//stack.pop();
	//	stack.printStack();
		/*stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();*/
		//stack.printStack();
		
		stack.reverseStack(stack);
		stack.printStack();
	}

}
