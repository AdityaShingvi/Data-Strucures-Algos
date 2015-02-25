package main.java.LinkedList;


public class MyLinkedList {
	private int data;
	private MyLinkedList next;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public MyLinkedList getNext() {
		return next;
	}
	public void setNext(MyLinkedList node) {
		this.next = node;
	}
	
	public void displayList(MyLinkedList head){
		MyLinkedList current = head;
		System.out.println();
		while(current != null){
				System.out.print(current.getData() + " ");
				current = current.getNext();
		}
	}

	public MyLinkedList reverseList(MyLinkedList head){
		MyLinkedList temp =null, nextNode = null;
		while(head != null){
			nextNode = head.getNext();
			head.setNext(temp);
			temp = head;
			head = nextNode;
		}
		return temp;
	}
	
	public void printListFromEnd(MyLinkedList head){
		if(head == null) return;
		printListFromEnd(head.getNext());
		System.out.print(head.getData() + " ");
	}
	
	public int evenOrOddLength(MyLinkedList head){
		while(head != null && head.getNext() != null){
			
			//increment the pointer 2x times
			head = head.getNext().getNext();
		}
		
		if(head == null)
			return 0;
		return 1;
	}
	
	//given 2 sorted list , merge them into a new sorted list
	public MyLinkedList mergeNsort(MyLinkedList list1, MyLinkedList list2 ){
		MyLinkedList resultList = null;
		if(list1 == null) return list2;
		if(list2 == null) return list1;
		
		if(list1.getData() < list2.getData()){
			resultList = list1;
			resultList.setNext(mergeNsort(list1.getNext(), list2));
		}
		
		if(list2.getData() < list1.getData()){
			resultList = list2;
			resultList.setNext(mergeNsort(list1, list2.getNext()));
		}
		
		return resultList;
		
	}
	
	//reverse the linked list in pairs: i/p = 1 2 3 4 5 6, o/p = 2 1 4 3 6 5
	//recursive approach
	//not working proper
	public void reverseInPairs(MyLinkedList head){
			MyLinkedList temp;
				
		if(head == null || head.getNext() == null) return;
				temp = head.getNext();
				head.setNext(temp.getNext());
				temp.setNext(head);
				reverseInPairs(head.getNext());
				
			displayList(temp);
		}
	
		//reverse the linked list in pairs: i/p = 1 2 3 4 5 6, o/p = 2 1 4 3 6 5
		//iterative approach
		//not working proper
		public void reverseInpairsItereative(MyLinkedList head){
			MyLinkedList temp1, temp2, current = head;
			MyLinkedList head2 = head.getNext();
			while(current  != null && current.getNext() != null){
				
				//swap the pairs
				temp1 = current.getNext();
				temp2 = temp1.getNext();
				
				temp1.setNext(current);
				current.setNext(temp2);
				
				if(current  != null){
					current = current.getNext();
				}
				
			}
			displayList(head2);
			
		}
		
		//split circular linked list in two equal parts
		public void splitCircular(MyLinkedList head){
			MyLinkedList fast = head, slow = head, head1, head2;
			  
			while(fast != head && fast.getNext() != head){
				
				//traverse fast ptr with  double speed and slow ptr with normal speed to find cycle - Floyds algo
				fast = fast.getNext().getNext();
				slow = slow.getNext();
			}
			
			if(fast.getNext().getNext() == head){
				fast = fast.getNext();
			}
			
			head1 = head;
			
			if(head.getNext() != head)
				head2 = slow.getNext();
			
			fast.setNext(slow.getNext());
			slow.setNext(head1);
		}
		
}
