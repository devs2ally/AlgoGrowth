package String;

import java.util.*;

public class FindChar {

	// 프로그래머스 방식
	public int solution(String str, char t) {
		int answer=0;
		str = str.toUpperCase(); // 대문자
		t = Character.toUpperCase(t); // 대문자
		
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == t) {
//				answer = str.charAt(i);
//			}
//		}
		
		// 문자 배열 생성 toCharArray
		for (char x : str.toCharArray()) {
			if (x == t) answer++;
		}
		
		return answer;
	}
	
	// 백준 방식
	public static void main(String[] args) {
		FindChar T = new FindChar();
		Scanner sc = new Scanner(System.in);
		
		// 입력
		String str = sc.next(); // 문자열을 읽음
		char c = sc.next().charAt(0); //문자 하나
		System.out.println(T.solution(str, c));
		
	}
	
	
	
	
	
	
}
