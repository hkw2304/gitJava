package codingtest;

import java.util.Arrays;

public class 피보나치수 {
	public static void main(String[] args) {
		int n = 1500;
		int num = fibo(n);
		System.out.println(num);
	}

	private static int fibo(int n) {
		// TODO Auto-generated method stub
		int[] arr = new int[n];
		arr[0] = 1 % 1234567;
		arr[1] = 1 % 1234567;
		for(int i = 2; i < arr.length; i++) {
			arr[i] = ((arr[i - 2] % 1234567) + (arr[i - 1] % 1234567)) % 1234567;
		}
		return arr[n - 1];
		
	}
}
