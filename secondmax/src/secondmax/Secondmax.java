package secondmax;

public class Secondmax {
	
	public static int secondmaximum(int[]arr) {
		int max=Integer.MIN_VALUE;
		int secindmax=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secindmax=max;
				max=arr[i];
			}else if(arr[i]>secindmax&&arr[i]<max) {
				secindmax=arr[i];
			}
		}
		return secindmax;
	}

	public static void main(String[] args) {
		int[]aray= {1,2,3,4,5,5,4,7};
		int second=secondmaximum(aray);
		System.out.println(second);
	}
	
}
