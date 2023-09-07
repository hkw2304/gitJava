package datastrucure__search;

import java.util.Scanner;

import javax.naming.directory.SearchControls;

public class Kmp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("text : ");
		String text = sc.next();
		System.out.print("searching text : ");
		String searchText = sc.next();
		
		int num = kmp(text, searchText);
		if(num == -1) {
			System.out.println("No searching text!!!");
		}
		else {
			System.out.println(num + "exist");
		}
	}

	private static int kmp(String text, String searchText) {
		// TODO Auto-generated method stub
		int textPtr = 1;
		int searchPtr = 0;
		int[] skip = new int[searchText.length() + 1];
		skip[textPtr] = 0;
		
		while(textPtr != searchText.length()) {
			if(searchText.charAt(textPtr) == searchText.charAt(searchPtr)) {
				skip[++textPtr] = ++searchPtr;
			}
			else if(searchPtr == 0) {
				skip[++textPtr] = searchPtr;
			}
			else {
				searchPtr = skip[searchPtr];
			}
		}
		textPtr = searchPtr = 0;
		while(textPtr != text.length() && searchPtr != searchText.length()) {
			if(text.charAt(textPtr) == searchText.charAt(searchPtr)) {
				textPtr++;
				searchPtr++;
			}else if(searchPtr == 0) {
				textPtr++;
			}
			else {
				searchPtr = skip[searchPtr];
			}
		}
		if(searchPtr == searchText.length()) {
			return textPtr - searchPtr + 1;
		}
		return -1;
	}
}
