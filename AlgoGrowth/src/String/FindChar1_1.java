package String;

import java.util.Scanner;

/**
 * 설명
 * 
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 * 
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 * 
 * 
 * 입력
 * 
 * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
 * 
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 * 
 * 
 * 출력
 * 
 * 첫 줄에 해당 문자의 개수를 출력한다.
 */
public class FindChar1_1 {

	// 프로그래머스 방식
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase(); // 대문자
		t = Character.toUpperCase(t); // 대문자

		// for (int i = 0; i < str.length(); i++) {
		// if (str.charAt(i) == t) {
		// answer = str.charAt(i);
		// }
		// }

		// 문자 배열 생성 toCharArray
		for (char x : str.toCharArray()) {
			if (x == t)
				answer++;
		}

		return answer;
	}

	// 백준 방식
	public static void main(String[] args) {
		FindChar1_1 T = new FindChar1_1();
		Scanner sc = new Scanner(System.in);

		// 입력
		String str = sc.next(); // 문자열을 읽음
		char c = sc.next().charAt(0); // 문자 하나
		System.out.println(T.solution(str, c));

		sc.close();

	}

}
