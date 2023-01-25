package addtostart;

public class LinkedList {
	private ListNode head;
	
	private static class ListNode{
	 int data;
	 ListNode next;
	 
	 public ListNode(int data) {
		 this.data=data;
		 this.next=null;
	 }
	}
	
	public void addTostart(int value) {
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;
	}
	
	public void Print() {
		ListNode current = head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(20);
		
		list.head.next=second;
		second.next=third;
		list.addTostart(5000);
		list.addTostart(15);
		list.addTostart(78);
		list.Print();
	}
	
	

}
