package codingtest;

import java.util.Arrays;

public class 구명2 {
	public static void main(String[] args) {
		int[] people = {70,50,80,50};
		int limit = 100;
		int answer = dap(people, limit);
		System.out.println(answer);

	}

	private static int dap(int[] people, int limit) {
		// TODO Auto-generated method stub
		Arrays.sort(people);
		int startIdx = 0;
		int lastIdx = people.length - 1;
		int cnt = 0;
		int cnt2 = 0;
		int answer = 0;
		while (startIdx <= lastIdx) {
			while(people[startIdx] + people[lastIdx] <= limit) {
				lastIdx--;
				startIdx++;
				cnt++;
				if(startIdx >= lastIdx) {
					break;
				}
			}
			lastIdx--;
			cnt2++;
		}
		return answer = cnt + cnt2;
	}
}
