package reversearray;

public class Reversearray {
	public static void reversearr(int[]arr) {
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

	public  static void printarray(int[]arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
	
	public static void main(String[] args) {
		int[]array= {1,2,3,4,5};
		reversearr(array);
		printarray(array);
		
	}

}
