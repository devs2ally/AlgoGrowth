
package String;

import java.util.*;

/**
 * 설명
 * 
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 
 * 문장속의 각 단어는 공백으로 구분됩니다.
 * 
 * 1. 공백 먼저 찾기 == 단어먼저구하기 2.
 * 
 * 입력
 * 
 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 * 
 * 
 * 출력
 * 
 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
 * 
 */
public class StrIntoChar {

	public String solution(String str) {
		String answer = "";

		// 1. 최대값 구하기 공식
		// int min = Integer.MIN_VALUE;
		// String[] s = str.split(" ");
		// for (String x : s) {
		// int len = x.length();
		// if (len > min) {
		// min = len;
		// answer = x;
		// }
		// }

		// 2. IndexOf, substring 로 구하기
		// 보통 어떤 값과 비교해서 최솟값을 찾아야 할 때 초기값
		int min = Integer.MIN_VALUE, pos; // int min = Integer.MIN_VALUE; 와 int pos; 를 합쳐놓은 것과 같음
		// indexOf 설명
		// indexOf는 str문자열에서 첫 번째 공백이 나오는 위치(인덱스)를 찾음
		// 공백을 찾았다면 해당 위치 인덱스로 반환
		// 찾지 못했다면 -1로 반환
		while ((pos = str.indexOf(" ")) != -1) { // 띄어쓰기 위치를 리턴
			String tmp = str.substring(0, pos); // pos전까지 자름 it is time study
			int len = tmp.length();
			if (len > min) { // 같거나 큰거를 찾으면 안됨 큰것만
				min = len;
				answer = tmp;
			}
			str = str.substring(pos + 1); // pos = 띄어쓰기, 다음 띄어쓰기를 찾아서
		}
		if (str.length() > min)
			answer = str;
		return answer;
	}

	public static void main(String[] args) {
		StrIntoChar T = new StrIntoChar();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
		sc.close();
	}

}
