package codingtest;

import java.util.ArrayList;

public class 점프_순간이동 {
	public static void main(String[] args) {
		int n = 1;
		int answer = dap(n);
		System.out.println(answer);
	}

	private static int dap(int n) {
		ArrayList<Integer> arr = new ArrayList<>();
		if(n == 1)
			return 1;
		for(int i = n; i > 1; i /= 2) {
			arr.add(i / 2);
		}
		int i = 0;
		int cnt = 0;
		int len = arr.size() - 1;
		while(true) {
			if(i + 1 == arr.get(len)) {
				i++;
				cnt++;
			}
			if(i == n) {
				return cnt;
			}
			else if(i * 2 == n) {
				return cnt;
			}
			else if(i * 2 + 1 == n) {
				return cnt + 1;
			}
			if(i == arr.get(len)) {
				i *= 2;
				len--;
			}
			
		}
		
	}
}
