package dll;

public class DoublyLinkedList {
	
	ListNode head;
	ListNode tail;
	private int length;
	
	private class ListNode{
		int data;
		private ListNode previous;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
		}
	}
	
	public DoublyLinkedList() {
		this.head=null;
		this.tail=null;
		this.length=0;
	}
   public boolean isEmpty() {
return length==0;
}
public int length() {
	return length;
}   

public void insertLast(int value) {
	ListNode newNode= new ListNode(value);
	if(isEmpty()) {
		head=newNode;
	}else {
		tail.next=newNode;
	}
	newNode.previous=tail;
	tail=newNode;
	length++;
	
}

public void printDllForward() {
	ListNode temp=head;
	while(temp!=null) {
		System.out.print(temp.data+"--->");
		temp=temp.next;
	}
	System.out.print("null");
}

public void displayBackward() {
	if(tail==null) {
		return;
	}
	ListNode temp=tail;
	while(temp!=null) {
		System.out.print(temp.data+"-->");
		temp=temp.previous;
	}
	System.out.print("null");
}

public static void main(String[] args) {
	DoublyLinkedList dll=new DoublyLinkedList();
	dll.insertLast(45);
	dll.insertLast(46);
	dll.insertLast(47);
	dll.insertLast(48);
	dll.printDllForward();
	System.out.println();
	dll.displayBackward();
}
}
