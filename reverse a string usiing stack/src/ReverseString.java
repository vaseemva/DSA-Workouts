import java.util.Stack;

public class ReverseString {
	
	public String reverse(String str) {
		Stack<Character>stack=new Stack<>();
		char[] charas=str.toCharArray();
		for(char c : charas) {
			stack.push(c);
		}
		for(int i=0;i<charas.length;i++) {
			charas[i]=stack.pop();
		}
		return new String(charas);
		
	}
	public static void main(String[] args) {
		ReverseString res=new ReverseString();
		String vas="vaseem";
		
		System.out.println("before    "+vas);
		System.out.println("after     "+res.reverse(vas));
		
		
	}

}
