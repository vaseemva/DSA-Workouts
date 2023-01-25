package stack;

import java.util.EmptyStackException;

public class Stack {
	ListNode top;
	int length;
	
	private class ListNode{
		int data;
		ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			
		}
	}
	public Stack() {
		this.length=0;
		this.top=null;
	}
	
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length==0;
	}
	
	public void push(int data) {
		ListNode temp=new ListNode(data);
		temp.next=top;
		top=temp;
		length++;
	}
	
	public int pop() {
		
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int result=top.data;
		top=top.next;
		length--;
		return result;
	}
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.pop();
		System.out.println(stack.peek());
		
		
		
	}

}
