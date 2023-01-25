import org.w3c.dom.Node;

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
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode newNode=new ListNode(50);
		
		
		list.head.next=second;
		newNode.next=list.head;
		list.head=newNode;
		list.displayLL();
		
	}
	

}
