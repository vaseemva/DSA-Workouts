package circularsll;

public class CLL {
	private ListNode last;
	private ListNode next;
	private int length;
	
	
	private class ListNode{
		int data;
		ListNode next;
		public ListNode(int data) {
			this.data=data;
		}
	}
	
	CLL(){
		last=null;
		length=0;
	}
	
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length==0;
	}
	
	public void createcll() {
		ListNode fir=new ListNode(25);
		ListNode sec=new ListNode(26);
		ListNode thi=new ListNode(27);
		ListNode fou=new ListNode(28);
		ListNode fif=new ListNode(29);
		
		fir.next=sec;
		sec.next=thi;
		thi.next=fou;
		fou.next=fif;
		fif.next=fir;
		
		last=fou;
		
	}
	public void printcsll() {
		if(last==null) {
			return;
		}
		ListNode first=last.next;
		while(first!=last) {
			System.out.print(first.data+"-->");
			first=first.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		CLL cll=new CLL();
		cll.createcll();
		cll.printcsll();
		
	}

}
