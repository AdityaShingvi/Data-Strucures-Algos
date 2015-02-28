package main.java.LinkedList;

public class LLDemo {

	public static void main(String[] args) {
		
		//list 1
		MyLinkedList list = new MyLinkedList();
		list.setData(10);
		MyLinkedList list1 = new MyLinkedList();
		list1.setData(20);
		list.setNext(list1);
		MyLinkedList list2 = new MyLinkedList();
		list2.setData(40);
		list1.setNext(list2);
		MyLinkedList list3 = new MyLinkedList();
		list3.setData(60);
		list2.setNext(list3);
		MyLinkedList list4 = new MyLinkedList();
		list4.setData(70);
		list3.setNext(list4);
		MyLinkedList list5 = new MyLinkedList();
		list5.setData(80);
		list4.setNext(list5);
		list5.setNext(null);
		
		//list2
		MyLinkedList alist = new MyLinkedList();
		alist.setData(1);
		MyLinkedList alist1 = new MyLinkedList();
		alist1.setData(2);
		alist.setNext(alist1);
		MyLinkedList alist2 = new MyLinkedList();
		alist2.setData(4);
		alist1.setNext(alist2);
		MyLinkedList alist3 = new MyLinkedList();
		alist3.setData(6);
		alist2.setNext(alist3);
		MyLinkedList alist4 = new MyLinkedList();
		alist4.setData(9);
		alist3.setNext(alist4);
		alist4.setNext(null);
		
		//print list
		//list.displayList(list);
		
		//reverse n print
		//list = list.reverseList(list);
		//list.displayList(list);
		
		//print from end
		//list.printListFromEnd(list);
		
		//MyLinkedList newList = new MyLinkedList();
		//newList.displayList(newList.mergeNsort(list, alist));
		
		//MyLinkedList newList = new MyLinkedList();
		//newList.displayList(newList.reverseInPairs(alist));
		//list.reverseInpairsItereative(list);
		
		System.out.println(list.compare(alist, list));
	}

}
