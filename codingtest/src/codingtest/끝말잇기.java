package codingtest;

public class 끝말잇기 {
	public static void main(String[] args) {
		int[] answer = new int[2];
		int n = 2;
		String[] words = {"ac", "ca", "ac", "ac"};
		answer = dap(n, words);
		System.out.println(answer[0] + "///////////" + answer[1]);
	}

	private static int[] dap(int n, String[] words) {
		// TODO Auto-generated method stub
		int[] answer = new int[2];
		int lastIdx;
		int cnt = 1;
		int cnt2 = 1;
		String temp = "";
		for(int i = 0; i < words.length; i++) {
			lastIdx = words[i].length() - 1;
			if(i > 0) {
				temp = words[i];
				for(int j = i - 1; j >= 0; j--) {
					if(words[j].equals(temp)) {
						answer[0] = cnt;
						answer[1] = cnt2;
						return answer;
					}
				}
			}
			if(i < words.length-1 && words[i].charAt(lastIdx) != words[i + 1].charAt(0)) {
				cnt++;
				if(cnt > n) {
					cnt = 1;
					cnt2++;
				}
				answer[0] = cnt;
				answer[1] = cnt2;
				return answer;
			}
			cnt++;
			if(cnt > n)
				cnt = 1;
			cnt2 = ((i  + 1) / n) + 1;
		}
		return answer;
	}
}
