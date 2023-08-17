package codingtest;

 
import java.util.Arrays;
import java.util.Collections;

public class 최솟값만들기 {
	public static void main(String[] args) {
		int[] arr1 = {1,2};
		int[] arr2 = {3,4};

		int result = solution(arr1, arr2);
		System.out.println(result);
	}

	private static int solution(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int answer = 0;
		int mul = 0;
		int j = arr2.length - 1;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i = 0; i < arr1.length; i++) {
			mul = arr1[i] * arr2[j];
			answer += mul;
			j--;
		}
		return answer;
	}
}
