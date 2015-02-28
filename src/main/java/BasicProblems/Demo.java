package main.java.BasicProblems;

import main.java.LinkedList.MyLinkedList;


public class Demo {


	public int isStringPalindrome(String input){
		int i=0, j=input.length()-1;
		char[] a  = input.toCharArray();
		while(i < j && a[i] == a[j]){
			i++;
			j--;
		}
		if(i<j) return 0;
		else return 1;
		
	}
	
	public boolean compare(MyLinkedList head1,MyLinkedList head2){
		boolean isEqual = true;
		
		while(head1  !=  head2){
			System.out.println(head1.getData() + " &&& " + head2.getData());
			if(head1.getData() == head2.getData()){
				System.out.println(head1.getData() + " & " + head2.getData());
				head1 = head1.getNext();
				head2 = head2.getNext();
			}
			else{
				isEqual = false;
				break;
			}
		}
		return isEqual;
	}
	
	
	public boolean isListPalindrome(MyLinkedList head){

		MyLinkedList node= head, fstptr = head, slowptr = head, temp, nextnode;
		
		//find center of list
		while (fstptr != null && fstptr.getNext() != null){
			fstptr = fstptr.getNext().getNext();
			slowptr = slowptr.getNext();
		}
		
		//check if even number of nodes or odd
		if(fstptr  == null){
			node=slowptr;
		}
		else{
			node=slowptr.getNext();
		}
		
			//now reverse second half of the list
				temp = slowptr;
				//nextnode = temp.getNext();
				nextnode = node;
				
				///reverse second half of list
				while(node != null){
					nextnode = nextnode.getNext();
					node.setNext(temp);
					temp = node;
					if(nextnode == null) break;
					node=nextnode;
				}
				
								
				//compare first half n second half
				boolean isEqual = compare(head, node);
				if(isEqual){
					System.out.println("Palindrome");
					return isEqual;
				}
				else{
						System.out.println("Not Palindrome");
				return isEqual;
				}
	}
	
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		MyLinkedList list = new MyLinkedList();
		list.setData(10);
		MyLinkedList list2 = new MyLinkedList();
		list2.setData(20);
		list.setNext(list2);
		MyLinkedList list3 = new MyLinkedList();
		list3.setData(30);
		list2.setNext(list3);
		MyLinkedList list33 = new MyLinkedList();
		list33.setData(30);
		list3.setNext(list33);
		MyLinkedList list4 = new MyLinkedList();
		list4.setData(20);
		list3.setNext(list4);
		MyLinkedList list5 = new MyLinkedList();
		list5.setData(10);
		list4.setNext(list5);
		list5.setNext(null);
		
		System.out.println(demo.isListPalindrome(list));

	}

}
