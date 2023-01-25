package pll;

public class LL {
	

	private static class ListNode{
		
		int data;
		ListNode next;
		
		public ListNode(int data) {
	        this.data=data;
			this.next=null;
		}
		
	}
	public static ListNode reverse(ListNode head) {
		if(head==null||head.next==null) {
			return head;
		}
		ListNode current=head;
		ListNode previous=null;
		ListNode next=null;
		
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		return previous;
		
	}
	
	
	public static void print(ListNode ll) {
		ListNode current=ll;
		
		while(current!=null) {
			System.out.print(current.data+"--->");
			current=current.next;
		}
		System.out.print("null");
	}
	
	public static ListNode addtofirst(ListNode head,int data) {
		ListNode newNode=new ListNode(data);
		newNode.next=head;
		head=newNode;
		return head;
		   }
	
	public static ListNode addtoLast(ListNode head,int data) {
		ListNode newNode=new ListNode(data);
		ListNode current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newNode;
		return head;
	}
	
	public static void printatposition(ListNode head,int pos) {
		int count=1;
		ListNode current=head;
		while(current!=null) {
			if(count==pos) {
				System.out.println(current.data);
				break;
			}
			
			current=current.next;
			count++;
		}
		
	
		
	}
	public static ListNode insertatp(ListNode head,int pos,int data) {
		
		
		ListNode newNode=new ListNode(data);
		if(head==null) {
			head=newNode;
		}
		
		if(pos==1) {
			newNode.next=head;
			head=newNode;
			return head;
		}
		int count=1;
		ListNode previous=head;
		while(count<pos-1) {
			previous=previous.next;
			count++;
		}
		ListNode current=previous.next;
		newNode.next=current;
		previous.next=newNode;
		
		return head;
		
		
	}
	
	public static ListNode removeatbeg(ListNode head) {
		
		ListNode temp=head;
		head=head.next;
		temp.next=null;
		System.out.println("removed "+temp.data);
		return head;
		
	}
	public static ListNode removeatlast(ListNode head){
		if(head==null||head.next==null) {
			return head;
		}
		
		ListNode current=head;
		ListNode previous =null;
		while(current.next!=null) {
			previous=current;
			current=current.next;
		}
		 
		previous.next=null;
		return head;
		
		
	}
	
	public static int largest(ListNode ll) {
		ListNode current=ll;
		int largest=ll.data;
		while(current!=null) {
			if(current.data>largest) {
				largest=current.data;
			}
			current=current.next;
		}
		return largest;
	}
	
	
	
	public static void main(String[] args) {
		
		ListNode head=new ListNode(5);
		ListNode second=new ListNode(6);
		ListNode third=new ListNode(7);
		ListNode fourth=new ListNode(8);
		ListNode newnode=new ListNode(4);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		
//		head=addtofirst(head, 4);
//		newnode.next=head;
//		head=newnode;
//	  head=	addtoLast(head, 45);
//		
//		
//		head=removeatbeg(head);
//		head=removeatlast(head);
//		print(head);
//		System.out.println();
//		head=insertatp(head, 3, 100);
//		print(head);
//		System.out.println();
//		head=reverse(head);
//		print(head);
//		System.out.println();
//		
//		printatposition(head, 3);
		
		int largets=largest(head);
		System.out.println(largets);
		
		
		
		
		
	}
	
}
