

public class DoublyLinkedLists {
	ListNode head;
	ListNode tail;
	int length;
	
	
	private class ListNode{
		int data;
		ListNode previous;
		ListNode next;
		public ListNode(int data) {
			this.data=data;
		}
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	public DoublyLinkedLists() {
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	public void printDllForward() {
		ListNode temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"--->");
			temp=temp.next;
		}
		System.out.print("null");
	}
	
	public void insertatBeginn(int value) {
		ListNode newNode=new  ListNode(value);
		
		if(isEmpty()) {
			tail=newNode;
		}else {
			head.previous=newNode;
			
		}
		newNode.next=head;
		head=newNode;
	}
	public static void main(String[] args) {
		DoublyLinkedLists dll=new DoublyLinkedLists();
		
		dll.insertatBeginn(5);
		dll.insertatBeginn(6);
		dll.insertatBeginn(7);
		dll.insertatBeginn(8);
		dll.printDllForward();
		
	}

}
