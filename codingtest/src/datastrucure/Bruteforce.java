package datastrucure;

import java.util.Scanner;

public class Bruteforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("text : ");
		String text = sc.next();
		System.out.print("searching text : ");
		String search = sc.next();
		
		int index = match(text, search);
		
		if(index == -1) {
			System.out.println("text no");
		}
		else {
			int len = 0;
			for(int i = 0; i < index; i++) {
				len += text.substring(i, i + 1).getBytes().length;
			}
			len += search.length();
			
			System.out.println((index + 1) + "번째 문자부터 일치합니다.");
			System.out.println("text : " + text);
			System.out.printf(String.format("pattern : %%%ds\n", len), search);
		}

	}
	private static int match(String text, String search) {
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
		}
		if(searchPointer == search.length()) {
			return textPointer - searchPointer;
		}
		return -1;
	}

}
