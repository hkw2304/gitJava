package codingtest;

public class 숫자표현하기 {
	public static void main(String[] args) {
		int n = 6;
		int num = solution(n);
		System.out.println(num);
	}

	private static int solution(int n) {
		// TODO Auto-generated method stub
		int answer = 0;
		int sum = 0;
		for(int i = 1; i < n; i++) {
			sum = 0;
			for(int j = 1; j < n; j++) {
				sum += i + (j - 1);
				if(sum == n)
					answer++;
				else if(sum > n)
					break;
			}
		}
		return answer + 1;
	}
}
