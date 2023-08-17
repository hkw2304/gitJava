package codingtest;

public class 카펫수 {
	public static void main(String[] args) {
		int brown = 16;
		int yellow = 9;
		int[] answer = dap(brown, yellow);
		System.out.println(answer[0] + "/////" + answer[1]);
	}

	private static int[] dap(int brown, int yellow) {
		// TODO Auto-generated method stub
		int[] answer = new int[2];
		int width = 0;
		int height = 0;
		while (true) {
			width = yellow + 2;
			height += 2;
			if (brown == width * 2 + height) {
				answer[0] = width;
				answer[1] = height + 1;
				return answer;
			} else {
				width = 0;
				height = 0;
				while (true) {
					int num;
					int num2;
					for(int i = 2; i < yellow; i++) {
						num = yellow /i;
						width = num + 2;
						if(num >= i && yellow % i == 0) {
							num2 = yellow / num;
							for(int j = 0; j < num2; j++) {
								height += 2;
							}
							if (brown == width * 2 + height) {
								
								answer[0] = width;
								answer[1] = num2 + 2;
								return answer;
							}
							
						}
						height = 0;
					}
				}
			}
		}
	}
}
