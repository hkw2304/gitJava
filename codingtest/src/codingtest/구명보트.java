package codingtest;

import java.util.Arrays;

public class 구명보트 {
	public static void main(String[] args) {
		int[] people = {100, 50, 50};
		int limit = 130;
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
		loop:while (startIdx <= lastIdx) {
			while(people[startIdx] + people[lastIdx] <= limit) {
				lastIdx--;
				startIdx++;
				cnt++;
				if(startIdx == lastIdx) {
					cnt++;
					break loop;
				}
				else if(startIdx > lastIdx) {
					break loop;
				}
			}
			lastIdx--;
			cnt2++;
		}
		return cnt + cnt2;
	}
}
