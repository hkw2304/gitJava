package codingtest;

import java.util.ArrayList;
import java.util.Arrays;

public class 이진변환반복 {
	static int cnt = 0;
	static int change = 0;
	public static void main(String[] args) {
		int[] arr = new int[2];
		String s = "1111111";
		zeroRemove(s);
		System.out.println(cnt + "====" + change);
	}

	private static void zeroRemove(String s) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split("")));
		if (list.contains("0")) {
			list.sort(null);
			while (list.get(0).equals("0")) {
				cnt++;
				list.remove(0);
			}
			int size = list.size();
			binary(size);
		} else {
			int size = list.size();
			binary(size);
		}

	}

	private static void binary(int size) {
		String s = "";
		change++;
		while (size != 0) {
			s += Integer.toString(size % 2);
			size /= 2;
		}
		if (s.equals("1")) {
			System.out.println(s);
			return;
		} else
			zeroRemove(s);
	}
}
