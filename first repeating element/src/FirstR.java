import java.util.HashMap;
import java.util.Map;

public class FirstR {
	public static int fir(int []arr) {
		Map<Integer, Integer>counts=new HashMap<>();
		for(int i=0;i< arr.length;i++) {
			if (counts.containsKey(arr[i])) {
				return arr[i];
			}else {
				counts.put(arr[i], 1);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		FirstR hh=new FirstR();
		int[]arr= {1,2,1,5,6,6};
		
		
		System.out.println(hh.fir(arr));
		
	}

}
