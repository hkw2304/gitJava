package datastrucure__search;

public class Kmp2 {
	public static void main(String[] args) {

//	접두부 : 문자열의 왼쪽에서 시작
//	접미부 : 문자열에서 오른쪽에서 시작
//	경계 : 접두부와 접미부가 같은 경우 이 떄의 접두부와 접미부를 말한다.
		
//		1.처음 찾으려는 문자열의 접두부, 접미부를 찾는다.
//		abacabaacabacabac
//		abacabac
//		접두부 : aba, 접미부 : aba, 경계 : aba
//		경계의 길이가 최대가 될 때까지 찾는다.
//		2.접두부, 접미부의 경계를 찾고나서 인덱스를 접미부의 처음으로 옮긴다.
//		3.전부 불일치하면 맨 처음 불일치가 일어난 곳으로 이동
//		4.반복
		String parent = "applebananaorange";
		String pattern = "or";
		kmp(parent, pattern);
	}
	public static void kmp(String parent, String pattern) {
		int[] table = makeTable(pattern);
		char[] parents = parent.toCharArray();
		char[] patterns = pattern.toCharArray();
		int k = 0;
		for(int i = 0; i < parents.length; i++) {
			while(k > 0 && parents[i] != patterns[k]) {
				k = table[k - 1];
			}
			if(parents[i] == patterns[k]) {
				if(k == patterns.length - 1) {
					System.out.println((i - patterns.length +2) + "번째에서 찾음");
					k = table[k];
					return;
				}
				else
					k++;
			}
		}
		System.out.println("찾으려는 pattern이 없습니다.");
	}
	private static int[] makeTable(String pattern) {
		// TODO Auto-generated method stub
		char[] patterns = pattern.toCharArray();
		int[] table = new int[patterns.length];
		int k = 0;
		for(int i = 1; i < patterns.length; i++) {
			while(k > 0 && patterns[i] != patterns[k]) {
				k = table[k - 1];
			}
			if(patterns[i] == patterns[k])
				table[i]  = ++k;
		}
		return table;
	}
}
