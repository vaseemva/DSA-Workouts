
public class LinkedList {
	Listnode head;
	
	private static class Listnode{
		int data;
		Listnode next;
		Listnode(int data){
			this.data=data;
			this.next =null;
		}
	}
	
   public void print() {
	   Listnode current=head;
	   while(current!=null) {
		   System.out.print(current.data+"-->");
		   current=current.next;
	   }
	   System.out.print("null");
   }
   
   public Listnode removefirst() {
	   if(head==null) {
		   return null;
	   }
	   Listnode temp=head;
	   head=head.next;
	   temp.next=null;
	   System.out.println("removed"+temp.data);
	   return head;
	   
   }
	
	public static void main(String[] args) {
		LinkedList lis=new LinkedList();
		lis.head=new Listnode(56);
		Listnode second = new Listnode(76);
		Listnode third=new Listnode(23);
		 
		lis.head.next=second;
		second.next=third;
		lis.print();
		System.out.println();
		System.out.println(lis.removefirst().data);
		lis.print();
		
		
		
	}

}
