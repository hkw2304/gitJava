package datastrucure__search;

public class 보이어무어 {
	public static void main(String[] args) {
//		패턴의 마지막부터 비교한다.
//		1.
//		불일치 났을때의 문자가 패턴의 앞부분에 있을 경우 패턴의 해당 문자를 텍스트의
//		불일치 문자의 인덱스로 이동
//		
//		2.
//		패턴의 마지막 문자 불일치시 비교할 필요없이 다음 인덱스로 넘어간다.
		String str = "aacdead";
		String text = "ead";
		bbmMatch(str, text);
	}

	private static void bbmMatch(String str, String text) {
		// TODO Auto-generated method stub
		int pp = text.length() - 1;
		int pt = pp;
		int missIndex = 0;
		int cnt = 0;
		while(true) {
			if(str.charAt(pt) == text.charAt(pp)) {
				missIndex = pt;
				pp--;
				pt--;
				cnt++;
			}
			else if(cnt > 0) {
				pt += missIndex + 1;
				pp = text.length() - 1;
				cnt = 0;
				
			}
			else {
				pp = text.length() - 1;
				pt += 1;
				cnt = 0;
			}
			if(cnt == text.length()) {
				System.out.println("문자 찾기 성공!!");
				break;
			}
			else if(pt >= str.length()){
				System.out.println("해당 문자는 없습니다");
				break;
			}
		}
		
	}
}
