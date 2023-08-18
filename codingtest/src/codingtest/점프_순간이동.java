package codingtest;

import java.util.ArrayList;

public class 점프_순간이동 {
	public static void main(String[] args) {
		int n = 6;
		int answer = dap(n);

		System.out.println(answer);
	}

	private static int dap(int n) {
		// TODO Auto-generated method stub
		if (n == 1 || n == 2)
			return 1;
		else if (n == 3)
			return 2;
		ArrayList<Integer> arr = new ArrayList<>();
		int temp = n;
		while (temp > 3) {
			if(temp / 2 == 2)
				break;
			arr.add(temp /= 2);
		}
		int len = arr.size() - 1;
		int i = 2;
		int cnt = 1;
		while (true) {
			if(i * 2 == n)
				break;
			else if((i + 1) * 2 == n) {
				cnt++;
				break;
			}
			else if((i * 2) + 1 == n) {
				cnt++;
				break;
			}
			if(i * 2 == arr.get(len)) {
				i *= 2;
				len--;
			}
			else if(i + 1 == arr.get(len)) {
				i++;
				cnt++;
				i++;
				i *= 2;
				cnt++;
				len--;
			}
			else if(i * 2 + 1 ==arr.get(len)) {
				cnt++;
				len--;
				i *= 2;
				i++;
			}
		}
		return cnt;
	}
}
