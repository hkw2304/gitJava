package codingtest;

import java.util.Stack;

public class 같은문자짝짓기 {
//	commit test!!!
	public static void main(String[] args) {
		String s = "cdcd";
		int answer = searchTwo(s);
		System.out.println(answer);
	}

	private static int searchTwo(String s) {
		// TODO Auto-generated method stub
		if (s.length() % 2 == 1)
			return 0;
		Stack<Character> stack = new Stack<>();
		stack.push(s.charAt(0));
		for (int i = 1; i < s.length();i++) {
			if(stack.empty()) {
				stack.push(s.charAt(i));
				continue;
			}
			if (stack.peek().equals(s.charAt(i))) {
				stack.pop();
				continue;
			} 
			stack.push(s.charAt(i));
		}
		return stack.empty()? 1: 0;
	}
}
