package datastrucure;

import java.util.Scanner;

public class Bruteforce {
	static int cnt = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("text : ");
		String text = sc.next();
		System.out.print("searching text : ");
		String search = sc.next();
		
		char index = match(text, search);
		
		if(index == 0) {
			System.out.println("text no");
		}
		else {
//			int len = 0;
//			for(int i = 0; i < index; i++) {
//				len += text.substring(i, i + 1).getBytes().length;
//			}
//			len += search.length();
//			System.out.println((index + 1) + "번째 문자부터 일치합니다.");
//			System.out.println("text : " + text);
//			System.out.printf(String.format("pattern : %%%ds\n", len), search);
//			System.out.println("비교 횟수 : " + cnt);
			System.out.println("마지막 값 : " + index);
			
		}

	}
	private static char match(String text, String search) {
		// TODO Auto-generated method stub
		int textPointer = 0;
		int searchPointer = 0;
		while(textPointer != text.length() && searchPointer != search.length()) {
			if(text.charAt(textPointer) == search.charAt(searchPointer)) {
				textPointer++;
				searchPointer++;
				
			}else {
				textPointer = textPointer - searchPointer + 1;
				searchPointer = 0;
			}
			cnt++;
		}
		if(searchPointer == search.length()) {
			return search.charAt(searchPointer - 1);
		}
		return 0;
	}
}
