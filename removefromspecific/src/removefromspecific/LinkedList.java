package removefromspecific;



public class LinkedList {
	private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		 public ListNode(int data) {
		      this.data = data;
		      this.next = null;
		    }
	}
	public void displayLL() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
	  System.out.print("null");	
	}
	
	public void removespecific(int position) {
		if(position==1) {
			head=head.next;
		}
		int count =1;
		ListNode previous=head;
		while(count<position-1) {
			previous=previous.next;
			count++;
		}
		
		ListNode current=previous.next;
		previous.next=current.next;
	}
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode newNode=new ListNode(50);
		
		
		list.head.next=second;
		second.next=third;
		newNode.next=list.head;
		list.head=newNode;
		list.removespecific(3);
		
		list.displayLL();
	}

}
