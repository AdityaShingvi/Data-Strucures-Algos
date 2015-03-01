package main.java.StackNQueue;

public class MyQueue {

	public int front;
	public int rear;
	public int capacity;
	public int[] array;
	
	private MyQueue(int size){
		this.capacity = size;
		front = -1;
		rear = -1;
		array = new int[size];
	}
	
	public MyQueue createQueue(int size){
		return new MyQueue(size);
	}
	
	public boolean isEmpty(){
		return (front == -1);
	}
	
	public boolean isFull(){
		return ((rear+1)%capacity == front);
	}
	
	public int getSize(){
		return ((capacity-front+rear+1%capacity));
	}
	
	public void enQ(int data){
		if(isFull()){
			//throw new Exception();
			System.out.println("Queue overflow .... ");
			return;
		}
		else {
			rear = (rear + 1)%capacity;
			array[rear] = data;
			if (front == -1){
				front = rear;
			}
		}
	}
	
	public int deQ(){
		int data;
		if (isEmpty()){
			//throw Exception
			return 0;
		}else {
			data = array[front];
			if(front == rear){
				front = rear - 1;
			}else {
				front = (front + 1)%capacity;
			}	
		}
		return data;
		}
		
	public void dynamicEnQ(int data){
		if(isFull()){
			resize();
		}
		rear = rear + 1 % capacity;;
		array[rear] = data;
		if(front == -1)
			front = rear;
	}
	
	public void resize(){
		int initCapacity = capacity;
		capacity = capacity * 2;
		int[] oldArr = array;
		array = new int[capacity * 2];
		for (int i=0;i<initCapacity;i++){
			array[i] = oldArr[i];
		}
		
		//make sure front and rear point at correct indexes in the new array
		if(rear < front ){
			for (int i=0; i < front; i++){
				array[i+initCapacity] = array[i];
			}
			rear = rear + initCapacity;
	}
		
		
	}
	
	public static void main(String[] args) {
		MyQueue q = new MyQueue(4);
		q.enQ(250);
		q.enQ(200);
		q.enQ(120);
		q.enQ(220);
		System.out.println(q.deQ());
		System.out.println(q.deQ());
		System.out.println(q.deQ());
		q.enQ(770);
		q.enQ(570);
		q.enQ(770);
		q.enQ(770);
		q.dynamicEnQ(770);
		q.enQ(770);
		q.enQ(770);
		q.enQ(770);
	}

}