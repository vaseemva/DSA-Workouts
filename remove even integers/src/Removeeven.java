public class Removeeven {
	
	public  static void printarray(int[]arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
	
	public static int[] remove(int[]array) {
		int n=array.length;
		int odd=0;
		for(int i=0;i<n;i++) {
			if(array[i]%2==0) {
				odd++;
			}
		}
		int[] resultarray=new int[odd];
		int index=0;
		for(int i=0;i<n;i++) {
			if(array[i]%2==0) {
				resultarray[index]=array[i];
				index++;
			}
		}
		return resultarray;
		
	}
	
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5};
		int []removedarray=remove(arr);
		printarray(removedarray);
	}

}
