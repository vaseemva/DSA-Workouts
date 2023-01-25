public class CheckPali {
	 public static boolean checkPalindrome(String word){
	        char[]array=word.toCharArray();
	        int start=0;
	        int end=array.length-1;
	        while(start<end){
	            if (array[start]!=array[end]) {
	                return false;
	            }
	            start++;
	            end--;
	        }
	        return true;
	        
	    }
	
	public static void main(String[] args) {
		 String word="madam";
		    
			System.out.println(checkPalindrome(word));
		
	}

}
