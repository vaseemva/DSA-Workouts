package addtotheendll;



public class LinkedList {
	
	NodeMon head;
	private static class NodeMon{
		int data;
		NodeMon next;
		
		NodeMon(int data){
		this.data=data;
		this.next=null;
		}
	}
	public void Print() {
		NodeMon current = head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print("null");
	}
	
	public void addtoLast(int value) {
		NodeMon newNode=new NodeMon(value);
		if(head==null) {
			head=newNode;
			return;
		}
		NodeMon current=head;
		
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newNode;
		
	}
	
	public static void main(String[] args) {
		LinkedList lis=new LinkedList();
		lis.head=new NodeMon(10);
		NodeMon second = new NodeMon(2);
		NodeMon third=new NodeMon(5);
		lis.head.next=second;
		second.next=third;
		lis.addtoLast(56);
		lis.addtoLast(56);
		lis.addtoLast(75);
		lis.Print();
		
	}

}
