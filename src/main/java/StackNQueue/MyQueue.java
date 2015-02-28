package main.java.StackNQueue;

public class MyQueue {

	private int front = -1;
	private int rear = -1;
	private int capacity;
	private int[] array;
	
	private MyQueue(int size){
		this.capacity = size;
		front = -1;
		rear = -1;
		array = new int[size];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
