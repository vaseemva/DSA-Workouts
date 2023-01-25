package minimumint;

public class MinInt {

	public  static void printarray(int[]arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
	
	public static int minint(int[]arr) {
		int n=arr.length;
		int min=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
		
	}
	
	public static void main(String[] args) {
		int[]array= {10,200,30,40,50,70,5};
      int	minimum=minint(array);
      System.out.println(minimum);
		
	}
	
	
}
