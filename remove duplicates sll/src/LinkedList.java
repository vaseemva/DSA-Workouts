
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
	public void print() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print("0");
		
	}
	public void removeDupl() {
		if(head==null) {
			return;
		}
		ListNode current =head;
		while(current!=null&&current.next!=null) {
			if(current.data==current.next.data) {
				current.next=current.next.next;
			}else {
				current=current.next;
			}
		}
	}
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.head=new ListNode(5);
		ListNode second=new ListNode(8);
		ListNode third=new ListNode(10);
		ListNode fourth=new ListNode(10);
		
		list.head.next=second;
		second.next=third;
		third.next=fourth;
		
		list.removeDupl();
		list.print();
	}

}
