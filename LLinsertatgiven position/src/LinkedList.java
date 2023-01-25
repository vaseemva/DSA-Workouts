import org.w3c.dom.NodeList;



public class LinkedList {
  ListNode head;
  private static class ListNode{
	int data;
	ListNode next;
	
	ListNode(int data){
		this.data=data;
		this.next=null;
	}
  }
  
  public void addatposition(int data,int position) {
	  ListNode newNode=new ListNode(data); 
	  if(position==1) {
		 newNode.next=head;
		 head=newNode;
	  }
	  ListNode previous=head;
	  int count=1;
	  while(count<position-1) {
		  previous=previous.next;
		  count++;
	  }
	  ListNode current=previous.next;
	  newNode.next=current;
	  previous.next=newNode;
	  
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
	LinkedList lis=new LinkedList();
	lis.head=new ListNode(45);
	ListNode second=new ListNode(4);
	ListNode third=new ListNode(56);
	lis.head.next=second;
	second.next=third;
	
	lis.addatposition(25, 3);
	lis.displayLL();
	
	
	
}
}
