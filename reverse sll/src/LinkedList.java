
public class LinkedList {
	
//Listnode head;
	
	private static class Listnode{
		int data;
		Listnode next;
		Listnode(int data){
			this.data=data;
			this.next =null;
		}
	}
	
   public  void print(Listnode hi) {
	   Listnode current=hi; 
	   while(current!=null) {
		   System.out.print(current.data+"-->");
		   current=current.next;
	   }
	   System.out.print("null");
   }
   
     public Listnode revverse(Listnode heads) {
    	 if(heads==null) {
    		 return heads;
    	 }
    	 Listnode current =heads;
    	 Listnode next=null;
    	 Listnode previous=null;
    	 
    	 while(current!=null) {
    		 next=current.next;
    		 current.next=previous;
    		 previous=current;
    		 current=next;
    	 }
    	 return previous;
     }
	
	public static void main(String[] args) {
		LinkedList lis=new LinkedList();
		Listnode head=new Listnode(56);
		Listnode second = new Listnode(76);
		Listnode third=new Listnode(23);
		
		head.next=second;
		second.next=third;
		
	Listnode rev=lis.revverse(head);
	
	lis.print(rev);
		
		
		
		
		
	}


}
