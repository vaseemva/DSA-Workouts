import org.w3c.dom.NodeList;

public class LinkedList {
	
	ListNode head;
	
	private static class ListNode{
		int data;
		ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
		
	}
	public int length() {
		if(head==null) {
			return 0;
		}
		ListNode current=head;
		int count=0;
		while(current!=null) {
			count++;
			current=current.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.head=new ListNode(10);
		ListNode second=new ListNode(15);
		ListNode third=new ListNode(20);
		
		list.head.next=second;
		second.next=third;
		
		System.out.println("The count is "+list.length());
		
	}
	

}
