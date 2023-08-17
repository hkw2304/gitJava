package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class 큰숫자찾기 {

	public static void main(String[] args) {
		int n = 78;
		int answer = solution(n);
		System.out.println(answer);
	}

	private static int solution(int n) {
		// TODO Auto-generated method stub
//		cnt = (int) binary.chars().filter(c -> c == '1').count();
		int comNum = n;
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> comArr = new ArrayList<>();
//		String binary = "";
//		String comBinary = "";
		int temp = comNum;
		while (n > 0) {
			if (n % 2 == 1)
				arr.add(n % 2);
//				binary += Integer.toString(n % 2);
			n /= 2;
		}
		while (true) {
			temp++;
			comNum = temp;
//			comBinary = "";
			while (comNum > 0) {
				if (comNum % 2 == 1)
					comArr.add(comNum % 2);
//					comBinary += Integer.toString(comNum % 2);
				comNum /= 2;
			}
			if(arr.size() == comArr.size())
				return temp;
			comArr.removeAll(comArr);
		}

	}

}
