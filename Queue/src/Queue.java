
public class Queue {
	
	ListNode front;
	ListNode rear;
	int length;
	
	public Queue() {
		this.front=null;
		this.length=0;
		this.rear=null;
	}
	private class ListNode{
		int data;
		ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
			
		}
	}
		public int length() {
			return length;
		}
		public boolean isEmpty() {
			return length==0;
		}
		public void enqueue(int data){
			ListNode temp=new ListNode(data);
			if(isEmpty()) {
				front=temp;
			}else {
				rear.next=temp;
			}
			
			rear=temp;
			length++;
             }
		
		public void print() {
			if(isEmpty()) {
				return;
			}
			ListNode current=front;
			while(current!=null) {
				System.out.print(current.data+">>>");
				current=current.next;
			}
			System.out.print("null");
		}
		
	
	
	
	public static void main(String[] args) {
		Queue que=new Queue();
		
		que.enqueue(5);
		que.enqueue(6);
		que.enqueue(7);
		que.print();
	}

}
