
public class BinarySearch {
	
	public static int binarySearch(int[]arr,int key) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			if(key<arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
			
		}
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		int[]array= {1,2,3,4,5};
		System.out.println(binarySearch(array, 4));
		System.out.println(binarySearch(array, 7));
	}

}
