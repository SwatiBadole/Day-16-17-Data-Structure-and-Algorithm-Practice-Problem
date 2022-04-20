package com.bridgelabz.LL;


public class LL {
	
	Node head;
	private int size;
	
	LL(){
		this.size=0;
	}
	
	
	
	class Node{
          String data;
	      Node next;
	 
	 Node(String data){
		  this.data=data;
		  this.next=null;
		  size++;
	 }
  }
	
//add the node -first
	public void addFrist(String data) {
		Node newNode=new Node(data);
		if(head == null) {
			head=newNode;
			return;
		}
	
		newNode.next=head;
		head=newNode;
	}
//add the node last
	
	public void addLast(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node currNode=head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		currNode.next=newNode;
	}
//print the node	
	public void printList() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		Node currNode=head;
		 while(currNode!=null) {
			 System.out.print(currNode.data+"->");
			 currNode=currNode.next;
		 }
		 System.out.println("Null");
		
	}
//delete the node at frist
	public void deleteFrist() {
		if(head==null) {
			System.out.println("the list is empty");
			return;
			
		}
		size--;
		head=head.next;
	}
//delete node at the last
	public void deleteLast() {
		if(head==null) {
			System.out.println("the list is empty");
			return;
		}
		size --;
		if(head.next==null) {
			head=null;
			return;
		}
		Node secondLast=head;
		Node lastnode=head.next;
		while(lastnode.next!=null) {
			lastnode=lastnode.next;
			secondLast=secondLast.next;
		}
		secondLast.next=null;
	}
	
	public void AtPosition() {
		
	}
	public int getSize() {
		return size;
	}
	
	
	public static void main(String[] args) {
		LL list=new LL();
		
		list.addFrist("a");
		list.addFrist("is");
		list.printList();
		
		list.addLast("list");
		list.printList();
		
		list.addFrist("This");
		list.printList();
		
		list.deleteLast();
		list.printList();
		
		System.out.println(list.getSize());
		list.addLast("list");
		list.printList();
		
		System.out.println(list.getSize());
		
	    list.deleteLast();
	    list.printList();
	    
	    list.addLast("Linkedlist");
		list.printList();
	
		System.out.println(list.getSize());
		
		list.deleteFrist();
		list.printList();
		
		list.deleteFrist();
		list.printList();
		
		list.deleteFrist();
		list.printList();
		
		list.deleteFrist();
		list.printList();
		System.out.println(list.getSize());
		

	}


}
