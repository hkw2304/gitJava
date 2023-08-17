package codingtest;


import java.util.LinkedList;
import java.util.Queue;

public class 올바른괄호찾기 {

	public static void main(String[] args) {
		String s = "(()(";
		
		boolean answer = solution(s);
		System.out.println(answer);
//		(())(), ()()()((())()()()()(
		
	}
	private static boolean solution(String s) {
		// TODO Auto-generated method stub
		boolean answer = true;
		int cnt = 0;
        if(s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(' || s.length() % 2 == 1) {
			return answer = false;
        }
//        if(s.charAt(0) == s.charAt(s.length() - 1))
//			return answer = false;
        int i = 0;
		while(i < s.length()) {
			if(s.charAt(i) == '(') 
				cnt++;
			else if(cnt > 0 && s.charAt(i) == ')' )
				cnt--;
			else if(cnt  <= 0 && s.charAt(i) == ')' )
				return answer = false;
			
            i++;
		}
		return answer;
		
	}
}
