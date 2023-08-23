package datastrucure;

import java.util.Scanner;

public class Bruteforce2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("text : ");
		String str1 = sc.next();
		
		System.out.print("searchPettern : ");
		String str2 = sc.next();
		
		int firstIndex = str1.indexOf(str2);
//		System.out.println(firstIndex);
		int lastIndex = str1.lastIndexOf(str2);
//		System.out.println(lastIndex);
		if(firstIndex == - 1) {
			System.out.println("No search Text!!");
		}
		else {
			int len1 = 0;
			for(int i = 0; i < firstIndex; i++) {
				len1 += str1.substring(i, i + 1).getBytes().length;
			}
			len1 +=  str2.length();
			
			int len2 = 0;
			for(int i = 0; i < lastIndex; i++) {
				len2 += str1.substring(i, i + 1).getBytes().length;
			}
			len2 += str2.length();
			
			System.out.println("text : " + str1);
			System.out.printf(String.format("패 턴 : %%%ds\n", len1), str2);
			System.out.println("text : " + str1);
			System.out.printf(String.format("패 턴 : %%%ds\n", len2), str2);
		}
	}

}
